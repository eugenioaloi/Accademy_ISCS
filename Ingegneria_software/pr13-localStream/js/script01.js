var nomeUt = "Eugenio";

var utente = {
    nome: "pippo",
    cognome: "papero",
    eta: 30,
};

var btn = document.querySelector("#btn");

function login(){
    localStorage.setItem("nomeUtente", nomeUt);
    
    //per poter salvare un ogg devo trasformarlo in JSON
    let utJSON = JSON.stringify(utente);
    localStorage.setItem("utente", utJSON);

    location.reload();

}

btn.addEventListener("click", login);

var feed = document.querySelector("#feed");

function recuperaUtenza(){
    //recuperare ciò che è salvato nella local storage
    let utConnessoJSON = localStorage.getItem("utente")

    console.log(utConnessoJSON);

    let utConnesso = JSON.parse(utConnessoJSON)
    console.log(utConnesso);

    if(utConnesso==null){
        feed.innerHTML = "Nessun utente connesso";
    }else{
        feed.innerHTML = "ciao" + utConnesso.nome + ", benvenuto!";
    }
}

recuperaUtenza();

var btnOut = document.querySelector("#btnOut")

function logout(){
    // localStorage.clear();
    localStorage.removeItem("utente");    
    location.reload();
}

btnOut.addEventListener("click", logout);