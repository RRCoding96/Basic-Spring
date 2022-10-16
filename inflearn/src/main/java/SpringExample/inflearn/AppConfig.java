package SpringExample.inflearn;

import SpringExample.inflearn.discount.FixDiscountPolicy;
import SpringExample.inflearn.member.MemberService;
import SpringExample.inflearn.member.MemberServiceImpl;
import SpringExample.inflearn.member.MemoryMemberRepository;
import SpringExample.inflearn.order.OrderService;
import SpringExample.inflearn.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
