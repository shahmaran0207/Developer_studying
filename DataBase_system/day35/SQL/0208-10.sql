-- person 테이블에서 아무 사람을 가져온다
-- 그 사람의 나이를 구해서 '성인/미성년자'를 구분해서 출력

declare
    v_name      varchar2(50);
    v_birth        date;
    v_cur           date:=sysdate;
    v_result        number;
    v_string        varchar2(1000) :='미성년자';

begin
    select name, birth into v_name, v_birth
    from person
    where name='이수진';
    
    v_result := trunc((v_cur-v_birth)/365);
    
    if v_result >=20 then
        v_string :='성인';
    
    end if;
    
    dbms_output.put_line(v_name || '은 '||v_result||'살 으로 ' || v_string || '입니다.');

end;