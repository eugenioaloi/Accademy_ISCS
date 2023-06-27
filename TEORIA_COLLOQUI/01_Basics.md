*************************** INDIPENDENZA DALLA PIATTAFORMA E JVM ***************************

Java è un programma orientato agli oggetti. Può essere scritto su di una macchina (es Windows) per poi essere eseguito su di un'altra macchina di tipo diverso (es Macos), senza modiifcare il sorgente.
Java è scritto con un linguaggio umano non comprensibile dalla macchina. Il compilatore ha il compito di trasformare il sorgente in un formato comprensibile dalla macchina. (JAVA Byte Code).

- Ogni volta che un programma è scritto in Java, il javac lo compila.
- Il risultato del compliatore Java è .class, ovvero il bytecode.
- Il bytecode generato non è eseguibile ed ha bisogno di un interprete per essere lanciato. Questo compito viene smazzato dalla JVM.

Java è indipendente dalla piattaforma, mentre la JVM è dipendente dal SO. Ogni sistema è in grado di installare la sua JVM automaticamente quando la JDK è istallata.

*************************** TIPI DI DATO ***************************

Ci sono due tipi di dato in Java, dati primitivi è reference.

- Primitivi, per dati interi (int,short, byte, long) a virgola mobile (double,float) carattere (char) logici (boolean)
- Reference, oggetti che contengono riferimenti a valori, ad altri oggetti o a valori speciali come null che denotano l'assenza di valore

Per dichiarare una variabile si deve specificare il tipo e il nome (chiamato identificatore):

int a; double d; char c;

Un identificatore è un nome di qualsiasi lunghezza, composto da lettere, numeri, underscore e $.

Se una variabile non viene inizializzata riceve il suo valore di default in base al tipo di dato fornito. int 0, double 0.0, char ''.
Per inizializzare una variabile si usa l'operatore di assegnazione (=) -> int a = 10; double d = 25.6; char c = 'f';

La differenza nella rappresentazione di una lettera char o String è la differenza di virgolette usate nella sua inizializzazione. 
'a' è un char, "a" è una String

AUTOBOXING -> Tutti i tipi di dato primitivi hanno una classe in grado di implementare il loro contenuto. Alcune volte c'è la necessità di convertire il dato primitivo al suo riferimento d'istanza wrapper. Java è in grado di farlo tramite il processo di autoboxing.

Integer -> int
Double -> double
Boolean -> boolean
Character -> char

*************************** ARRAYS ***************************

Gli arrays sono tipi reference in grado di imagazzinare valori di un specifico tipo. La sintassi per dichiarare un array è la seguente:

tipo[] identificatore = new tipo [lunghezza array]

int [] numArray = new int [10];

Per accedere ad un elemenento specifico. o assegnare un valore ad un elemento specifico, si usa il nome della variabile e il suo indice

numArray[0] = 25
numArray[1] = 15
numArray[2] = 20

In Java il primo indice di qualsiasi arry inizia da zero.

*************************** OPERATORI ARITMETICI ***************************

Java supporta questi operatori aritmetici che possono essere usati per scrivere logica matematica o computazionale:

* (+) usato per somma e concatenzione di Stringhe
* (-) sottrazione
* (*) moltiplicazione
* (/) divisione
* (%) modulo

*************************** OPERATORI LOGICI *************************** 

Java supporta questi operatori logici per valutare espressioni booleane:

* (&&) AND -> se tutte le espressioni sono vere
int number = 6;
        
if (number % 2 == 0 && number % 3 == 0) {
    System.out.println(number + " is divisible by 2 AND 3");
}

Se number è divisibile con resto 0 per 2 (E) per 3 allora l'espressione è vera. && identifica il verificarsi di 2 o più casi

* (||) OR
int number = 8;
        
if (number % 2 == 0 || number % 3 == 0) {
    System.out.println(number + " is divisible by 2 OR 3");
}

Se number è divisibile con resto 0 per 2 (OPPURE) per 3 allora l'espressione è vera. || identifica il verificarsi di almeno una condizione

* (!) NOT

int number = 5;
        
if (number != 4) {
    System.out.println(number + " is not 4");
}

Se number non equivale all'uguaglianza richiesta (IS NOT) allora l'uguaglianza risulta essere vera.

*************************** OPERATORI DI CONFRONTO ***************************

Gli operatori di confronto permettono di comparare il valore di una variabile con un'altra.

* (<) minore di; int n=3;  n<5;
* (<=) minore uguale di; int n=4;  n<=4;
* (>) maggiore; int x=5;  x>3;
* (>=) minore uguale di; int x=4;  x>=4;
* (==) uguale; int a = 7; a==7;
* (!=) diverso da; int b = 3; b!=9

Si può usare l'operatore di confronto per determinare se una persona può votare o meno

public boolean puoVotare(int eta) {
    if(eta < 18) {
        return false;
    }
    return true;
}

*************************** STRUTTURA DEL PROGRAMMA JAVA E METODO MAIN *************************** 

L'unità base di un programma Java è una classe, ovvero l'astrazione di un concetto della vita, con caratteristiche (attributi) e metodi (funzionalità). Una classe oltre a caratteristiche e metodi propri può avere al suo interno altre classi (inner class).
Una classe per essere eseguita deve avere un metodo main, ovvero l'entry point di qualsiasi programma.

Il metodo main viene solitamente scritto in questo modo:

public static void main(String [] args){};

Dal rilascio di Java 21 (settembre 23') Java sarà in grado di lanciare il metodo main solo dichiarando il tipo di ritorno del metodo, l'identificatore e senza utilizzare parametri in entrata. (https://www.youtube.com/watch?v=ZibsO2doQjU&t=531s&ab_channel=CodingwithJohn)

void main(){};

In ogni caso il metodo main, è composto di queste parti:

* public, ovvero l'identificatore di accesso, comune a tutte le classi e package.
* static, a livello di metodo significa che per accedere a questa funzionalità della classe non serve istanziare un nuovo oggetto. Infatti tutti i metodi static appartengono direttamente alla classe.
* void, è il tipo di ritorno del metodo.
* main, è l'identificatore che la JVM cerca quando esegue un programma.
* String[] args, rappresenta i valori ricevuti dal metodo. In questo modo gli argomenti sono passati al metodo quando il programma viene chiamato.

Il metodo main può essere anche scritto come segue:

- public static void main(String ... args) -> utilizzando i varargs
- public static void main(final String [] args) -> dichiarando final l'array dei parametri non può essere modificato

Si possono avere più main method nello stesso progetto, l'importante è dichiarare alla JVM quale metodo main è l'entry point dell'applicazione tramite il META-INF/MANIFEST.MF file. Si può indicare in questo modo:

* Main-Class: mypackage.ClassWithMainMethod (dichiarazione entry point)

*************************** PACKAGE *************************** 
































