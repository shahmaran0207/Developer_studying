-- 무한루프

declare
        v_num       number:=5;

begin
        Loop
            dbms_output.put_line('v_num= ' || v_num);
            v_num :=v_num-1;
            
            exit when v_num=2;
        
        end loop;

end;