package SpringExample.inflearn.order;

public interface OrderService {

    /**
     * 주문 생성하는 기능
     * @param memberId
     * @param itemName
     * @param itemPrice
     * @return
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);


}
