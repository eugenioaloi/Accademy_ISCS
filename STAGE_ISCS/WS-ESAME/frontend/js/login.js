const btnLogin = document.getElementById('btnLogin');

function checkCodCliente() {

    //leggo l'input
    let cod_cliente = document.getElementById("codCliente").value;

    //richiamo dal microservizio il cliente corrispondente
    let urlCliente = "http://localhost:8080/gestionevoli/cliente/"+cod_cliente;

    fetch(urlCliente)
        .then(response=>{//controllo il tipo di risposta dall'http
            if(response.status==200){
                response.json()
                .then(data=>{
                    //salvo l'utente loggato nella session storage
                    let utLoggato = JSON.stringify(data);
                    localStorage.setItem("data",utLoggato);
                    //mi sposta alla pagina con le funzionalità
                    window.location.replace("./index.html");
                })
            }else{
                alert("Utente " + cod_cliente + " attualmente non disponibile")
            }
        })
   
}

btnLogin.addEventListener('click', checkCodCliente);
