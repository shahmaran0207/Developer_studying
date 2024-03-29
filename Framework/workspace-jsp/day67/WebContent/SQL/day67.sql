create sequence account_seq 
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 999999999999999999999999
    nocache;

create table account (
    idx     number          default account_seq.nextval,
    userid  varchar2(20)    not null,
    userpw  varchar2(128)   not null,
    nick    varchar2(20)    not null,
    email   varchar2(80)    not null,
    j_date  date            default sysdate,
    
    constraint acc_idx primary key(idx),
    constraint acc_userid unique(userid),
    constraint acc_nick unique(nick),
    constraint acc_email unique(email)
);

drop table account;
drop table board;

create sequence board_seq 
    start with 10001
    increment by 1
    minvalue 10001
    maxvalue 999999999999999999999
    nocache;
    
create table board(
    idx         number          default board_seq.nextval,
    title       varchar2(150)   default '제목 없음' not null,
    contents    clob            default '내용 없음' not null,
    v_count     number          default 0,
    w_date      date            default sysdate,
    user_idx    number,
    
    constraint board_idx primary key(idx),
    constraint board_uidx foreign key(user_idx) references account(idx) on delete set null
);

drop table board;

insert into 
    account(userid, userpw, nick, email) 
    values('root', 'qwe', '관리자', 'ahffn@email.com');
    
    insert into 
    account(userid, userpw, nick, email) 
    values('gr1oot', '11', '관1리자', 'ahff1n@email.com');
    
    insert into 
    account(userid, userpw, nick, email) 
    values('2root', '2qwe', '2관리자', '2ahffn@email.com');

commit;

select * from board;

insert into board(title, user_idx)
    values('관리자 입니다', 1001);
    
insert into board(title, user_idx)
    values('공지사항', 1001);
    
insert into board(title, user_idx)
    values('안녕', 1003);

insert into board(title, user_idx)
    values('안녕2', 1003);    
