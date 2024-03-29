-- 연습)
-- emp테이블에서 사원번호 20240106인 사원의 연차를 출력

declare
    v_name      varchar2(50);
    v_in        date;
    v_cur       date:=sysdate;
    v_result    number;
    
begin
    select name, h_date into v_name, v_in
    from emp
    where idx=20240171;
    
    v_result :=v_cur-v_in;
    v_result:= v_result/365;
    v_result :=trunc(v_result);
 
    dbms_output.put_line('이름: ' ||v_name);   
    dbms_output.put_line('연차: ' ||v_result ||  ' 년차');
    
end;