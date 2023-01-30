package SpringExample.inflearn;

import SpringExample.inflearn.discount.DiscountPolicy;
import SpringExample.inflearn.discount.RateDiscountPolicy;
import SpringExample.inflearn.member.MemberRepository;
import SpringExample.inflearn.member.MemberService;
import SpringExample.inflearn.member.MemberServiceImpl;
import SpringExample.inflearn.member.MemoryMemberRepository;
import SpringExample.inflearn.order.OrderService;
import SpringExample.inflearn.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
