--  emp 테이블에서 수정 발생 시 수정전의 데이터를 emp_back에 insert 하는 트리거 생성

create or replace trigger emp_back
    after update on emp
    for each row
    
declare
  v_action      varchar2(50);
begin
    if updating then
        insert into emp_back (IDX,
COLUMN1,
COLUMN8,
COLUMN9,
COLUMN2,
COLUMN3,
COLUMN4,
COLUMN5,
COLUMN6,
COLUMN7)       
            values (:old.idx, :old.name, :old.position, :old.gender, :old.birth, :old.h_date, :old.phone, :old.email, :old.salary, :old.dep_idx); -- 변수명 수정: v_action
    end if;
    
    dbms_output.put_line('트리거 실행 완료!');
        dbms_output.put_line(:old.name);
end;

select * from emp;
select * from emp_back;

update emp
    set salary=12000
    where name='류지민';
rollback;