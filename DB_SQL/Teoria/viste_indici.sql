
-- *************************** VISTE

create or replace view contatti_studenti as
select id,nome,cognome,email from studenti;

insert contatti_studenti(nome, cognome,email)
values ('gino','michi','ginomichi@gmail.com');

update contatti_studenti
set email = 'g.michi@icloud.com'
where id = 55;

delete from contatti_studenti where id = 55;

create or replace view studenti_to as
select nome, cognome,indirizzo, citta, provincia, regione, email, data_nascita
from studenti
where provincia ='to'
with check option;-- setta il vincolo della vista per le prossime query. vista = città to con check option si può mettere solo prov = to

select * from studenti_to;

-- *************************** INIDICI

-- per farsi spiegare dal motore di mysql le performance di una query
explain select * 
from studenti 
use index (prov_cogn)
where provincia = 'to'
and cognome like 'r%';

-- si possonp migliorare le performance delle query con l'utilizzo di indici
create index prov_cogn on studenti(provincia,cognome);

use blog;

-- il fulltext controlla la pertinenza dei risultati
select *, 
match(titolo,testo) against('react redux')
 from posts
 where match(titolo,testo) against('react redux');-- con questo script permette alla query di mettere in ordine i risultati

select *, 
match(titolo,testo) against('"gestione dello stato"')-- con l'operatore "" si può cercare per stringa specifica
 from posts
 where match(titolo,testo) against('"gestione dello stato"')


create fulltext index ftk_titolo_testo on posts(titolo,testo);