package SpringExample.inflearn.member;

import SpringExample.inflearn.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        // given
        Member member = new Member(1L, "member1", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // then
        /*
            member(join한 객체)와 findMember(찾은 객체)가 같은지 확인
            join() 메소드가 제대로 작동하는지 확인했다.
         */
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
