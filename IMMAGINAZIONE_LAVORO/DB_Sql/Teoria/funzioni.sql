select concat(nome,' ',cognome) as nome_cognome
from studenti;

select genere, round(avg(length(cognome)),2) 'lunghezza media'
from studenti
group by genere;

insert into studenti(cognome, email, data_nascita) 
values ('rossi','rmarco@gmail.com','1992-02-29');

select * from studenti
where id =(
	select last_insert_id()
);

update studenti
set email = replace(email,'example.com','gmail.com');

select now();

select data_nascita, 
year(data_nascita),
month (data_nascita),
day(data_nascita)
from studenti
order by data_nascita;

-- calcolare quante persone sono nate per ogni anno
select data_nascita, count(*)conto
from studenti
group by data_nascita
order by conto desc;

select date_format('1969-10-05', '%d-%m-%Y'); -- <= formattare una data

select cognome, data_nascita, date_format(data_nascita, '%d-%m-%Y') 'data italiana'
from studenti
order by data_nascita;

-- per trovare la differenza tra delle date
select cognome, data_nascita,
	TIMESTAMPDIFF (year,data_nascita, curdate()) anni
from studenti
order by data_nascita;

-- ************ FUNZIONI DI GRUPPO *************

#funzioni di gruppo

select min(sal), max(sal),avg(sal)
from emp e;

select count(*), count(mgr)-- le funzioni di gruppo non contano i valori null
from emp e;

#conteggio per un valore definito, es (deptno)
select deptno, count(*)
from emp
group by deptno;

#nella select si mettono solo le colonne presenti nel ragruppamento
select deptno, count(*), max(sal), min(sal),avg(sal)
from emp
group by deptno;

# non si può selezionare una colonna su cui raggruppare se non viene identificato il metro di raggruppamento (group by)
select DEPTNO, count(*)
from emp;

select job, count(*), max(sal)
-- , min(sal),avg(sal)
from emp
group by job
order by max(sal) desc;

#si possono anche raggruppare più colonne
select DEPARTMENT_ID, job_id,sum(salary)
from employees
group by DEPARTMENT_ID, job_id;

#se volessi sapere solo i risultati di un avg secondo dei parametri definiti? es avg(prod_price)>4000 -> si usa la having
select vend_id, avg(prod_price)
from products
group by vend_id
having avg(prod_price)>4;

select job, sum(sal)
from emp
group by job
having sum(sal)>40000;

-- raggruppamento a livello di righe
select deptno, sum(sal) over(partition by deptno)
from emp;
-- group by deptno;

select row_number() over() "numero impiegato",
	emp.*,
    row_number() over(partition by deptno) "numero impiegato per dip",
	sum(sal) over (partition by deptno ) "somma per dipartimento",
	sum(sal) over (partition by job ) "somma per lavoro",
    sum(sal) over() "salario totale",
    count(*) over (partition by deptno) "numero impiegati per dip"
from emp;

-- inner join
select i.ename as impiegato, 'lavoro per', 
m.ename as manager, m.empno
from emp i, emp m
where i.mgr= m.empno;

-- outer left e right join
select * from emp e 
left outer join dept d
on d.deptno = e.deptno
union -- per unire le due join
select * from emp e 
right outer join dept d
on d.deptno = e.deptno;

select * from emp e right outer join dept d
on d.deptno = e.deptno
where empno is null;

select * from departments d 
left outer join employees e
on d.department_id = e.departement_id
union
select * from departments d 
left outer join employees e
on d.department_id = e.departement_id;
