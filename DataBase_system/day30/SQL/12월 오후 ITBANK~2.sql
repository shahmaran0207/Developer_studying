-- delete: 행 삭제
-- 구문: delete from  테이블 명 where 조건;

-- 내가 생각한 조건 결과와 일치하는 select로 디버깅 후 진행하도록 해야 함!
select * from person where birth is null;
delete from person where birth is null;

-- 주의! 조건을 생략시 모든 행이 제거됨 → 사실상 쓰면 안됨
delete from person;

rollback;


-- update: 행 수정
-- 구문: update  테이블 명 set 열1= 값1, 열2=값2, ... where 조건절; → 얘도 조건안쓰면 전부 바뀜
update person
         set name='정형돈', 
            height=170
        where name is null; 
        
commit;

-- C: insert
-- R: select
-- U: update
-- D: delete