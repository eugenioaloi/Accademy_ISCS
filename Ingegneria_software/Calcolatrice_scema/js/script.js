var btn = document.getElementById("btn");
var operazioni = document.getElementById("operazioni");

//prima versione con un'unica funzione
// function calcoli(){
//     let num1 = document.getElementById("num1").value;
//     let num2 = document.getElementById("num2").value;
    
//     let sum = (Number)(num1)+(Number)(num2)
//     let sub = num1-num2
//     let mol = num1*num2
//     let div = num1/num2
    
//     operazioni.innerHTML = "<ul>"+ 
//                                 "<li> La somma equivale a: " + sum + 
//                                 "<li> La sottrazione equivale a: " + sub + 
//                                 "<li> La moltiplicazione equivale a: " + mol + 
//                                 "<li> La divisione equivale a: " + div + 
//                            "</ul>";
    
// }

// btn.onclick = calcoli;

//per ogni operazione viene fatta una funzione per dividere tutte le funzionalità, che vengono poi controllate da una sola funzione
//Tutto viene spachetizzato per rendere il codice più snello e non monolitico

function somma(num1, num2){
    let res = Number(num1) + Number(num2);
    return res;
}

function sottrazione(num1, num2){
    let res = num1- num2;
    return res;
}

function moltiplicazione(num1, num2){
    let res = num1*num2;
    return res;
}

function divisione(num1, num2){//In JS si possono avere due tipi di ritorno -> qui true: torna una stringa, false: torna un numero
    if(num2==0){
        let avviso = "Non poso dividere per 0"
        return avviso;
    }else{
        let res = num1/num2;
        return res;
    }
}

function calcola(){
    let numero1 = document.getElementById("num1").value;
    let numero2 = document.getElementById("num2").value;

    let res =   "<ul>"+ 
                    "<li> La somma equivale a: " + somma(numero1,numero2) + 
                    "<li> La sottrazione equivale a: " + sottrazione(numero1,numero2) + 
                    "<li> La moltiplicazione equivale a: " + moltiplicazione(numero1,numero2) + 
                    "<li> La divisione equivale a: " + divisione(numero1,numero2) + 
                "</ul>";

    operazioni.innerHTML = res;            
}

btn.onclick = calcola;