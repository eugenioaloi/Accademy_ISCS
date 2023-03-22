//varie tipologie di operatori di confronto
// == è uguale ad un altra cosa
// === è STRETTAMENTE uguale a qualcosa, controlla anche il tipo
// != è diverso
// !== è STRETTAMENTE diverso, controlla anche il tipo
// >,<,>=,<=

//tutti gli operatori di confronto restituiscono un booleano TRUE o FALSE

var num1 =3;
var num2 =4

console.log(num1==num2);//false
console.log(num1===num2);//false

var num3 =5;
var num4 =5

console.log(num3==num4);//true
console.log(num3===num4);//true

var num5 =8;
var num6 ="8"

console.log(num5==num6);//true
console.log(num5===num6);//false

var parola1 = "ciao";
var parola2 = "Ciao";

console.log(parola1==parola2);//false
console.log(parola1===parola2);//false


//confronto tra 2 numeri
var primoNumero =10;
var secondoNumero =22;

if(primoNumero>secondoNumero){
    console.log(primoNumero + " è il più grande")
}else if(primoNumero<secondoNumero){
    console.log(secondoNumero + " è il più grande")
}else{
    console.log("I due numeri sono uguali")
}