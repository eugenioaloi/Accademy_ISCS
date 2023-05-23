//elenco button
let btnCompagnie = document.querySelector('#btnCompagnia');

//elenco div
let listaCompagnie = document.querySelector("#compagnia");

//elenco funzioni
function mostraCompagnie(){
    const url = "http://localhost:8080/gestioneCompagnia/compagnia";
    
    fetch(url)
    .then(data => {return data.json()})
    .then(response => {
        console.log(response);
        response.forEach(el => {
            listaCompagnie.innerHTML += "<li> " + el.nome 
                + " - Nazione: "+ el.nazione+"</li>";
        });
    });
}

btnCompagnie.addEventListener("click",mostraCompagnie);
