1- SPIEGARE BREVEMENTE I CONCETTI CHIAVE DEL PARADIGMA AD OGGETTI, CLASSE, ISTANZE E INCAPSULAMENTO

Il paradigma ad oggetti si prefigge l'obiettivo di manipolare i dati attraverso la rappresentazione di oggetti, rappresentati con le loro proprietà(attributi) e comportamenti (metodi) identificate nella classe instanziatrice. Grazie alla programmazione ad oggetti si è in grado di scrivere un codice modulare, riusabile e facile da mantenere.

I concetti fonadamentali della programmazione ad oggetti:

- Incapsulamento: proteggere i campi delle classi da accessi esterni, assegnandoli privati e rimandano il loro accesso con metodi publici. getters and setters

- Polimorfismo: L'abilità di una classe di fornire differenti implementazioni di un metodo, in base all'oggetto passato. La JVM (Java Virtual Machine) è in grado di capire quale metodo applicare grazie alla reflection

- Ereditarietà: la capacità di eriditare da parte delle classi figlie metodi e variabili della classe padre

2- SPIEGARE LA VISIBILITA' DEI MODIFICATORI PRIVATE, PUBLIC, PROTECTED E DEFAULT A LIVELLO DI PROGRAMMA

Private (visibilità a livello di classe), 
public (visibilità ovunque), 
protected (visibile solo da classi nello stesso package o sottoclassi)
default (visibile solo da classi o sottoclassi nello stesso package)

3- SPIEGARE IL CONCETTO DI EREDITARIETA'
la capacità di eriditare da parte delle classi figlie metodi e variabili della classe padre

4- SPIEGARE IL SIGNIFICATO DI INTERFACCE, IL SUO UTILIZZO E I SUOI VANTAGGI
Le interfaccie sono utilizzate per spostare la logica dal livello d'implementazione ad un livello più alto di astrazione, dichiarativo.
Programmazione per contratto -> il programmatore che prevede di utilizzare un'interfaccia DEVE IMPLEMENTARE TUTTI i metodi prescritti nell'interfaccia o utilizzare una classe che implementa già i metodi.

5- SPIEGARE IL CONCETTO DI POLIMORFISMO IN RELAZIONE AL DINAMIC BYNDING

-Dinamic bynding: il collegamento dinamico è la capacità a runtime della Jvm di agganciare dinamicamente l'oggetto effettivamente in esecuzione a runtime. Questa pratica viene eseguita tramite il processo della reflection.

6- IN UNA CLASSE DERIVATA CHE OVERRIDA DEI METODI CON QUALE CRITERIO LA JVM ESEGUE IL METODO APPROPRIATO? 

Grazie alla reflection, pratica eseguita a runtime dalla JVM

7- SPIEGARE L'UTILIZZO DEL MODIFICATORE FINAL NEI VARI LIVELLI DI UN PROGRAMMA

- Una variabile dichiarata final non può essere modificata e deve essere inizializzata per fissare il valore da attribuire
- Un metodo non può essere ovverridato
- Una classe non può essere estesa da una sottoclasse 

Si utilizza il modificatore final per ottimizzare le performance e la sicurezza. Il compilatore è in grado di otimizzare il codice in maniera più efficente quando sa che qualcosa non può essere cambiato e si previene un comportamento malevolo di accesso ai dati.

8- SPIEGARE L'OVERRIDING E L'OVERLOADING
- overriding: avviene quando una sottoclasse ha gli stessi metodi di una classe genitore. Di consueto si utilizza l'override sull'implementazione di metodi di un'interfaccia o quando si vuole una diversa implementazione di un metodo in una sottoclasse

-overloading: utilizzare uno stesso metodo che però accetta un numero diverso di parametri in input

9- COSA RAPRESSENTA LA PAROLA CHIAVE THIS?
fa riferimento al valore presente in quel momento. Es il riferimento ad un attributo di classe al livello della stessa classe.

10- COME E PERCHE' SI UTILIZZ IL THIS(...) E IL SUPER(...) IN UN COSTRUTTORE

- Il this si utilizza per fare riferimento all'attributo definito a livello di classe e si usa nel costruttore per assegnare il parametro che viene passato.

public class JavaTeoria{
    private String teoria;

    public constructor(String teoria){
        super();
        this.teoria = teoria;
    }
}

- super fa riferimento al costruttore della classe padre. In caso di sottoclassi il riferimento a super prevedede anche il costruttore della classe genitore

