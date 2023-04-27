- CLASSE: L'asstrazione delle caratteristiche di un concetto
- OGGETTO: L'istanza di una classe, ovvero la creazione concreta della classe.
Es. La classe è lo stampino per i biscotti, il singolo biscotto è l'oggetto

- INCAPSULAMENTO: Creare attributi di una classe e settarli private per evitare il facile accesso da parte di altre classi
- POLIMORFISMO: Significa molte forme. Si parla di polimorfismo in Java quando partendo da un interfaccia si ottengono dei metodi
che si possono declinare ai diversi usi dell'istanza che gli implementa

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

- EREDITARIETA':

- INTERFACCIA:
- CLASSI ASTRATTE: