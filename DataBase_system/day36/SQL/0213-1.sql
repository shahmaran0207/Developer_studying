-- 프로시저 vs 함수
-- 1. 공통점
--  - 일정 길이의 코드를 저장하고 재사용하는 것

-- 2. 차이점
-- - 함수는 꼭 반환값을 가져야만 함
-- - 프로시저는 반환값을 꼭 가질 필요는 없음
-- - 함수는 select문에서 호출 가능

create or replace function adder(
    n1 number,
    n2 number
) return number as
    result number;
    
begin
    result := n1+n2;
    
    return result;

end;

-- 호출은 2에서