11- E' POSSIBILE ESEGUIRE IL METODO DELLA SUPERCLASSE NEL METODO OVERRIDATO DA UNA CLASSE DERIVATA? Sì

12- SPIEGARE BREVEMENTE IL CONCETTO DI EXCEPTION THROWS E THROW

In java esistono due tipi di exception le checked e le uncecked.

Le checked sono quelle eccezioni che devono essere trattate a livello di compilazione e che è Java stesso a prevederle con l'utilizzo dell'identificatore throws. Il metodo che throws un'eccezione deve essere per forza trattate a livello compilativo con try e catch. 
Checked -> es. FileNotFoundException

Le unchecked invece sono eccezioni non previste che potrebbero comportare degli errori in fase di runtime, e solitamente sono gestite con l'identificatore throw. Si dichiara al compilatore, qualora la incontrasse, di lanciare quel tipo di eccezione.
Unchecked -> es. NullPointerException o Exception custom

13- QUAL E' LA GERARCHIA DELLE EXCEPTION?
Throwable è il cappello sotto il quale ci sono gli Error e le Exception. Gli error sono i problemi irrecuperabili, mentre le exception possono essere checked o unchecked

14- E' POSSIBILE DEFINIRE LE PROPRIE EXCEPTION? Sì

15- COSA E' UN OGGETTO ENUM? 
Un elenco di attributi che prevede dei valori e dove ogni attributo è un oggetto 

16- COSA SIGNIFICA CHE UN OGGETTO E' IMMUTABILE? 
Un oggetto è immutabile quando non puo essere più modificato o non si riesce a fare l'accesso. Solitamente un oggetto immutabile viene dichiarato e valorizzato per un compito specifico.

es si instanzia un oggetto di una classe per passarlo direttamente ad un metodo che lo richiede come parametro

17- IN QUALE CASO VIENE ESEGUITA LA CLAUSOLA FINALLY IN CASO DI TRY/CATCH? 
La clausola finally viene eseguita in qualunque caso, sia nel caso di successo del try o catch dell'exc

18- COSA E' LA SERIALIZZAZIONE IN JAVA

19- COSA SONO LE COLLECTION FRAMEWORK?

20- ELENCARE LE INTERFACCE DI COLLECTION

21- ELENCARE LE CLASSI CONCRETE CHE IMPLEMENTANO LE INTERFACCE DI COLLECTION

22- SPIEGARE IL SIGNIFICATO DEL MODIFICATORE STATIC A LIVELLO DI METODO

23- QUAL E' L'EFFETTO DEL MODIFICATORE FINAL DI UNA CLASSE?

24- SI PUO' ISTANZIARE UN'INTERFACCIA?

25- COME SI DEFINISCE UNA CLASSE ASTRATTA? 
Si dichiare la classe astratta e si DEVE dichiare almeno un metodo astratto. Si possono dichiare ed implementare anche metodi concretti. Le classi concrete che extends le classi astratte ereditano i metodi concreti e DEVONO implementare i metodi astratti

26- COSA E' UN THREAD?

27- COSA SIGNIFICA METODO/BLOCCO THREAD SAFE?

28- COME SI DEFINISCE UN THREAD?

29- ELENCARE I PRINCIPALI METODI DI THREAD

30- COME SI PUO' EFFETTUARE IL REVERSE DI UNA STRINGA? 
Attraverso un loop che parte dall'ultima occorenza si crea una nuova stringa con il carattere trovato in quell'occorenza fino allo scadere della stringa

31- A COSA SERVONO LE CLASSI STRINGBUILDER E STRINGBUFFER E LA LORO DIFFERENZA

32- QUAL E' LO SCOPO DEL FRAMEWORK MAVEN E COM'E' ORGANIZZATO?

33- IN QUALE FOLDER SI TROVA IL REPOSITORY LOCALE DI MAVEN?

34- QUALI ALTRI FRAMEWORK EFFETTUANO OPERAZIONI SIMILI A MAVEN?

35- COSA E' UN WEB SERVER?

36- COSA E' UN APPLICATION SERVER?

37- COSA E' UNA SERVLET NEL MONDO J2EE?

38- COME SI DEFINISCE UNA SERVLET?

39- COSA SIGNIFICA CHE UNA SERVLET E' MULTITHREAD?

40- SPIEGARE BREVEMENTE IL CICLO DI VITA DI UNA SERVLET
