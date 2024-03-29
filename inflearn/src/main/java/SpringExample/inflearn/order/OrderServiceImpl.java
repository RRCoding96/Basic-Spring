package SpringExample.inflearn.order;

import SpringExample.inflearn.annotation.MainDiscountPolicy;
import SpringExample.inflearn.discount.DiscountPolicy;
import SpringExample.inflearn.discount.FixDiscountPolicy;
import SpringExample.inflearn.discount.RateDiscountPolicy;
import SpringExample.inflearn.member.Member;
import SpringExample.inflearn.member.MemberRepository;
import SpringExample.inflearn.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    // lombok : @RequiredArgsConstructor가 만들어 줌
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
