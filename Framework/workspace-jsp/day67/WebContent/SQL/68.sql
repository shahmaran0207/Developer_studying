-- 그냥 board 테입르을 유저에게 보여주면 게시글 작성자를 알 수 없다
-- 왜? idx 번호로 저장되어 있기 때문
-- 그럼? idx account 테이블을 참조해서 nick등의 데이터를 합쳐 보여준다
-- 즉, join이 필요함


create view board_view as 
    select 
        B.idx, B.title, A.nick, 
        B.contents, B.v_count, B.w_date
            from account A
            inner join board B
            on A.idx=B.user_idx
            order by idx;
select * from account;
select * from board_view order by idx desc;

--view는 실제 테이블이 아니 ㄴ가상 테이블
--vie를 조회할 땐 그때마다 저장된 구문을 실행해서 보여줌
-- 즉, 원본 테이블 내용이 변경되면 view도 변경된 내용을 보여준다

update account set nick='11리자' where idx=1003;
commit;