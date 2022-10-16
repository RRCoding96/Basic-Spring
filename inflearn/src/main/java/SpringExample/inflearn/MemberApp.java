package SpringExample.inflearn;

import SpringExample.inflearn.member.Grade;
import SpringExample.inflearn.member.Member;
import SpringExample.inflearn.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new memebr = " + member.getName());
        System.out.println("find memebr = " + findMember.getName());
    }
}
