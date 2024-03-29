-- 트리거
--  - 테이블에 특정 상황(=이벤트)이 발생 시 실행되는 프로시저
--  - 주로 삭제와 함꼐 사용함(삭제 후 되돌려야 하는 경우 많기 때문)
create or replace trigger per_tri
    after delete or update on person
    for each row
declare
    v_action varchar2(20); -- 변수명을 v_action으로 수정
begin
    if deleting then -- 오타 수정: deleting → deleting
        v_action := '삭제'; -- 변수명 수정: v_actinon → v_action
    elsif updating then -- 오타 수정: updating → updating
        v_action := '수정'; -- 변수명 수정: v_actinon → v_action
    end if;
    
-- : old는 trigger 발생 전 데이터
--: new는 trigger 발생 후 데이터
    insert into person_back (name, height, birth, action)       
    values (:old.name, :old.height, :old.birth, v_action); -- 변수명 수정: v_action
    
    dbms_output.put_line('트리거 실행 완료!');
        dbms_output.put_line(:old.name);
end;