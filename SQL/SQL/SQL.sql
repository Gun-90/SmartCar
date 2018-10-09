select * from EMP;

select * from emp;
select ename from EMP;
select ename, job from emp;
select ename, sal from emp;
select ename,hiredate from emp;

select job from emp;
--중복 제거 키워드
select distinct job from emp;

select distinct job, deptno from emp;

select empno,empno,ename,sal,sal*12 from emp;
select empno,empno,ename,sal,sal*12 as 년봉 from emp;
select ename,sal,sal*12 "연봉" from emp;

select user from emp

-- 가상테이블 듀얼
select sysdate from dual;


-- 봉급정보에 단위 추가하기
select empno, ename, sal||'원' from emp;

-- 두 칼럼 더하기 (한쪽이 null 값인 경우 결과는 null이됨)
select ename, sal, comm, sal + comm from emp;

-- nvl 메소드는 comm칼럼이 0 null인 경우 0으로 바꿔줌
select ename, sal, comm, sal + nvl(comm,0) from emp;

-- 두값을 더한 칼럼을 "실급여"로 표현
select ename, sal, comm, sal + nvl(comm,0) as "실급여" from emp;

select ename, sal, nvl(comm, 0) as comm, sal + nvl(comm,0) as "실급여" from emp;

-- to_char메소드는 int를 캐릭터로 바꿔줌
select ename, sal, nvl(to_char(comm), 'x') as comm, sal + nvl(comm,0) as "실급여" from emp;


-- 조건절 실습
select * from emp where deptno = 30;

select * from emp where sal>= 2000;
select * from emp where sal+nvl(comm,0) >=2000;
select ename, job from emp where sal + nvl(comm,0) >= 2000;

-- 
select * from emp where hiredate <'81/5/1';

select * from emp where hiredate >='81/1/1' and hiredate <= '81/12/31';

select ename, hiredate, to_char(hiredate,'yy') from emp;

select ename,hiredate, to_char(hiredate, 'yy') 입사년도,to_char(hiredate,'mm') 입사월 from emp;

select * from emp where to_char(hiredate,'yy') = '80';

select * from emp where to_char(hiredate,'yy') != '81';

select * from emp where sal >= 2000 and sal <= 3000;

select * from emp where sal between 2000 and 3000;

select * from emp where deptno = 10 or deptno = 30;
select * from emp where deptno in(10,30);
select * from emp where deptno not in(10,30);

select * from dept;

select * from dept where loc in ('BOSTON', 'DALLAS');

SELECT * FROM DEPT WHERE(loc = 'BOSTON' AND DEPTNO = 10) OR (LOC = 'DALLAS' AND DEPTNO =20);
SELECT * FROM DEPT WHERE(LOC, DEPTNO) IN (('BOSTON',40), ('DALLAS',20));

SELECT * FROM EMP WHERE ENAME = 'ALLEN';

SELECT * FROM EMP WHERE ENAME = 'A%';

SELECT * FROM EMP WHERE ENAME LIKE 'A%';

SELECT * FROM EMP WHERE ENAME LIKE '_M%';

SELECT * FROM EMP WHERE COMM IS NULL; -- '=' 쓰면 안됨
SELECT * FROM EMP WHERE COMM IS NOT NULL; -- '!-' 쓰면안됨

SELECT * FROM EMP ORDER BY DEPTNO;
SELECT * FROM EMP ORDER BY DEPTNO DESC;
