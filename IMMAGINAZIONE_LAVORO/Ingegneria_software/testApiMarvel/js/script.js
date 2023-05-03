var listaPersonaggi = document.getElementById("listaPersonaggi");


const url = "https://gateway.marvel.com/v1/public/characters?ts=1&apikey=?";

fetch(url)
.then(data => {return data.json()})
.then(response => {

    console.log(response.data);
        
    let arrMarvel = response.data.results;
     
    arrMarvel.forEach(element => {
        listaPersonaggi.innerHTML += "<li> " + element.name + "</li>";
    });
    
    

    
});
