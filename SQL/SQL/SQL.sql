select * from EMP;

select * from emp;
select ename from EMP;
select ename, job from emp;
select ename, sal from emp;
select ename,hiredate from emp;

select job from emp;
--�ߺ� ���� Ű����
select distinct job from emp;

select distinct job, deptno from emp;

select empno,empno,ename,sal,sal*12 from emp;
select empno,empno,ename,sal,sal*12 as ��� from emp;
select ename,sal,sal*12 "����" from emp;

select user from emp

-- �������̺� ���
select sysdate from dual;


-- ���������� ���� �߰��ϱ�
select empno, ename, sal||'��' from emp;

-- �� Į�� ���ϱ� (������ null ���� ��� ����� null�̵�)
select ename, sal, comm, sal + comm from emp;

-- nvl �޼ҵ�� commĮ���� 0 null�� ��� 0���� �ٲ���
select ename, sal, comm, sal + nvl(comm,0) from emp;

-- �ΰ��� ���� Į���� "�Ǳ޿�"�� ǥ��
select ename, sal, comm, sal + nvl(comm,0) as "�Ǳ޿�" from emp;

select ename, sal, nvl(comm, 0) as comm, sal + nvl(comm,0) as "�Ǳ޿�" from emp;

-- to_char�޼ҵ�� int�� ĳ���ͷ� �ٲ���
select ename, sal, nvl(to_char(comm), 'x') as comm, sal + nvl(comm,0) as "�Ǳ޿�" from emp;


-- ������ �ǽ�
select * from emp where deptno = 30;

select * from emp where sal>= 2000;
select * from emp where sal+nvl(comm,0) >=2000;
select ename, job from emp where sal + nvl(comm,0) >= 2000;

-- 
select * from emp where hiredate <'81/5/1';

select * from emp where hiredate >='81/1/1' and hiredate <= '81/12/31';

select ename, hiredate, to_char(hiredate,'yy') from emp;

select ename,hiredate, to_char(hiredate, 'yy') �Ի�⵵,to_char(hiredate,'mm') �Ի�� from emp;

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

SELECT * FROM EMP WHERE COMM IS NULL; -- '=' ���� �ȵ�
SELECT * FROM EMP WHERE COMM IS NOT NULL; -- '!-' ����ȵ�

SELECT * FROM EMP ORDER BY DEPTNO;
SELECT * FROM EMP ORDER BY DEPTNO DESC;
