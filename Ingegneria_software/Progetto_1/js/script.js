//commento riga singola
/*
commento multiriga
*/

//javascript conosce il tipo di dato, solo non lo tipizza - per questo in js esistono i tipi

var saluto = "ciao";//dichiaro e assegno contemporaneamente

var num;
num =12;

var presenza = true;

var carattere='c';

var nomeUt = "pippo";

//concatenazione tra stringa
var salutaUt = saluto + " " + nomeUt;
console.log(salutaUt);

//faccio un test per vedere se JS conosce i tipi 
console.log(typeof salutaUt);

// alt+shift+freccia giù copia la riga precedente
console.log(typeof num);
console.log(typeof presenza);

// esempio con 2 num
var num1=10;
var num2 =2;
var sum = num1+num2;
var sub = num1-num2;
var mol = num1*num2;
var div = num1/num2;


// console.log("La somma tra i 2 numeri equivale a: " + (num1+num2));
console.log("La somma tra i 2 numeri equivale a: " + sum);

// Scrivo nella pag
//1. Recupero i miei el html per ID
var primoNum = document.getElementById("primoNum");
var secondoNum = document.getElementById("secondoNum");
var somma = document.getElementById("somma");
var sottrazione = document.getElementById("differenza");
var moltiplicazione = document.getElementById("prodotto");
var divisione = document.getElementById("quoziente");

//2. Vado ad iniettare il contenuto nei miei elementi html
primoNum.innerHTML= "Il primo numero vale: " + num1;
secondoNum.innerHTML= "Il secondo numero vale: " + num2;
somma.innerHTML= "  La somma tra vale: " + sum;
sottrazione.innerHTML= "  La somma tra vale: " + sub;
moltiplicazione.innerHTML= "  La somma tra vale: " + mol;
divisione.innerHTML= "  La somma tra vale: " + div;

//cast dei dati, salto di tipo
var annoCorrente="2023";
var annoNascita = "1992";

var eta= annoCorrente-annoNascita;//questo funziona e fa quello che deve fare
var sommaAnni = annoCorrente + annoNascita;//qui si da priorità alla concatenazione tra stringhe 

//si casta in caso di operatore +
var sommaAnniCast = (Number)(annoCorrente)+(Number)(annoNascita);

console.log(sommaAnni)//20231992
console.log(sommaAnniCast)//4015

//cambio di tipo di una variabile
var nome = "paperino";

//si puo riassegnare il tipo alla variabile precedentemente dichiarata passando un altro tipo
nome = 56; 
nome = true;
nome = ["pippo","paperino","pluto"];
nome= {
    nome: "homer",
    cognome: "simpson",
    pelato: true
}

console.log(nome)