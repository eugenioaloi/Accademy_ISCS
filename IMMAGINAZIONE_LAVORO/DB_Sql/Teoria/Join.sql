select * 
from emp e, dept d-- prodotto cartesiano tra le tabelle se non viene fatta un uguaglianza
where d.DEPTNO=e.DEPTNO;

-- versione standard di scrivere una join
select * from
dept d join emp e 
on d.DEPTNO = e.DEPTNO;

select * from customers c, orders o
where c.cust_id = o.cust_id;

-- versione standard
select * from 
customers c join orders o
on c.cust_id = o.cust_id;

select *
from vendors v, products p
where v.vend_id = p.vend_id;

# Query su tutte le tabelle per seguire a ritroso le info collegate tra loro
select * from 
	customers c, orders o, orderitems oi, products p, vendors v
    where c.cust_id = o.cust_id
    and o.order_num= oi.ORDER_NUM
    and oi.PROD_ID = p.prod_id
    and p.vend_id = v.vend_id
		and p.prod_id = 'br01';-- per qualsiasi condizione
        
-- sintassi standard
select * from customers c 
join orders o
on c.cust_id = o.cust_id
join ordersitems oi
on o.order_num= oi.ORDER_NUM
join products p
on oi.PROD_ID = p.prod_id
join vendors v
on p.vend_id = v.vend_id;


select titolo, prezzo, nome as editore
from editore e
-- from editore e, libro l
join libro l
-- where e.id = l.editore_id
on e.id = l.editore_id
order by titolo;

-- *********************************** JOIN LEFT E RIGHT


-- right, left -> Dipende tutto dalla posizione in cui si mettono le tabelle neglla query
select titolo, prezzo, nome 
from editore e
-- from editore e, libro l
left join libro l -- tieni conto anche di ciò che non matcha con l'uguaglianza dell'altra tabella
-- where e.id = l.editore_id
on e.id = l.editore_id
order by titolo;

-- *******************************
select titolo, nome, cognome
from autore a
left join autore_libro al
on a.id = al.autore_id
left join libro l
on al.libro_id = l.id
where l.id is null;

-- ************************ LEFT
select titolo, nome
from editore e
left join libro l
on e.id = l.editore_id
where l.editore_id is null;

-- ********************** RIGHT
select titolo, nome
from editore e
right join libro l
on e.id = l.editore_id
where e.id is null;

-- ********************** UNION
select titolo, nome
from editore e
left join libro l
on e.id = l.editore_id
where l.editore_id is null
union
select titolo, nome
from editore e
right join libro l
on e.id = l.editore_id
where e.id is null;

-- ******************** UNION
select cognome, data_nascita, 'x' generazione
from studenti 
where data_nascita < '1980-01-01'
union
select cognome, data_nascita, 'Millenials' generazione
from studenti 
where data_nascita between '1980-01-01' and '1994-12-31'
union
select cognome, data_nascita, 'Z' generazione
from studenti 
where data_nascita > '1994-12-31'
order by data_nascita;

select count(*), 'maschi' conteggio
from studenti
where genere ='m'
union
select count(*), 'femmine' conteggio
from studenti
where genere ='f';

-- ********************************** GROUP BY
select genere, count(*)
from studenti
group by genere;

select distinct cognome -- con distinct si fa la distinzione univoca, solo un valore viene visualizzato
from studenti
group by cognome
order by cognome;

select provincia, genere, count(*) conteggio
from studenti
group by provincia, genere
order by provincia ;

/**** ORDINE DA RISPETTARE DELLE PAROLE CHIAVE *****
select
from
where
group by
having
order by
limit*/
