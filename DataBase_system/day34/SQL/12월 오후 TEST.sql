create table student(
    idx             number              primary key,
    grade         number               not null,
    class_idx   number               not null,
    gender       varchar2(6)        check(gender in('남', '여')),
    email         varchar2(100)     not null
);
alter table student add constraint fk_cl_idx foreign key(class_idx) references class(idx);
alter table student add constraint uk_email_2 unique(email);

insert into student(idx, grade, class_idx, gender, email) values (1, 11, 101, '남', 'student1@example.com');
insert into student(idx, grade, class_idx, gender, email) values (2, 10, 102, '여', 'student2@example.com');
insert into student(idx, grade, class_idx, gender, email) values (3, 12, 103, '남', 'student3@example.com');
insert into student(idx, grade, class_idx, gender, email) values (4, 9, 104, '여', 'student4@example.com');
insert into student(idx, grade, class_idx, gender, email) values (5, 11, 105, '여', 'student5@example.com');

create table class(
    idx     number      primary key,
    name        varchar2(60),
    c_date      date,
    total       number
);

insert into class(idx, name, c_date, total) values (1, '수학', TO_DATE('2024-02-07', 'YYYY-MM-DD'), 30);
insert into class(idx, name, c_date, total) values (2, '영어', TO_DATE('2024-02-07', 'YYYY-MM-DD'), 25);
insert into class(idx, name, c_date, total) values (3, '과학', TO_DATE('2024-02-07', 'YYYY-MM-DD'), 28);
insert into class(idx, name, c_date, total) values (4, '역사', TO_DATE('2024-02-07', 'YYYY-MM-DD'), 20);
insert into class(idx, name, c_date, total) values (5, '미술', TO_DATE('2024-02-07', 'YYYY-MM-DD'), 15);

create table professor(
    idx     number        primary key,
    class_idx       number,
    gender          varchar2(6) check(gender in('남', '여')),
    email           varchar2(100)       not null
);

drop table class;
insert into professor(idx, class_idx, gender, email) values ('prof1', 1, '남', 'prof1@example.com');
insert into professor(idx, class_idx, gender, email) values ('prof2', 2, '여', 'prof2@example.com');
insert into professor(idx, class_idx, gender, email) values ('prof3', 3, '남', 'prof3@example.com');
insert into professor(idx, class_idx, gender, email) values ('prof4', 4, '여', 'prof4@example.com');
insert into professor(idx, class_idx, gender, email) values ('prof5', 5, '남', 'prof5@example.com');


alter table professor add constraint fk_pcl_idx foreign key(class_idx) references class(idx);
alter table professor add constraint uk_email unique(email);
