select * from account order by idx desc;

desc account;

update account set profile=0;
commit;

create table test(
    gender varchar2(6) check (gender in('남', '여'))
);