package SpringExample.inflearn;

import SpringExample.inflearn.discount.DiscountPolicy;
import SpringExample.inflearn.discount.FixDiscountPolicy;
import SpringExample.inflearn.member.MemberRepository;
import SpringExample.inflearn.member.MemberService;
import SpringExample.inflearn.member.MemberServiceImpl;
import SpringExample.inflearn.member.MemoryMemberRepository;
import SpringExample.inflearn.order.OrderService;
import SpringExample.inflearn.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
