package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

/**
 * 체크 예외의 제약 - 특정 기술에 종속되는 인터페이스
 * 인터페이스의 구현체가 체크 예외를 던지려면, 인터페이스 메서드에 먼저 체크 예외를 던지는 부분이 선언되어 있어야 한다.
 */
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;

    Member findById(String memberId)throws SQLException ;

    void update(String memberId, int money)throws SQLException;

    void delete(String memberId)throws SQLException;
}
