#*****************************************

#SUB QUERY - il risultato della query esterna dipende dal risultato della query interna
select * 
from emp
where sal > (
	select sal from emp
	where ename='Daniel'
);

# inline view
select * from
(select ename, job from emp) x;

# le subquery devono avere un allias per funzionare
select * from(
select ename,sal,sal*12 as salario_annuo from emp
) x 
where salario_annuo > 90000;

# funzioni di case 
select ename, sal, job,
	case job
		when 'PROG' then'programmatore'
		when 'CLERK' then 'impiegato'
		when 'ACCOUNT' then'contabile'
	end as lavoro_tradotto
from emp;

select ename, sal,
case 
	when sal>(
		select avg(sal)
		from emp
	)
    then 'salario più alto della media'
    else 'salario uguale o più basso della media'
end as confronto
from emp;

select ename, sal,
	if(sal>(select avg(sal) from emp),'più alto', 'uguale o minore')
from emp;	

-- i risultati di > o < con la subquery danno errore perciò si usa any
-- i risultati di = con la subquery danno errore perciò si usa in
select empno, ename
from emp
where sal > any (
	select min(sal)
    from emp
    group by deptno
);

-- si usa all per tutti i valori compresi in un range 
select * from emp
where job != 'PROG'
and sal < any(
	select sal from emp where job = 'PROG'
);

select prod_id, count(*) ordina
from orderitems
group by prod_id
order by ordina desc
limit 1;

select prod_id, count(*) ordina
from orderitems
group by prod_id
having count(*)>=all(
	select count(*)
	from orderitems
	group by prod_id
)

-- **************** SUBQUERY

#subquery correlate

select *
from emp e 
where e.sal>(
	select avg(sal)
    from emp x 
    where x.DEPTNO = e.DEPTNO
    group by x.DEPTNO
);

select * from dept d
left join emp e 
on d.DEPTNO = e.DEPTNO
where e.EMPNO is null;

-- query con una condizione boolean, per riscrivere la query di prima
select * from dept d
where not exists(
	select * from emp  e
    where e.DEPTNO = d.DEPTNO
);-- c'è anche exist -> cioè dove esiste la condizione

select * from vendors v
where not exists(
	select * from products p
    where v.vend_id=p.vend_id
);



