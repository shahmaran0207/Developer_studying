--1. 절대값을 반환하는 함수
create or replace function abso(
    n2 number
) return number as
    v_num       number;

begin
    v_num:=n2;
    if v_num<0 then
        v_num:=v_num*-1;
    end if;

    return v_num;
end;

select abso(-5) from dual;

--2. 전달된 수를 거꾸로 만들어 반환
create or replace function rev(
    n1 number
) return number as
    num       number:=n1;
    result      number:=0;
begin
    while num!=0 loop
        result := result*10 + mod(num, 10);
        num:=trunc(num/10);
    end loop;
    
    return result;
end;

select rev(123) from dual;