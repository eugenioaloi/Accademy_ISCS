#Esercizi
select * from orderitems;

-- 1)
select vend_id, count(*)
from products
group by vend_id;

-- 2)
select ename, count(*)
from emp
group by ename
having count(*)>1;

-- 3)
select order_num, count(*)
from orderitems
group by order_num
having count(*)>=3;

-- 4)
select vend_id, count(*)
from products
where prod_price >=4
group by vend_id
having count(*)>=2;

-- 5)
select prod_id, count(*) conto
from orderitems
group by prod_id
order by conto desc
limit 1;

-- 6)
select order_num, sum(item_price*quantity) tot
from orderitems
group by order_num
order by tot desc
limit 1;

-- 7)
select * from emp 
where job = (
	select job from emp where ename ='Steven'
);

-- 8) Con il group by: l'impiegato che guadagna di più 
select ename, max(sal) massimo
from emp
group by sal, ename
order by massimo desc
limit 1;

-- 8Bis) x salario discendente si prende solo il primo ris
select ename, sal from emp;

-- 9)
select ename, deptno
from emp
where deptno=20 and sal >= (
	select min(sal)
    from emp
    where deptno = 10
);

-- 10)
select ename, deptno
from emp
where deptno = (
	select deptno from emp
    where ename like '%t%'
);

-- 11)
select * from emp
where deptno = 10
and sal > any(
	select sal from emp
    where deptno = 30
);

-- 12)
select deptno
from emp where sal =(
	select max(sal) from emp
)
limit 1;

-- 13)
select *
from products p where p.vend_id=(
	select * from vendors v
	where v.vend_country='england'
);

-- 13) VERSIONE BIS dell'esercizio precedente
select * 
from products p, vendor v
where p.vend_id = v.vend_id
and v.vend_country='England';

-- 14)
select deptno, count(*) nDip
from emp 
where sal > 4000
group by deptno
order by nDip desc
limit 1;

-- 15)
select deptno, max(sal) as max_sal
from emp
group by deptno
having count(*)>5
order by max_sal desc
limit 1;

-- 16)
select *
from orders o
where o.cust_id = (
	select c.cust_id 
	from customers c 
	where c.cust_email = 'sales@villagetoys.com'
);

-- 17)
select * 
from orderitems oi
where oi.prod_id in(
	select prod_id from products p
    where p.prod_price = (
		select min(order_price)
		from products
    )
);

-- 18)
select oi.prod_id 
from orderitems oi
where oi.order_num = (
	select order_num 
    from orders o
    where c.cust_id = (
		select cust_id from customers c
        where c.cust_email='sales@villagetoys.com'
    )
);

-- 18) Versione BIS con le Join senza subquery
select * 
from products p, orderitems oi, orders o, customers c
where p.prod_id = oi.prod_id
and oi.order_num = o.order_num
and o.cust_id = c.cust_id
and c.cust_email = 'sales@villagetoys.com';

-- 19)
select ename, job, sal, count(*) over() as nEmp, 
	avg(sal) over(partition by deptno) as media
from emp where sal>(
	select avg(sal)
	from emp
);

-- 20) chi ha ordinato il prod 'rgan01'
select c.cust_name, oi.prod_id
from customers c
join orders o 
on c.cust_id = o.cust_id
join orderitems oi
on o.order_num = oi.order_num
where oi.prod_id = 'RGAN01';

-- 21) il nome del dip dove ci sono almeno 6 lavoratori
select d.dname, count(*) conto
from dept d,emp e
where d.deptno = e.deptno
group by d.dname
having conto>=6;

-- 22) i prodotti ordinati da nessuno
select *
from products p
left join orderitems oi 
on p.prod_id= oi.prod_id
where oi.prod_id is null;




