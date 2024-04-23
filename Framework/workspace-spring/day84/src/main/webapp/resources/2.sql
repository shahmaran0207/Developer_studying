create sequence account_seq
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 99999999999999999999999
    nocache;

create table account (
    idx            number default account_seq.nextval,
    userid      varchar2(60)        not null,
    userpw      varchar2(160)        not null,
    nick         varchar2(60)        not null,
    email       varchar2(160)        not null,
    j_date      timestamp       default sysdate,
    
    constraint account_idx primary key (idx),
    CONSTRAINT acount_userid UNIQUE (nick),
    CONSTRAINT acc_userid UNIQUE (userid)
);

insert into
    account(userid, userpw, nick, email)
    values('root', 'qwe', '관리자', 'root@gamil.com');

insert into
    account(userid, userpw, nick, email)
    values('root2', 'qwe2', '관리자2', '2root@gamil.com');
    
update board set a_idx=1001;
commit;

create view board_view as
    select B.idx, B.title, A.nick, B.contents, 
                B.upload, B.v_count, B.w_date
        from board B
        inner join account A
        on b.a_idx=A.idx;

