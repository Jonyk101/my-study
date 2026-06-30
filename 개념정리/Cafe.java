package com.kh;

public class Cafe {
    private String cafeName, menu, location;
    private int price, employeeNum;

    public Cafe(){

    }
    public Cafe(String cafeName, String location, String menu, int price, int employeeNum){
        this.cafeName = cafeName;
        this.location = location;
        this.menu = menu;
        this.price = price;
        this.employeeNum = employeeNum;
    }

    public String getCafeName() {
        return cafeName;
    }
    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }
    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void inform() {
        System.out.printf("카페명: %s 지점명: %s 메뉴명: %s 가격: %d 직원수: %d\n", this.cafeName, this.location, this.menu, this.price, this.employeeNum);
    }

}
