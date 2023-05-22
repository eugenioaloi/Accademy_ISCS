var listaAereo = document.getElementById("companie");

const url = "http://localhost:8080/gestioneCompagnia/compagnia";

fetch(url)
.then(data => {return data.json()})
.then(response => {

    console.log(response.data);
        
    let arrCompanie = response.data.results;
     
    arrCompanie.forEach(element => {
        listaAereo.innerHTML += "<li> " + element.nome + "</li>";
    });
    
    

    
});
