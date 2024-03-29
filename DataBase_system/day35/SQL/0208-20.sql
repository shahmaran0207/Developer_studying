-- 연습) 
-- emp 테이블 모든 사원의 연봉을 10% 인상해서 적용


declare
    cursor em_c is select * from emp;
    
    v_increase      number;

begin

    for mon in em_c loop
        v_increase := mon.salary*1.1;
        update emp
             set salary = v_increase
        where salary = mon.salary;

    end loop;
            dbms_output.put_line('몰루');  
end;

-- ??: update emp set salary=salary*1.1;