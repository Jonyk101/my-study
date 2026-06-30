package home.ex;

import com.kh.Cafe;

public class Run {
    public static void main(String[] args){
        Cafe cf1 = new Cafe();

        cf1.setCafeName("메가커피");
        cf1.setLocation("역삼역점");
        cf1.setMenu("아이스 아메리카노");
        cf1.setPrice(2500);
        cf1.setEmployeeNum(4);

        Cafe cf2 = new Cafe("바나프레소", "강남 3호점", "크리미라떼", 4300, 7);

        cf1.inform();
        cf2.inform();

    }
}
