-- 내부(=지역) 변수는 어떻게?

create or replace procedure test3(
            n1 number,
            n2 number
) as
    --여기가 declare 자리 실제로 delcare쓰면 안됨 (as와 begin 사이)
        v_sum       number :=0;
    begin
        for i in n1..n2 loop
            v_sum:=v_sum+i;
        
        end loop;
        dbms_output.put_line(v_sum);
    end;
    
exec test3(4, 5);