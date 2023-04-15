1) select libro.titolo,libro.pagine, libro.prezzo, editore.nome
from libro, editore
where libro.editore_id = editore.id and editore.nome = "Bompiani"
order by titolo;

2) select libro.titolo,libro.pagine, libro.prezzo, editore.nome
from libro, editore
where libro.editore_id = editore.id and libro.prezzo <= 10
order by prezzo asc;

3) select libro.titolo,libro.pagine, libro.prezzo, editore.nome
from libro, editore
where libro.editore_id = editore.id 
and editore.nome = 'Mondadori' and libro.prezzo <= 10
order by prezzo asc;

4) select libro.titolo,libro.pagine, libro.prezzo, editore.nome
from libro, editore
where libro.editore_id = editore.id 
and libro.titolo regexp '^il|^la' 
order by prezzo asc;

5) select libro.titolo,libro.pagine, libro.prezzo, autore.nome, autore.cognome, autore.nazionalita
from libro, autore
where libro.id = autore.id and 
autore.nazionalita regexp 'en|it' 
order by nazionalita;

6) select libro.titolo,libro.pagine, libro.prezzo, autore.nome, autore.cognome
from libro, autore
where libro.id = autore.id 
and autore.cognome regexp '^c'
order by nazionalita;

7)select libro.titolo, libro.pagine, libro.prezzo, editore.nome, autore.cognome
from libro, editore, autore, autore_libro
where libro.editore_id = editore.id and autore_libro.libro_id=libro.id and autore_libro.autore_id=autore.id
order by libro.titolo;

8)select libro.titolo, libro.pagine, libro.prezzo, editore.nome, autore.cognome
from libro, editore, autore, autore_libro
where libro.editore_id = editore.id and autore_libro.libro_id=libro.id and autore_libro.autore_id=autore.id
and libro.prezzo > 10
order by libro.prezzo desc;

9)select libro.titolo, libro.prezzo
from libro, editore
where libro.editore_id = editore.id and editore.nome='Mondadori';

10)select titolo 
from libro
where titolo regexp '^il'
order by titolo;

11)select autore.nome, autore.cognome, libro.titolo, libro.prezzo 
from autore, libro, autore_libro
where  autore_libro.libro_id = libro.id and autore_libro.autore_id = autore.id
and autore.nazionalita ='en'
order by autore.nome;
