-- Query su database SCUOLA usate la sintassi join;

-- 1) seleziona nome, cognome del docente, titolo del corso di cui è insegnante e prezzo del corso che insegna
select nome, cognome, titolo, prezzo
from docenti d
join corsi c
on d.id = c.docente_id;

-- 2) seleziona i corsi che costano meno di 200€
select titolo, prezzo
from corsi where prezzo < 200;

-- 3) seleziona i corsi che costano di più e ordinali per titolo
select titolo from corsi
where prezzo = (
	select max(prezzo)
	from corsi
);

-- 4) seleziona nome, cognome dello studente, nome del corso a cui è iscritto. Ordina per cognome studente
select nome, cognome, titolo
from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on i.corso_id = c.id
order by cognome;

-- 5) Conta gli studenti iscritti per ciascun corso
select titolo, count(*) as `studenti_iscritti`
from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on i.corso_id = c.id
group by titolo;

-- 6) Conta gli studenti iscritti al corso "Java"
select titolo, count(*) as `studenti_iscritti`
from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on i.corso_id = c.id
group by titolo
having titolo = 'Java';



-- 8) seleziona nome, cognome e email del docente che insegna nel corso "CSS"
select nome, cognome, email
from docenti d
join corsi c
on d.id = c.docente_id
where titolo = 'CSS';

-- 9) seleziona cognome del docente, nome del corso che insegna. 
-- Considerando anche i docenti a cui non è stato assegnato alcun corso. Ordina per cognome docente.
select cognome, titolo
from docenti d
left join corsi c
on d.id = c.docente_id
order by cognome;

-- 10) seleziona i corsi a cui non è stato assegnato alcun docente. Ordina per titolo corso
select titolo from corsi c
left join docenti d
on c.docente_id = d.id
where nome is null
order by titolo;

-- 11) seleziona elenco degli studenti non ancora iscritti ad alcun corso e ordinali per cognome
select cognome, nome from studenti s
left join iscrizioni i 
on s.id = i.studente_id
left join corsi c
on i.corso_id = c.id
where c.id is null
order by cognome;

-- 12) seleziona solo elenco dei corsi senza iscrizioni e ordinali per corso
select titolo from corsi c
left join iscrizioni i 
on c.id = i.corso_id
where studente_id is null
order by titolo;

-- 13) seleziona cognome degli studenti iscritti, nome del corso a cui sono iscritti e nome e cognome del docente
select s.cognome, d.nome, c.titolo from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on i.corso_id = c.id
join docenti d 
on d.id = c.docente_id;

-- 14) seleziona cognome degli studenti iscritti al corso "CSS" e nome e cognome del docente
select s.cognome, d.nome, d.nome from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on i.corso_id = c.id
join docenti d 
on d.id = c.docente_id
where c.titolo = 'CSS';

-- 15) seleziona i corsi, la quantità degli iscritti per ciascuno, il prezzo del corso e il valore delle iscrizioni per quel corso
select titolo, count(*), c.prezzo, c.prezzo*count(*) as `totale`
from iscrizioni i
join corsi c
on c.id = i.corso_id
group by i.corso_id, c.prezzo
order by titolo;