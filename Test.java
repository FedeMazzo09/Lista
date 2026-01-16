public class Test {
    public static void main(String[] args) {

        // Creazione lista vuota
        Lista l = new Lista(0, null, null);

        // ACCODAMENTO
        l.accoda("A");
        l.accoda("B");
        l.accoda("C");
        l.accoda("B");
        l.accoda("D");

        System.out.println("Lista creata con accodamento");

        // LETTURA
        System.out.println("Lettura indice 0: " + l.lettura(0)); // A
        System.out.println("Lettura indice 2: " + l.lettura(2)); // C

        // RICERCA
        int pos = l.ricerca("B");
        System.out.println("Prima occorrenza di B alla posizione: " + pos);

        // INSERIMENTO
        l.inserimento("X", 2);
        System.out.println("Inserito X in posizione 2");

        // LETTURA dopo inserimento
        System.out.println("Lettura indice 2: " + l.lettura(2)); // X

        // VISITA (con cursore)
        l.cursor = l.head;
        System.out.println("Visita 1: " + l.visita()); // A
        System.out.println("Visita 2: " + l.visita()); // B
        System.out.println("Visita 3: " + l.visita()); // X

        // ELIMINAZIONE per indice
        l.eliminazione(1);
        System.out.println("Eliminato elemento in posizione 1");

        // LETTURA dopo eliminazione
        System.out.println("Lettura indice 1: " + l.lettura(1));

        // ELIMINAZIONE COMPLETA
        l.eliminazioneCompleta("B");
        System.out.println("Eliminate tutte le B");

        // STAMPA FINALE usando visita
        System.out.println("Lista finale:");
        l.cursor = l.head;
        String valore;
        while ((valore = l.visita()) != null) {
            System.out.println(valore);
        }
    }
}
