-- 연습)
--정수값을 하나 아무거나 저장 후
-- 그 정수 거꾸로 출력

declare
    n       number := 1234;
    i           number:=0;

begin
    while n !=0 loop
        i := i*10 +mod(n, 10);
        n :=trunc(n/10);
    end loop;
    
    dbms_output.put_line(i);

end;