-- 연습)
--student테이블에서 idx가 20240101dls 학생 정보를 콘솔에 출력

declare
    s_idx       number;
    s_name    varchar2(50);
    s_kor       number;
    s_eng      number;
    s_mat      number;

begin
    select idx, name, kor, eng, mat into s_idx, s_name, s_kor, s_eng, s_mat
    from student
    where idx=20240101;
    
    dbms_output.put_line('idx: '||s_idx);
    dbms_output.put_line('name: '||s_name);    
    dbms_output.put_line('kor: '||s_kor);
    dbms_output.put_line('eng: '||s_eng);
    dbms_output.put_line('mat: '||s_mat);
    
end;