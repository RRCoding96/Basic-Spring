package SpringExample.inflearn.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!
//    }

    // 위의 코드를 아래와 같이 하면 공유 문제를 해결할 수 있다.
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
