let btnIndex = document.getElementById("btnIndex");

function goToHome(){
    window.location.replace("./index.html")
};

btnIndex.addEventListener("click",goToHome);

let btnLogin = document.getElementById("btnLogin");

function goToLogin(){
    window.location.replace("./login.html")
};

btnLogin.addEventListener("click",goToLogin);
