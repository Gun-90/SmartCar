
--ȸ������ ���̺�
create table company_intro(c_name varchar(20) not null,
                     c_talent clob not null,  -- �����
                     c_field varchar(50) not null,
                     c_intro varchar(1000),
                     c_recruitment_start date, -- ������
                     c_recruitment_end date, -- ������
                     c_qualification varchar(1000),
                     c_area varchar(1000),
                     primary key(c_name, c_field),
                  );

--������ ���̺�
---------------
CREATE TABLE seeker(s_id varchar(15) not null,
               s_pw varchar(15) not null,
               s_age int,
               s_final_edu varchar(10),
               s_field varchar(50),
               s_area varchar(15),
               s_belong int, -- ���� �Ҽӿ���
               primary key(s_id)
               );
               
--------------

