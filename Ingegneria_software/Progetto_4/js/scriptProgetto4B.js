//Notazione con costruttore
function Studente(nome, cognome, mail, matricola, materie){
    this.nome = nome;
    this.cognome = cognome;
    this.mail = mail;
    this.matricola = matricola;
    this.materie = materie;

    this.studia = function(){
        return this.nome + "Sta studiando"
    }

    //con la parola chiave this si dice a JS che la funzione presentati appartiene alla classe Studente
    this.presentati = function(){
        let presentazione = "Ciao mi chiamo "+ this.nome + " " + this.cognome;
        return presentazione;
    }

    this.setVoto = function(voto){
        this.voto = voto;
        return voto;
    }
}

// presentati(); -> questa funzione non esiste al di fuori della classe Studente, per richiamarla si deve creare un'istanza della classe e 
// richiamare il metodo direttamente con l'annotazione . 

var studente1 = new Studente("Antonio", "Fuentes", "a.fuentes@mail.com",1, ["java","html","php"]);
console.log(studente1.presentati);

var studente2 = new Studente("Prosperosa", "La rue", "p.larue@mail.com",2, ["SQL","Java"]);
console.log(studente2.presentati);


var aula = [
    new Studente("Nino", "Pinto", "n.pinto@mail.com",3, ["java","html"]),
    new Studente("Donal", "Duck", "d.ducko@mail.com",4, ["Python","Ruby"]),
    new Studente("Marge", "Simpson", "m.simpsoo@mail.com",5, ["java","C#","css"]),
]

aula.forEach(studente =>{
    console.log(studente);
});

var elencoStudenti = document.getElementById("elencoStudenti")

aula.forEach(studente =>{
    elencoStudenti.innerHTML += "<li>" + studente.nome + " " + studente.cognome + " con matricola: " + studente.matricola + "</li>"
});


 