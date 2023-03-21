1- select cognome, nome, email, data_nascita
from studenti
 where cognome='verdi' 
 order by nome

2- select cognome, nome, email, data_nascita
from studenti
 where genere='f' 
 order by cognome

3- select cognome, nome, email, data_nascita, citta
from studenti
 where citta!='torino' 
 order by cognome and cognome;

4- select cognome, nome, email, data_nascita
from studenti
where data_nascita >= '2000-03-30'
order by data_nascita asc

5-select cognome, nome, email, data_nascita
from studenti
where genere='m' and provincia='al'
order by cognome

6- select cognome, nome, email, data_nascita
from studenti
where provincia='at' or provincia='no'
order by cognome and provincia

7-select cognome, nome, email, data_nascita
from studenti
where provincia in('cn','at','no','al')
order by cognome and provincia

8- select cognome, nome, email, data_nascita
from studenti
where data_nascita between '1990-02-03' and '2000-03-30'
and genere='f'
order by data_nascita desc;

9-select cognome, nome, email, data_nascita
from studenti
where data_nascita not between '1990-02-03' and '2000-03-30'
and genere='f'
order by data_nascita desc;

10-select cognome, nome, email, data_nascita
from studenti
where cognome like'r%'
order by cognome and nome;

11- select cognome, nome, email, data_nascita
from studenti
where cognome regexp'[vd]e'
order by cognome;



