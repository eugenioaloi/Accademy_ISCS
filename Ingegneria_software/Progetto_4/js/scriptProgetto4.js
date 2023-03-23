//per descrivere un'entita complessa si utilizzano gli oggetti cioè istanze di una classe

class Umano{
    nome;
    cognome;

    constructor(nome, cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
}

//annotazione letterale
var persona ={
    nome:"Pippo",
    cognome:"Franco",
    eta:20,
    coloreOcchi:"verdi",

    //Metodi
    studia : function(){
        console.log("Questa persona sta studiando...");
    },

    presentati : function(){
        console.log("Ciao mi chiamo " + this.nome);
    },

}

//per accedere a metodi e proprietà si utilizza la notazione .
console.log(persona.nome + " " + persona.cognome);
persona.studia();
persona.presentati();

var docenteJs = {
    nome:"Pluto",
    cognome:"goffy",
    matricola:2105,
    materia :["js","java","Angular","php","c++"],
    presenza : true,

    presentati : function(){
        let listaMaterie ="";

        this.materia.forEach(materia =>{
            listaMaterie += "<li>" + materia + "</li>";
        });

        let presentazione = "Nome : " + this.nome + " " + this.cognome + ". Matricola: " + this.matricola + "<br> Materie: " + listaMaterie;

        return presentazione;
    }
}

var demo = document.getElementById("demo");
demo.innerHTML = docenteJs.presentati();

