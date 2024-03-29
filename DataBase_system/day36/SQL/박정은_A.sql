-- 1번 문제
create sequence acc1_seq
    start with 20231001
    increment by 1
    minvalue        20231001
    maxvalue        999999999999
    nocache;

create table account(
    idx             number     default acc1_seq.nextval  primary key     ,
    userid        varchar2(50)        unique not null,
    userpw       varchar2(50)         not null,
    nick            varchar2(50)        unique not null,
    jdate           date                    default sysdate 
);

    
-- 2번 문제
insert into account values(default, 'itbank', 'it12', '구름달', '23/02/13');
insert into account values(default, 'user', '1234', '별똥별', '23/02/14');
insert into account values(default, 'hong22', ' 2222', '콩콩', '23/02/22');

 select * from account      
    order by idx desc;

-- 3번 문제
update account  
    set
        nick='은하수'
        where userpw='1234';

-- 4번 문제        
delete account
    where userid='hong22';

select * from account;

-- 5번 문제
create sequence boa_seq
    start with              1000
    increment by          1
    minvalue                1000
    maxvalue                999999999999
    nocache;

create table board(
    idx               number     default boa_seq.nextval  primary key     ,
    title            varchar2(50)          not null,
    contents      varchar2(50)         not null,
    writer          varchar2(50),
    wdate           date            default sysdate  
);

alter table account add constraint acc_fk_nick foreign key(nick) references account(nick);

-- 6번 문제
insert into board values(default, '안녕하세요', 'hello~', '은하수', '23/02/14');
insert into board values(default, '오늘 점심은...', '햄버거나 먹을까?', '은하수', '23/02/14');
insert into board values(default, '퇴근~', '차가 막히네...', '구름달', '23/02/14');

select * from board
        order by idx desc;
        
--7번 문제
select * from board
    where writer='은하수'
    order by idx desc;
        
--8번 문제  
select A.idx, userid, B.idx as bo_idx, B.title
    from account A
    inner join board B
    on A.nick=B.writer;
    
--9번 문제
create view bo_view as
    select A.idx, userid, B.idx as bo_idx, B.title
        from account A
        inner join board B
        on A.nick=B.writer;

-- 10번 문제
create table board_del(
    idx               number     default boa_seq.nextval  primary key     ,
    title            varchar2(50),
    contents      varchar2(50),
    writer          varchar2(50),
    wdate           date,  
    ddate           date            default sysdate      
);

-- 11번 문제
create or replace procedure del_(
    n1 number
) as
    cursor bo_c is select * from board;
    v_idx       number;
    
begin
    v_idx:=n1;
    for bo in bo_c loop
        if v_idx = bo.idx then
            insert into board_del 
                values(bo.idx, bo.title, bo.contents, bo.writer, bo.wdate, default);        
                
            delete board
                where idx=n1;
        end if;

    end loop;
    dbms_output.put_line('삭제 및 삽입 완료');
end;

commit;