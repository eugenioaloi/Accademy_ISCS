//Operatori logici
//! -> NOT serve a negare una condizione (!= is not equal)
//&& -> AND permette di valutare contemporaneamente due condizioni
//!!-> OR permette di valutare singolarmente due o più condizioni

//Tabella delle verità, ovvero gli operatori logici


//BUSINESS LOGIC DEL VIDEOGAME -> per superare un livello il giocatore deve avere +50 punti e un punteggio skill +30 punti

var punteggio = 60;
var skill = 40;

//Videogame Hard mode
if(punteggio>=50 && skill>=30){//entrambe le soglie devono essere TRUE
    console.log("Bravo hai superato il livello");
}else if(punteggio>=50 && skill<30){
    console.log("Mi dispiace, non hai superato il livello. Devi migliorare le tue skills");
}else if(punteggio<50 && skill>=30){
    console.log("Mi dispiace, non hai superato il livello. Devi migliorare il tuo punteggio");
}else{
    console.log("Mi dispiace non hai superato il livello perchè hai skils e punteggio sotto la soglia");
}

//Videogame Easy mode
if(punteggio>=50 || skill >=30){
    console.log("Bravo hai superato il livello");
}else{
    console.log("Mi dispiace non hai superato il livello perchè hai skils e punteggio sotto la soglia. Ti basta migliorarne una per vincere");
}