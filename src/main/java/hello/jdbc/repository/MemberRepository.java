package hello.jdbc.repository;

import hello.jdbc.domain.Member;

/**
 * 런타임 예외 적용
 */
public interface MemberRepository {
    Member save(Member member);

    Member findById(String memberId) ;

    void update(String memberId, int money);

    void delete(String memberId);
}
