//base e altezza sono i parametri d'ingresso



function calcolaArea(base,altezza){
    let area = base*altezza
    return area;//con questa parola chiave restituisco all'esterno la varibile area
}

var base = 3;
var altezza = 4;

var areaRettangolo = calcolaArea(base,altezza);

console.log("L'area del rettangolo con base " + base+ " e altezza " + altezza + " vale : " + areaRettangolo);

var areaRettangolo2 = calcolaArea(5,10);

console.log("L'area del rettangolo 2 vale : " + areaRettangolo2);

//posso fare il calcolo senza l'utilizzo di una variabile - direttamente con l'utilizzo della funzione
console.log("L'area del rettangolo 3 vale : " + calcolaArea(7,2));

function calcolaVolume(base, altezza,profondità){//volume = base*altezza*profondita
    let area = calcolaArea(base,altezza);
    let volume = area*profondità
    return volume;
}

console.log("Il volume del solido vale : " + calcolaVolume(3,4,10));


function calcolaVolume2Par(area,profondita){ 
    let volume = area*profondita;            
    return volume;
}

console.log("Il volume del solido: "+ calcolaVolume2Par(4,5),6);