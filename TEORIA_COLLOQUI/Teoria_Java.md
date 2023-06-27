Saper programmare significa:

- codificare a livelli omogenei
- scrivere codice chiaro, leggibile e identato
- scrivere codice robusto (secure by design), disaccopiato (ogni blocco compie una singola funzione)
- essere in grado di avere creatività, capacità di analizzare problemi complessi e analizzarli
- creare una famiglia di modelli in grado di risolvere gli scopi del programma, semplificare la complessità

Dapprima occorre capire COSA viene chiesto di fare (analisi dei requisiti e specifica), poi COME farlo (archittetura e realizzazione delle strutture)

**********************************************************************

Storia di Java:

Nasce nel 1995 da Sun Microsystem e Netscape che introducono per la prima volta questa linguaggio e lo integrano nel web.
E' passato sul paradigma ad oggetti ed è indipendente dalla piattaforma in cui si trova, infatti grazie alla JVM (Java Virtual Machine) può essere ospitato su qualsiasi dispositivo sulla quale è installato.

La prima grande rivoluzione in Java avviene grazie alla versione 8 nel 2014, che introduce le Lambda e gli Stream. Dal 2018, grazie alla versione 10, è possibile dichiare le variabili con Var, allo stesso modo di JavaScript. Java è in grado di capire il tipo di dato in base al contesto che circonda la variabile.

Le caratteristiche di Java:

-1 orientato agli oggetti
-2 semplice
-3 sicuro
-4 indipendente dalla piattaforma
-5 robusto
-6 dinamico
-7 interpretato
-8 multithread
-9 distribuito

JDK E JVM

- Javac, è il compilatore della JVM incaricato di trasformare il codice sorgente di Java nel bytecode che sarà poi eseguito nella macchina virtuale.
- JRE (Java Runtime Enviroment), è l'ambiente nel quale avvine il run del codice

Il codice di Java viene scritto dal programmatore e salvato in un file .java (chiamato codice sorgente), conpilato e trasformato in bytecode. Compito della JVM è interpretare i bytecode, presenti sul file .class e restituire l'input sulla macchina in cui si trova.

************************************************************************

IL PARADIGMA AD OGGETTI

Intorno a noi c'è molta complessita. Ognuno di noi ha sviluppato un concetto di ciò che lo circonda, fatto di comportamenti attesi e relazioni (concettuali con altri oggetti).

- Una CLASSE è il modello su cui si basa l'astrazione di questi concetti
- La crezione di un'istanza a partire da questo modello si chiama OGGETTO. Un oggetto può essere anche definito un mattone su cui si basa il concetto astratto nella classe

Il compito del software è modellare porzioni di questa realtà alllo scopo di realizzare sistema informativi, in grado di raccogliere, elaborare e offire servizi semplici ai loro utilizzatori. Creare un oggetto, in grado di svolgere questo compito, vuol dire allocare un pezzo di memoria in grado di ospitare il suo stato, grazie all'operatore new.

La realtà è composta da oggetti che interagiscono tra di loro. Ciascuno di essi è dotato:

- di una propria identità (riconoscibile. Attributi e funzionalità associate)
- uno stato (caratteristiche che contraddistinguono un dato oggetto in quel momento)
- comportamento (reazione agli stimoli esterni)

Tutto ciò che può essere "manipolato" è un oggetto, e viceversa.

Gli attributi sono le caratteristiche di quell'oggetto e possono essere:

- locali, condivise con quel pezzo di codice
- istanza, condivisibile con tuti gli oggetti di quella classe. ogni oggetto avrà un suo valore per quell'attributo
- static, comune con tutte le istanze di quella classe

Gli attributi possono essere identificati anche dal nome di variabili. Java essendo un linguaggio tipizzato obbliga il programmatore a dichiarare il tipo di dato che risiederà al suo interno e attende di essere chiamata in uno spazio di memoria detto STACK.

I metodi sono le funzionalità di quell'oggetto, cioè come reagisce ad una data richiesta

- I metodi sono delegati, cioè chi li chiama non serve sapere come sono composti
- istanza, condivisibili con tutti gli oggetti di quella classe.
- static, cioè propri della classe. Si possono invocare senza creare un'istanza di quella classe

Un metodo è composto da un nome + parametri in input (firma), un valore di ritorno, un insieme di istruziono ed agisce sull'oggetto specifico che lo richiama (il destinatario del metodo). Gli oggetti sono allocati nell'HEAP

STACK-> spazio di memoria allocato per le variabili
HEAP -> spazio di memoria allocato per il parcheggio dei metodi in attesa di essere chiamati
