select * from clienti where cod_cliente="CL01";

select * from clienti c
join biglietti b
on c.cod_cliente=b.cod_cliente
where cod_operazione = 1;

#****************

UPDATE biglietti
SET qt_biglietti = 10+10
WHERE cod_operazione = 1;

#Ultimo punto
select cognome,nome, tipo_pagamento, qt_biglietti, data_volo, orario_volo,partenza, destinazione
from clienti c
join biglietti b
on c.cod_cliente = b.cod_cliente
join voli v
on b.id_volo = v.id_volo

