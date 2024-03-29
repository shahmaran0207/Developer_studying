-- 연습
--1. person 테이블에 사람정보 1개 추가
-- 값은 아무거나

-- 2. person 테이블에서 birth가 null인 사람들 모두 00/01/01로 변경
-- 3. person 테이블에서 height가 180 이상인 사람들 정보 제거
-- 4. person 1~3 트랜잭션 모두 적용
-- 5. person테이블의 정보를 출력 나이가 많은 순으로 출력하고 이름은 같은 순으로

insert into person (name, height, birth) values ('이수진', 162.3, '99/03/28');

update person 
    set birth = '00/01/01' 
    where birth is null;
    
delete person
    where height>=180.0;
    
commit;

select * from person 
    order by birth,
    name;