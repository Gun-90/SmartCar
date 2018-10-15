select * from dept;

--SELGRADE는 확인이 안됨
select * from SALGRADE;

-- f 또는 F가 호함된 ename 찾기
select ename,job, hiredate from emp 
where lower(ename) like '%'||lower('f')||'%';

select empno, ename, nvl(to_char(mgr),'CEO') "상사코드" from emp;

select empno, ename, sal , sal *1.2 "조정급여" from emp;

-- decode 함수 java의 스위치문과 비슷
select empno, ename, sal , deptno ,
	decode(deptno, 10, sal* 1.2,20, sal*1.1 , sal*0.9)"조정급여" from emp;


select ename,sal,hiredate,dname,loc from emp,dept;

select ename,sal,hiredate,dname,loc from emp,dept where emp.depno = dept.deptno;


select * from dept;
select * from SALGRADE;

select 컬럼 as "~~~~" , 
from 테이블명
where 조건
order by 

select ename,job,hiredate,sal+comm
from emp;

select ename,job,hiredate,sal+nvl(comm,0)
from emp;

select ename,job,hiredate,sal+nvl(comm,0) "급 여"
from emp
where deptno=20
order by "급 여";

select ename,job,lower(ename)
from emp;

//이름에 f/F 가포함된 사원 검색   = , like
select ename,job,hiredate
from emp
where upper(ename) like '%'||upper('F')||'%'  ;


//job에 ma/Ma/mA/MA 가포함된 사원 검색   = , like
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
values(9999,'홍',null,null,
       to_date('10/10/2018','mm/dd/yyyy'),30,null,10);

insert into emp 
values(9998,'홍',null,null,sysdate,30,null,10);

select * from emp;

rollback;

select empno, ename, nvl(to_char(mgr),'CEO') "상사코드" from emp;

select empno, ename,sal , sal*1.2 "조정급여"
from emp;

select empno, ename,sal , deptno, 
       decode(deptno, 10, sal*1.2,20, sal*1.1,sal*0.9 ) "조정급여"
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


select e.ename "사원이름", m.ename "매니저이름"
from emp e, emp m
where e.mgr = m.empno(+);


select e.ename "사원이름",e.sal, m.ename "매니저이름",m.sal
from emp e, emp m
where e.mgr = m.empno;

//매니저 보다 급여가 더 많은 사원
select e.ename "사원이름",e.sal, m.ename "매니저이름",m.sal
from emp e, emp m
where e.mgr = m.empno and e.sal > m.sal

//매니저 보다 입사일이 빠른 사원

select e.ename "사원이름",e.hiredate, 
       m.ename "매니저이름",m.hiredate 
from emp e, emp m
where e.mgr = m.empno and e.hiredate < m.hiredate

select e.ename "사원이름",
       m.ename "매니저이름" 
from emp e, emp m
where e.mgr = m.empno and e.hiredate < m.hiredate

//집계함수

select round(avg(sal)) "평균급여" , 
       count(*) "사원수",
       max(sal),
       min(sal)
from emp;


select ename,round(avg(sal)) "평균급여" , 
       count(*) "사원수",
       max(sal),
       min(sal)
from emp
where deptno=20;

//부서 번호별 평균급여
select deptno, round(avg(sal)),count(*)
from emp
group by deptno

//부서 이름별 평균 급여 구하기
select d.deptno, d.dname "부서명",round(avg(sal)) "평균급여"
from dept d,emp e
where e.deptno = d.deptno
group by d.dname,d.deptno
order by d.deptno,"평균급여"

//도시별 평균 급여 구하기

select loc, avg(sal) "평균 급여"
from emp e,dept d
where e.deptno = d.deptno
group by loc
order by "평균 급여";


//부서 이름별 평균 급여가 2000 이상인 부서 목록
select dept.dname, avg(sal) "평균급여"
from emp , dept
where emp.deptno = dept.deptno
group by dept.dname
having  avg(sal)>=2000
order by "평균급여";

select to_char(hiredate,'mm') "입사월"  
from emp

select count(*)  
from emp


//월별 입사자수 조회 퀴리문 

select to_char(hiredate,'mm') "입사월" , count(*)||' 명' "입사자수"
from emp
group by to_char(hiredate,'mm')
order by "입사월"




//smith 보다 급여가 많은 사원 정보

select sal from emp
where lower(ename) = lower('smith');

800

select *
from emp
where sal > (   select sal from emp
where lower(ename) = lower('jones')   )


//직종별 최고 급여를 받는 사람의 목록

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





select max("입사자수")
from  (
select to_char(hiredate,'mm') "입사월" , count(*)||' 명' "입사자수"
from emp
group by to_char(hiredate,'mm')
order by "입사월"
)


select emoloyee_id, employee_id, first_name, department_name, manager.firstname 
from employee,manager;
