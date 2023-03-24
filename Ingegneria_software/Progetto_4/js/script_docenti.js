//funzione costruttore per il docente (nome, cognome, matricola, materia)
function Docente(nome, cognome, matricola, materia){
    this.nome = nome;
    this.cognome = cognome;
    this.matricola = matricola;
    this.materia = materia;

    //con i seguenti metodi:
       
    //insegnoMateria() -> sto insegnando materia
    this.insegnamateria = function(){
        let insegnamento = "Sto insegnando questa materia: " + this.materia[0];
        return insegnamento;
    }

    //presentati() -> ciao mi chiamo
    this.presentati = function(){
        let presentazione = "Ciao mi chiamo " + this.nome;
        return presentazione;
    }
}

var docenti = [
    new Docente("Pippo","Franco",345,"Cabaret"),
    new Docente("Homer","Simpson",7,"Fissione nucleare"),
    new Docente("Maicol","Scott",123,"Magia manageriale"),
    new Docente("Mario","Rossi",345,"Visual basic")
];

//Nella pagina mostrare una lista di docenti
var elencoDocenti = document.getElementById("listaDocenti");

docenti.forEach(docente => {
    elencoDocenti.innerHTML += "<li>" + docente.presentati()  + ". " + docente.insegnamateria() + "</li>"
});


//per inserire un nuovo docente prendo i valori dei campi input e creo una funzione nella quale faccio new docente
//faccio push del nuovo docente nell'array e ristampo la lista docenti


//********* da fare insieme ***************

//La matricola deve essere autoincrementale