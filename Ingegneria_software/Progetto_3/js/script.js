// le funzioni servono a racchiudere in un unico punto più istruzioni
// dichiaro una funzione

//dichiarazione funzione - metodo
function saluta(){
    //1.acquisire il nome utente e stampare un saluto in console
    var nomeUt = "Maria";

    console.log("ciao "+nomeUt);
}

//chiamata alla funzione metodo
saluta();

function salutiPrompt(){
    var nomeUt = prompt("Come ti chiami?");
    console.log("ciao "+nomeUt);
}

salutiPrompt();



