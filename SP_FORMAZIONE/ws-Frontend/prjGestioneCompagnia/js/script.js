//elenco button
let btnCompagnie = document.querySelector('#btnCompagnia');

//elenco div
let listaCompagnie = document.querySelector("#compagnia");

//elenco url
const urlCompagnia = "http://localhost:8080/gestioneCompagnia/compagnia";

function sezioneCompagnia(){
    listaCompagnie.innerHTML += "pagina compagnia -idcompagnia -nome -nazione -hub"
}

//elenco funzioni
function mostraCompagnie(){
    
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
