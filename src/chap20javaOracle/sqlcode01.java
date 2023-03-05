package chap20javaOracle;

public class sqlcode01 {

// 아래 코드 그대로 SQL Developer로 가져가면 됨

-- SQL STructured Query Language 구조화된 질의어
-- 테이블을 만드는 질의 예제

    CREATE TABLE MEMBER (
            ID VARCHAR2(50) PRIMARY KEY, -- 식별자(중복이 허용되지 않는 유일한 값을 가짐)
    NAME VARCHAR2(50) NOT NULL, -- 반드시 값을 넣어야 하는 컬럼
    EMAIL VARCHAR2(50),
    PHONE VARCHAR2(50),
    INDATE DATE
);

// 샘플 데이터
    -- 데이터 입력하기
    INSERT INTO MEMBER(ID, NAME, EMAIL, PHONE, INDATE)
    VALUES('hgd', '홍길동', 'hgd@naver.com', '010-3456-7890', '2023-03-02');

    INSERT INTO MEMBER(ID, NAME, EMAIL, PHONE, INDATE)
    VALUES('ysd', '운선도', 'ysd@naver.com', '010-3456-8989', '2023-04-02');

    INSERT INTO MEMBER(ID, NAME, EMAIL, PHONE, INDATE)
    VALUES('sjw', '성티샘', 'jaain@naver.com', '010-2345-8901', '2023-04-04');

    COMMIT;

}
