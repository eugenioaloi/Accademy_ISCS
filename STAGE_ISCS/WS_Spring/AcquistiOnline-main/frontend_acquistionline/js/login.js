const btnArticoli = document.getElementById('btnArticoli');

function mostraTabellaArticoli(){
fetch('http://localhost:8080/acquistionline/magazzini')
.then(response => response.json())
.then(data => {
    let table = `
        <tr>
            <th>Nome articolo</th>
            <th>Descrizione</th>
            <th>Prezzo</th>
            
        </tr>
    `;

    for(let i = 0; i < data.length; i++) {

        table +=`
            <tr>
                <td>${data[i].nome_articolo}</td>
                <td>${data[i].descrizione}</td>
                <td>${data[i].prezzo_unitario}</td>
                
            </tr>
        `;
    }
    
    let tabella = document.getElementById('tableArticoli')
    tabella.classList.add('nascondi');
    tabella.innerHTML = table;
})
}

btnArticoli.addEventListener('click',mostraTabellaArticoli)


const btnLogin = document.getElementById('btnLogin');

function checkCodCliente() {

    const cod_cliente = document.getElementById('inputUserCode').value;
    let msg = '';
    console.log(cod_cliente);
    fetch('http://localhost:8080/acquistionline/clienti/' + cod_cliente)
    .then(response => response.json())
    .then(data => {
        
        msg += data.message;
        
        let utLoggato = JSON.stringify(data);
        
        localStorage.setItem("data",utLoggato);
        
        if(msg   != 'ok' ) {
            alert('Mi dispiace, utente non registrato!');
        } else {
            window.location.replace('./bookForm.html');
        }
    })
}

btnLogin.addEventListener('click', checkCodCliente);



