Le strutture di controllo sono blocchi del programma che possono cambiare il flusso delle istruzioni contenute nel codice sorgente.

Esistono tre tipi di strutture:

* Condizioni, utilizzate per scegliere tra due o più percorsi. (if/else/else if - operatore ternario - switch)
* Loops, usati per iterare tra multipli valori e oggetti e eseguire ripetutamente blocchi di codice. (for-while-do while)
* Diramazioni, usati per alterare il flusso nei loop. (break, continue)

CONDIZIONI

- If/else viene usato comunemente per scegliere quale strada prendere in base al risultato ottenuto. (ramo true o false)

if (count > 2) {
    System.out.println("Count is higher than 2");
} else {
    System.out.println("Count is lower or equal than 2");
}

Teoricamente si possono creare identazioni infinite di else/if però questa pratica rovina la leggibilità e non è consigliata.

- Operatore ternario

L'operatore ternario può essere utilizzato per accoriciare una condizione if/else. Il blocco di codice sopra può essere riscritto in questo modo:

Systen.out.println(count>2?"Count is higher than 2":"Count is lower or equal than 2")

L'operatore ternario non sempre è un buon sostituto dell' if/else

- Switch

Una buona pratica, in caso di scelte multiple, è quella di utilizzare lo switch. Tre o più else/if potrebbero essere complicati da leggere.

int count = 3;
switch (count) {
case 0:
    System.out.println("Count is equal to 0");
    break;
case 1:
    System.out.println("Count is equal to 1");
    break;
default:
    System.out.println("Count is either negative, or higher than 1");
    break;
}

LOOPS

I loop si usano per ripetere lo stesso blocco di codice per n volte in successione

for (int i = 1; i <= 50; i++) {
    methodToRepeat();
}

int whileCounter = 1;
while (whileCounter <= 50) {
    methodToRepeat();
    whileCounter++;
}

Al verificarsi di una determinata condizione il metodo si ripete fino all'esaurimento.

BREAK (interrompe l'esecuzione del ciclo)

Le istruzioni di break e continue vengono usate per uscire in maniera anticipata da un loop

List<String> names = getNameList();
String name = "John Doe";
int index = 0;
for ( ; index < names.size(); index++) {
    if (names[index].equals(name)) {
        break;
    }
}

Viene cercato il nome John Doe all'interno della lista di nomi e fermato il loop appena viene trovato. Un loop senza isturioni ulteriori, completa il suo giro fino all'esaurimento della condizione iniziale.

CONTINUE (permette di saltare il resto del loop in cui si trova l'istruzione)

List<String> names = getNameList();
String name = "John Doe";
String list = "";
for (int i = 0; i < names.size(); i++) { 
    if (names.get(i).equals(name)) {
        continue;
    }
    list += names.get(i);
}

Viene cercato il nome John Doe all'interno della lista di nomi. Il ciclo ad ogni giro appende ad una stringa con tutti i nomi, tranne nel caso di John Doe.








