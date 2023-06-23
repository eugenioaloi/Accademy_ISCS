// vai alla pagina prenotazioni
let btnPrenotaSpettacolo = document.getElementById('btnPrenotaSpettacolo');



function goToPaginaPrenotazione(){
  window.location.replace('./bookForm.html');
}

btnPrenotaSpettacolo.addEventListener('click',goToPaginaPrenotazione)

//mostra elenco concerti


function mostraTabellaSpettacoli(){
  fetch('http://localhost:8080/biglietteriaspettacoli/spettacoli')
  .then(response => response.json())
  .then(data => { 
      let table = `
          <tr>
              <th>Codice spettacolo</th>
              <th>Artista</th>
              <th>Data</th>
              <th>Orario</th>
              <th>Città</th>
              <th>Luogo</th>
              <th>Prezzo</th>
             
          </tr>
      `;
  
      for(let i = 0; i < data.length; i++) {
  
          table +=`
              <tr>
                  <td>${data[i].idSpettacolo}</td>
                  <td>${data[i].artista}</td>
                  <td>${data[i].dataSpettacolo}</td>
                  <td>ore 20.00</td>
                  <td>${data[i].citta}</td>
                  <td>${data[i].luogo}</td>
                  <td>${data[i].prezzo}</td>




                 
              </tr>
          `;
      }
      
      let tabella = document.getElementById('tableSpettacoli')
      
      let concertiTitle = document.getElementById("concertiTitle")
      concertiTitle.style.display = "block";
      tabella.innerHTML = table;
      
  })
}
  
window.addEventListener('load', mostraTabellaSpettacoli)


let btnLogin = document.getElementById('btnLogin');

function goToLogin(){
  window.location.replace('./login.html');
}

btnLogin.addEventListener('click',goToLogin)





