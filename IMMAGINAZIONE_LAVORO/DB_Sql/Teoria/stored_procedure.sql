use formatemp;

-- creare una procedure
create procedure getAllStudents()
	select nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_nascita
    from studenti order by cognome;

-- richiamare una procedure
call getAllStudents();

create procedure getCustomersContact()
	select * from java_sql.customers;
    
call getCustomersContact();    

-- ********************************* alle procedure si possono passare anche i parametri
create procedure clientsOrders( in p_id_cliente int)
	select c.cust_name, o.order_num, o.order_date
	from customers c
	join orders o
	on c.cust_id = o.cust_id
	and o.cust_id = p_id_cliente;

select * from customers;

call clientsOrders(1000000001);

select cognome, nome,
	ifnull (nome, 'manca nome')
from formatemp.studenti;

create procedure getClientOrder(
	p_cliente_id int, p_ordine_id int
)
select c.cust_name, o.order_num, o.order_date
	from customers c
	join orders o
	on c.cust_id = o.cust_id
	and o.cust_id = ifnull(p_cliente_id,o.cust_id)
    and o.order_num = ifnull(p_ordine_id, o.order_num);

call getClientOrder(null,null);

drop procedure updateOrderItem;
create procedure updateOrderItem(
	p_ordine_id int, p_articolo_id varchar(10), p_quantita int
)
	update orderitems
	set quantity = p_quantita
	where order_num = p_ordine_id
    and prod_id = p_articolo_id;

select * from orderitems;

call updateOrderItem(20006,'BR01',60);

select * from orders;