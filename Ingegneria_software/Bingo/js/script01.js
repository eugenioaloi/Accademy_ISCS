//elementi statici della pagina
var btn = document.getElementById("btn");

var numeriEstratti = [];
var tentativi = 0;


function estrai(){

    var numDaEstrarre = Number(Document.getElementById("numDaEstrarre").value);

    if(numDaEstrarre<=90){

        for(var i=0;i<numDaEstrarre;i++){

            var numCasuale = Math.ceil(Math.random()*90);

            if(!numeriEstratti.includes(numCasuale)){
                numeriEstratti.push(numCasuale);
            }else{
                i--
            }
            
            tentativi++;
        }
        console.log("Numeri estratti: " + numeriEstratti);
        console.log("Tentativi: " + tentativi);
    }else{
        console.log("Non puoi estrarre più di 90 numeri");
    }
}

btn.onclick = estrai;
//btn.addEventListener("click",estrai,false); -> si può attivare il click anche con l'event listener

//Perchè i-- nel ciclo. La condizione ci dice, se non trovi il numero mettilo nell'array, se lo trovi fai altro
//la logica dietro è questa

//1°giro i = 0 -> 14
//2°giro i = 1 -> 6;
//3°giro i = 2 -> 14 adesso la i = 3 --> i = 2
