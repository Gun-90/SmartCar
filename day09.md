oracle homepage -> download -> database ->Database 11g Express Edition 다운

https://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html

```shell
// 관리자 계정 로그인
$sqlplus system/1234  //   sqlplus 계정/비밀번호
```

클라이언츠 프로그램

SQLplus



system 계정에서

```sql
// hr 유저의 계정 잠금 풀기(hr은 오라클에서 sample 계정으로 제공함)
SQL> alter user hr identified by hr account unlock;

// User altered.
```



```sql
// 계정 잠금 풀기 전
Enter user-name: hr
Enter password:
ERROR:
ORA-28000: the account is locked

// 계정 잠금 푼 후

Enter user-name: hr
Enter password:

Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production
```

계정 생성

```sql
SQL> create user scott identified by tiger;

User created.
```

권한 주기

```sql
SQL> grant connect,resource,dba to scott;

Grant succeeded.

```

테이블 목록 확인하기 (hr 계정)

```sql
SQL> select * from tab;

TNAME                                                        TABTYPE
------------------------------------------------------------ --------------
 CLUSTERID
----------
COUNTRIES                                                    TABLE


DEPARTMENTS                                                  TABLE


EMPLOYEES                                                    TABLE



TNAME                                                        TABTYPE
------------------------------------------------------------ --------------
 CLUSTERID
----------
EMP_DETAILS_VIEW                                             VIEW


JOBS                                                         TABLE


JOB_HISTORY                                                  TABLE



TNAME                                                        TABTYPE
------------------------------------------------------------ --------------
 CLUSTERID
----------
LOCATIONS                                                    TABLE


REGIONS                                                      TABLE



8 rows selected.
```



## 개요

DBMS 장점

데이터

```sql
select * from tab;
```



C:\oraclexe\app\oracle\product\11.2.0\server\sqlplus\admin\glogin.sql파일 수정



```sql
-- 추가
set linesize 300;
set pagesize 100;
col ename for a15;
col job for a15;
```

scott/ tiger 계정에서 hr/hr계정으로 로그인

```sql
SQL> conn hr/hr
Connected.
```



```sql
SQL> desc employees;
 Name
                                               Null?    Type
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -------- --------------------------------------------------------------------------------------------------------------------
 EMPLOYEE_ID
                                               NOT NULL NUMBER(6)
 FIRST_NAME
                                                        VARCHAR2(20)
 LAST_NAME
                                               NOT NULL VARCHAR2(25)
 EMAIL
                                               NOT NULL VARCHAR2(25)
 PHONE_NUMBER
                                                        VARCHAR2(20)
 HIRE_DATE
                                               NOT NULL DATE
 JOB_ID
                                               NOT NULL VARCHAR2(10)
 SALARY
                                                        NUMBER(8,2)
 COMMISSION_PCT
                                                        NUMBER(2,2)
 MANAGER_ID
                                                        NUMBER(6)
 DEPARTMENT_ID
                                                        NUMBER(4)
```



```sql
SQL> desc dept;
 Name
                                               Null?    Type
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -------- --------------------------------------------------------------------------------------------------------------------
 DEPTNO
                                               NOT NULL NUMBER(2)
 DNAME
                                                        VARCHAR2(14)
 LOC
                                                        VARCHAR2(13)
```

![1008-3](C:\Workspace\SmartCar\image\1008-3.png)
java EE 선택후 Data Sorce Explorer -> Database connections 우측클릭 ->new -> oracle
![1008-1png](C:\Workspace\SmartCar\image\1008-1png.png)

빨간색 버튼 누름-> oracle thin driver - system version 11 선택 ->jar list에 있는 파일 삭제후 add ojdbc6.jar

![1008-04](C:\Workspace\SmartCar\image\1008-04.png)![1008-2](C:\Workspace\SmartCar\image\1008-2.png)



select 절 처리 순서

from절의 테이블 이용 → 테이블로부터 한 ROW읽음 → select



```sql
-- 두 칼럼 더하기 (한쪽이 null 값인 경우 결과는 null이됨)
select ename, sal, comm, sal + comm from emp;

-- nvl 메소드는 comm칼럼이 0 null인 경우 0으로 바꿔줌
select ename, sal, comm, sal + nvl(comm,0) from emp;

-- to_char메소드는 int를 캐릭터로 바꿔줌
select ename, sal, nvl(to_char(comm), 'x') as comm, sal + nvl(comm,0) as "실급여" from emp;

-- 조건절 실습
select * from emp where deptno = 30;

select * from emp where sal>= 2000;

select * from emp where hiredate <'81/5/1';
```

