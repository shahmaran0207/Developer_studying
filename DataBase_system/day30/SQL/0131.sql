-- create: DB 객체를 생성
-- 테이블, 계정, 뷰, 프로시저 등을 생성 가능
-- commit 불필요, 바로 적용됨

create table student(
    name    varchar2(20),
    score   number,
    birth   date    
);

-- alter: DB 객체 정보 변경
alter table student add address varchar(100);
alter table student modify address varchar2(150);
alter table student drop column address;
alter table student rename column score to scores;

-- drop: DB 객체를 삭제
drop table student;

-- ※ 아래 두 구문의 차이는?
delete from student;    -- 모든 행을 제거. 테이블은 남음
drop table student;      --  테이블 자체 제거 → drop은 매우 위험함