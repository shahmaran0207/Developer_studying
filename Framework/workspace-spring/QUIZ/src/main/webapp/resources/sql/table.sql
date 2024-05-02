create sequence acc_seq 
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 99999999999999999999999999999
    nocache;

create table account (
    idx            number default acc_seq.nextval,
    userid      varchar2(60)        not null,
    userpw      varchar2(160)        not null,
    nick         varchar2(60)        not null,
    j_date      timestamp       default sysdate,
    
    constraint account_idx primary key (idx),
    CONSTRAINT acount_userid UNIQUE (nick),
    CONSTRAINT acc_userid UNIQUE (userid)
);

insert into
    account(userid, userpw, nick)
    values('root', 'qwe', '관리자');

insert into
    account(userid, userpw, nick)
    values('root2', 'qwe2', '관리자2');
    
select * from account;

commit;