select * from dept;

--SELGRADE�� Ȯ���� �ȵ�
select * from SALGRADE;

-- f �Ǵ� F�� ȣ�Ե� ename ã��
select ename,job, hiredate from emp 
where lower(ename) like '%'||lower('f')||'%';

select empno, ename, nvl(to_char(mgr),'CEO') "����ڵ�" from emp;

select empno, ename, sal , sal *1.2 "�����޿�" from emp;

-- decode �Լ� java�� ����ġ���� ���
select empno, ename, sal , deptno ,
	decode(deptno, 10, sal* 1.2,20, sal*1.1 , sal*0.9)"�����޿�" from emp;


select ename,sal,hiredate,dname,loc from emp,dept;

select ename,sal,hiredate,dname,loc from emp,dept where emp.depno = dept.deptno;


select * from dept;
select * from SALGRADE;

select �÷� as "~~~~" , 
from ���̺��
where ����
order by 

select ename,job,hiredate,sal+comm
from emp;

select ename,job,hiredate,sal+nvl(comm,0)
from emp;

select ename,job,hiredate,sal+nvl(comm,0) "�� ��"
from emp
where deptno=20
order by "�� ��";

select ename,job,lower(ename)
from emp;

//�̸��� f/F �����Ե� ��� �˻�   = , like
select ename,job,hiredate
from emp
where upper(ename) like '%'||upper('F')||'%'  ;


//job�� ma/Ma/mA/MA �����Ե� ��� �˻�   = , like
select ename,job,hiredate
from emp
where upper(job) like '%'||upper('Ma')||'%'  ;


select concat('Db','Test') 
from dual;

select concat(ename,job) 
from emp;

select ename||job 
from emp;

select round(3.14159),mod(10,3) 
from dual;

select sysdate from dual;

select sysdate ,
       to_char(sysdate,'MON-dd-YYYY'),
       to_char(sysdate,'DY')
from dual;


insert into emp 
values(9999,'ȫ',null,null,
       to_date('10/10/2018','mm/dd/yyyy'),30,null,10);

insert into emp 
values(9998,'ȫ',null,null,sysdate,30,null,10);

select * from emp;

rollback;

select empno, ename, nvl(to_char(mgr),'CEO') "����ڵ�" from emp;

select empno, ename,sal , sal*1.2 "�����޿�"
from emp;

select empno, ename,sal , deptno, 
       decode(deptno, 10, sal*1.2,20, sal*1.1,sal*0.9 ) "�����޿�"
from emp
order by deptno;


select ename,sal,hiredate,emp.deptno,dname,loc
from emp,dept
where emp.deptno = dept.deptno;


select ename,sal,e.deptno,dname,loc
from emp e,dept d
where e.deptno = d.deptno;


select e.ename,e.sal,s.grade
from emp e ,salgrade s
where sal between losal and hisal
order by grade;


select ename , sal , dname , loc ,d.deptno
from emp e , dept d
where e.deptno(+) = d.deptno
order by d.deptno;


select e.ename "����̸�", m.ename "�Ŵ����̸�"
from emp e, emp m
where e.mgr = m.empno(+);


select e.ename "����̸�",e.sal, m.ename "�Ŵ����̸�",m.sal
from emp e, emp m
where e.mgr = m.empno;

//�Ŵ��� ���� �޿��� �� ���� ���
select e.ename "����̸�",e.sal, m.ename "�Ŵ����̸�",m.sal
from emp e, emp m
where e.mgr = m.empno and e.sal > m.sal

//�Ŵ��� ���� �Ի����� ���� ���

select e.ename "����̸�",e.hiredate, 
       m.ename "�Ŵ����̸�",m.hiredate 
from emp e, emp m
where e.mgr = m.empno and e.hiredate < m.hiredate

select e.ename "����̸�",
       m.ename "�Ŵ����̸�" 
from emp e, emp m
where e.mgr = m.empno and e.hiredate < m.hiredate

//�����Լ�

select round(avg(sal)) "��ձ޿�" , 
       count(*) "�����",
       max(sal),
       min(sal)
from emp;


select ename,round(avg(sal)) "��ձ޿�" , 
       count(*) "�����",
       max(sal),
       min(sal)
from emp
where deptno=20;

//�μ� ��ȣ�� ��ձ޿�
select deptno, round(avg(sal)),count(*)
from emp
group by deptno

//�μ� �̸��� ��� �޿� ���ϱ�
select d.deptno, d.dname "�μ���",round(avg(sal)) "��ձ޿�"
from dept d,emp e
where e.deptno = d.deptno
group by d.dname,d.deptno
order by d.deptno,"��ձ޿�"

//���ú� ��� �޿� ���ϱ�

select loc, avg(sal) "��� �޿�"
from emp e,dept d
where e.deptno = d.deptno
group by loc
order by "��� �޿�";


//�μ� �̸��� ��� �޿��� 2000 �̻��� �μ� ���
select dept.dname, avg(sal) "��ձ޿�"
from emp , dept
where emp.deptno = dept.deptno
group by dept.dname
having  avg(sal)>=2000
order by "��ձ޿�";

select to_char(hiredate,'mm') "�Ի��"  
from emp

select count(*)  
from emp


//���� �Ի��ڼ� ��ȸ ������ 

select to_char(hiredate,'mm') "�Ի��" , count(*)||' ��' "�Ի��ڼ�"
from emp
group by to_char(hiredate,'mm')
order by "�Ի��"




//smith ���� �޿��� ���� ��� ����

select sal from emp
where lower(ename) = lower('smith');

800

select *
from emp
where sal > (   select sal from emp
where lower(ename) = lower('jones')   )


//������ �ְ� �޿��� �޴� ����� ���

select ename,sal,job
from emp
where (job,sal) in (select job,max(sal)
                    from emp
                    group by job
                    )
order by job;


select job,max(sal)
from emp
group by job

X
select ename,sal,job
from emp
where  sal = (select avg(sal)
              from emp
              group by job)
X  =   ==>   in







select
from
where
group by
having
order by 





select max("�Ի��ڼ�")
from  (
select to_char(hiredate,'mm') "�Ի��" , count(*)||' ��' "�Ի��ڼ�"
from emp
group by to_char(hiredate,'mm')
order by "�Ի��"
)


select emoloyee_id, employee_id, first_name, department_name, manager.firstname 
from employee,manager;
