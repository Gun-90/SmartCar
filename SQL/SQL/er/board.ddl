/**********************************/
/* Table Name: USERS */
/**********************************/
drop table board;
drop table users;

CREATE TABLE USERS(
		ID                            		VARCHAR2(10)		  ,
		PW                            		VARCHAR2(10)		 NOT NULL,
		NAME                          		VARCHAR2(15)		 NOT NULL
);


/**********************************/
/* Table Name: BOARD */
/**********************************/
CREATE TABLE BOARD(
		NO                            		NUMBER(5)		  ,
		Title                         		VARCHAR2(30)		 NOT NULL,
		CONTENTS                      		VARCHAR2(50)		 NULL ,
		regdate                       		DATE		 DEFAULT sysdate		 NULL ,
		cnt                           		NUMBER(4)		 DEFAULT 0		 NULL ,
		ID                            		VARCHAR2(10)		 NULL 
);


select no,title,name,regdate,cnt
from board b, USERS u
where b.id = u.id
order by 1;


ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_PK PRIMARY KEY (ID);
ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_PK PRIMARY KEY (NO);
ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);


INSERT INTO USERS (ID, PW, NAME) VALUES ('admin', '1234', '관리자');
INSERT INTO USERS (ID, PW, NAME) VALUES ('test01', '1234', '홍길동');
INSERT INTO USERS (ID, PW, NAME) VALUES ('java', '1234', '자바');

INSERT INTO BOARD (NO, Title,  id)
VALUES ((select nvl(max(no),0) from board)+1, '연습용',  'java');

//  데이터 구축 작업 ~~~~

//예 관리자가 올린 게시글 목록 리스트
// 홍길동이 올린 글 목록

//수정
//삭제





