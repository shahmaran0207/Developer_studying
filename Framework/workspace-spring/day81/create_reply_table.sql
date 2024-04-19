create sequence reply_seq
    start with 101
    increment by 1
    minvalue 101
    maxvalue 999999999999999999999999999999999
    nocache;

create table reply(
    idx         number      default reply_seq.nextval,
    b_idx       number      not null,
    u_idx       number      not null,
    contents        clob    default '내용없음',
    w_date          date        default sysdate,
    
    constraint reply_idx primary key(idx),
    constraint reply_bidx foreign key(b_idx) references board(idx) on delete cascade,
    constraint reply_uidx foreign key(u_idx) references account(idx) on delete cascade
);

drop table reply;

select idx from account;

insert into reply 
    (b_idx, u_idx, contents)
    values(10384, 1001, '아몰랑?');
    commit;

create view reply_view as
    select R.idx, R.b_idx, R.contents, R.w_date,
               A.idx as u_idx, A.userid, A.nick
        from reply R
        inner join Account A
        on R.u_idx = A.idx
        order by R.idx;
        
-- 지정 게시글의 댓글 수
select count(*)  from reply where b_idx=10010;

-- 지정 게시글의 댓글
select * from reply where b_idx=10010;

select * from reply_view order by idx;

-- inner join: 겹치는 부분만 → 즉 교집합 부분만 나옴
-- 댓글이 있는 게시글만 (inner)
select B.*, R.*
    from board_view B
    inner join reply_view R
    on B.idx=R.b_idx
        order by B.idx desc;

-- 댓글이 없는 게시글도 (left outer)
create view board_reply as
    select B.*, R.idx as r_idx, R.contents as r_contents,
                R.w_date as r_date, R.u_idx, R.userid, R.nick as r_nick
        from board_view B
        left outer join reply_view R
        on B.idx=R.b_idx
        order by B.idx;
        
--댓글이 없는 게시글도
select idx, title, nick, r_contents, r_nick
    from board_reply 
--    where r_idx is not null
    order by idx desc;
    
--댓글이 있는 게시글만
select idx, title, nick, r_contents, r_nick
    from board_reply 
    where r_idx is not null
    order by idx desc;
    
-- 댓글 수
select count(idx) from board_reply where idx =10010;
commit;
        
select * from board_reply;
