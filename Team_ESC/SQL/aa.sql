
--회사정보 테이블
create table company_intro(c_name varchar(20) not null,
                     c_talent clob not null,  -- 인재상
                     c_field varchar(50) not null,
                     c_intro varchar(1000),
                     c_recruitment_start date, -- 시작일
                     c_recruitment_end date, -- 종료일
                     c_qualification varchar(1000),
                     c_area varchar(1000),
                     primary key(c_name, c_field),
                  );

--구직자 테이블
---------------
CREATE TABLE seeker(s_id varchar(15) not null,
               s_pw varchar(15) not null,
               s_age int,
               s_final_edu varchar(10),
               s_field varchar(50),
               s_area varchar(15),
               s_belong int, -- 직원 소속여부
               primary key(s_id)
               );
               
--------------

