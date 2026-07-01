package shop.controller;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import shop.model.Customer;
import shop.model.Order;
import shop.model.Product;
import shop.model.pay.Payment;

public class ShopController {
    private List <Customer> customers = new ArrayList<>();
    private List <Product> products = new ArrayList<>();
    private Customer loggedInUser = null;
    private List <Product> cart = new ArrayList<>();
    private final String FILE_PATH = "products.csv";

    public ShopController() {
        loadProductsFromCSV();
    }

    public void startShopping() {

    }
    public boolean login(String id, String password) {
        for (Customer c : customers) {
            if (c.getId().equals(id) && c.getPw().equals(password)) {
                loggedInUser = c; return true;
            }
        }
        return false;
    }

    public void signUp(String id, String password, String name, String phoneNum) {
        String signDate = LocalDate.now().toString();
        customers.add(new Customer(id, password, name, phoneNum, signDate));
    }

    public void logout() {
        this.loggedInUser = null; this.cart.clear();
    }

    public Customer getLoggedInUser() {
        return loggedInUser;
    }

    public void loadProductsFromCSV() {
        products.clear();
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data.length >= 5) {
                    products.add(new Product(data[0].trim(), data[1].trim(), data[2].trim(),
                            Integer.parseInt(data[3].trim()), Integer.parseInt(data[4].trim())));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("[에러] 상품 정보를 불러오는데 실패했습니다.");
        }
    }

    public void saveProductsToCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Product p : products) {
                bw.write(p.getPCode() + "," + p.getPName() + "," + p.getCategory() + "," + p.getPrice() + "," + p.getStock());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("상품 정보를 파일에 저장하는데 실패했습니다.");
        }
    }

    public List<Product> getProducts() { return products; }
    public List<Product> getCart() { return cart; }

    public boolean addCart(String pCode) {
        for (Product p : products) {
            if (p.getPCode().equals(pCode)) {
                if (p.isSoldOut()) {
                    System.out.println("해당 상품은 품절되었습니다.");
                    return false;
                }
                cart.add(p); return true;
            }
        }
        return false;
    }

    public void removeCart(String pCode) {
        cart.removeIf(p -> p.getPCode().equals(pCode));
    }

    public void processCheckout(Payment payment, int usePoint) {
        int total = cart.stream().mapToInt(Product::getPrice).sum();
        int discountAmount = (int)(total * 0.1); // 기본 10% 할인
        int finalAmount = total - discountAmount - usePoint;
        if(finalAmount < 0) finalAmount = 0;

        // 선택된 결제 수단(현금, 카드, 페이)에 따른 처리 (다형성)
        if (payment.processPay(finalAmount)) {
            // 포인트 처리 로직
            loggedInUser.usePoint(usePoint);
            loggedInUser.addPoint((int)(finalAmount * 0.01)); // 결제금의 1% 적립

            // 재고 감소 로직
            for (Product item : cart) {
                for (Product p : products) {
                    if (p.getPCode().equals(item.getPCode())) { p.decreaseStock(); break; }
                }
            }
            saveProductsToCSV(); // 변경된 재고 파일에 저장
            cart.clear(); // 결제 완료 후 장바구니 비우기
        }
    }

}