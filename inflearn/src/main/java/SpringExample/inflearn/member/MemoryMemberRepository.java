package SpringExample.inflearn.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    /*
    실무에선 동시성 이슈 때문에 concurrenthashmap을 사용해야한다.
    해당 프로젝트에선 그냥 HashMap을 사용했다.
     */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
