package SpringExample.inflearn;

import SpringExample.inflearn.member.*;
/*
    순수 java로 test 해보기
 */
public class MemberApp {

    public static void main(String[] args){
        MemberService memberService = new MemberServiceImpl();
        Member member1 = new Member(1L, "member1", Grade.VIP);
        memberService.join(member1);

        Member findMember1 = memberService.findMember(1L);
        System.out.println("findmember 1 = " + findMember1.getName());
        System.out.println("new member1 = " + member1.getName());
    }

}
