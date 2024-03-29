-- 반복문 for

begin
    for i in 1..5 loop
        dbms_output.put_line(i || ': Hello world');
    end loop;
    
    dbms_output.put_line(' ');
    
    for i in 1..5 loop
            dbms_output.put_line(i || ': Hello world');
    end loop;
end;