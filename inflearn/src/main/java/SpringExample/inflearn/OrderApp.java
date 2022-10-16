package SpringExample.inflearn;

import SpringExample.inflearn.member.Grade;
import SpringExample.inflearn.member.Member;
import SpringExample.inflearn.member.MemberService;
import SpringExample.inflearn.order.Order;
import SpringExample.inflearn.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);
    }


}
