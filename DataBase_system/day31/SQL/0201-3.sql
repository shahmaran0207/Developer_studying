-- 1. student 테이블 생성
-- 열정보)
-- idx          학번    기본키
-- name       이름    null(x)
--score       점수    기본값 O
--address   주소      null(x)

-- 2. student table에 데이터를 기입하여 제약 조건 테스트

create table student(
    idx         varchar2(20),
    name    varchar2(20) not null,
    score   number     default 0,
    address varchar2(50) not null,
    
    constraint student_idx primary key(idx)
);

--pk 테스트
insert into student values(1001, '이수진', 100, '부산');
insert into student values(1002, '김신일', default, '진주');

--null테스트
insert into student values(101, null, default, '부산');

--inesrt시 지정하지 않은 경우 자동으로 null이 기입됨
insert into 
    student(idx, name)
    values(102, '김민수');

-- insert시 지정하지 않은 열에 default가 설정되면 그 값이 채워진다
insert into
    student(idx, name, address)
    values(103, '박민지', '서울');
    
select * from student;

drop table student;