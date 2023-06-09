show databases;
CREATE DATABASE my_board default CHARACTER SET UTF8MB4;
use my_board;

create table board(
	b_no int primary key auto_increment,# 글번호
    b_title char(100) ,			# 글제목
    b_id char(20) not null,				# 작성자 id
    b_datetime datetime not null,		# 작성 시간
    b_hit int default 0,				# 조회수
    b_text text,						# 글 내용
    b_reply_count int,					# 댓글 수
    b_reply_ori int,					# 댓글의 원글 번호
    b_reply_text text					# 댓글 내용
);
insert into board (b_title,b_id,b_datetime,b_text) values ('헬로','cat1',now(),'글입니다. 글글.....글....');
insert into board (b_id,b_datetime,b_reply_ori,b_reply_text)values ('cat1',now(),10,'댓글임......욕욕욕...');
