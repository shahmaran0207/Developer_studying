-- 연습)
-- student 테이블에서 모든 정보 가져와 60이상이면 합격

declare 

        cursor stu_cur is 
                select * from student;

    v_avg       number;
    v_result    varchar2(20) := '불합격';
    
begin        
        for stu in stu_cur loop
            v_avg := (stu.kor + stu.eng + stu.mat) / 3;
            v_avg := round(v_avg, 1);
            
            if v_avg >= 60 then
                v_result := '합격';
            else
                v_result :='불합격';
            end if;  
            
            insert into student_test 
                values(stu.idx, stu.name, v_avg, v_result);


    end loop;
            dbms_output.put_line('몰루');    
end;