set @custom = 'eugenio';
select @custom as nome_var;

set @prezzoMedio = (select avg(prezzo) from libro);
select @prezzoMedio;

select * from libro where prezzo> @prezzoMedio;

DELIMITER $$ 
create function anni(
	p_data_nascita date
)
	returns tinyint
	not deterministic 
begin
	declare eta tinyint;
    set eta = timestampdiff(year,p_data_nascita,curdate());
    return (eta);
end$$
DELIMITER ;

-- utilizzo della funzione per calcolare l'età degli studenti
select nome, cognome, anni(data_nascita) from formatemp.studenti;

update customers c set points= 
if(
	(select sum(quantity*ITEM_PRICE)
		from orders o, orderitems oi
		where o.order_num= oi.order_num
		and o.cust_id= c.cust_id
		group by o.cust_id >0),
		(select sum(quantity*ITEM_PRICE)
			from orders o, orderitems oi
			where o.order_num= oi.order_num
			and o.cust_id= c.cust_id
	group by o.cust_id),
0);

select * from customers;

delimiter $$
create function clienteLevel(p_credit_value smallint)
	returns varchar(8)
    deterministic
begin
	declare client_level varchar(8);
    case
		when p_credit_value > 3000 then set client_level = 'platinum';
        when p_credit_value > 2000 and  p_credit_value <= 3000 then set client_level = 'gold';
        when p_credit_value > 1000 and  p_credit_value <= 2000 then set client_level = 'silver';
        when p_credit_value >=1 and  p_credit_value <= 1000 then set client_level = 'basic';
        when p_credit_value <1 then set client_level = 'none';
	end case;
    return (client_level);
end$$

select cust_name, clienteLevel(points) from customers;

-- query per vedere tutte le funzioni associate
show function status where db = 'java_sql'

show create function clienteLevel;

drop function clienteLevel;
