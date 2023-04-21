var img = [
    "https://www.cinefacts.it/foto/h!edward_norton_autodistruttivo_cinefacts_Cover.jpg",
    "https://static.sky.it/editorialimages/7cb10fadd31d37e6a65146d24e888fa9ca831d2b/skytg24/it/spettacolo/approfondimenti/freddie-mercury/freddie-mercury-getty.jpg",
    "https://www.sololibri.net/IMG/arton149051.png",
    "https://cdn.studenti.stbm.it/images/2022/01/20/andrea-camilleri-orig.jpeg"
];

var nomi = ["Edward Norton", "Freddie Mercury", "Eugenio Montale", "Andrea Camilleri"];

var wiki = ["https://it.wikipedia.org/wiki/Edward_Norton","https://it.wikipedia.org/wiki/Freddie_Mercury",
"https://it.wikipedia.org/wiki/Eugenio_Montale", "https://it.wikipedia.org/wiki/Andrea_Camilleri"];


for(let i=0;i<img.length;i++){
    //prendo i tag html di riferimento
    var immagini = document.querySelector("#img"+i);

    //assegno il link al tag preso
    immagini.setAttribute("src",img[i]);

    //css per le img
    immagini.classList.add("imgDim");

    //creo un nuovo elemento <a> per visualizzare le pag wikipedia
    var wikipedia = document.createElement("a");

    //aggiungo il link all'elemento creato preso dall'array di nomi
    wikipedia.textContent=nomi[i];

    //setto l'attributo href al tag <a>
    wikipedia.setAttribute("href",wiki[i]);

    //Aggiungo al padre il figlio wikipedia -> anchor e link a wikipedia
    immagini.parentNode.appendChild(wikipedia);

}


