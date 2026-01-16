public class Test {
    public static void main(String[] args) {
        Lista l = new Lista(0, null, null);

        l.accoda("A");
        l.accoda("B");
        l.accoda("C");
        l.accoda("B");
        l.accoda("D");

        System.out.println("Lista creata con accodamento");

        System.out.println("Lettura indice 0: " + l.lettura(0));
        System.out.println("Lettura indice 2: " + l.lettura(2));

        int pos = l.ricerca("B");
        System.out.println("Prima occorrenza di B alla posizione: " + pos);

        l.inserimento("X", 2);
        System.out.println("Inserito X in posizione 2");

        System.out.println("Lettura indice 2: " + l.lettura(2));

        l.cursor = l.head;
        System.out.println("Visita 1: " + l.visita());
        System.out.println("Visita 2: " + l.visita());
        System.out.println("Visita 3: " + l.visita());

        l.eliminazione(1);
        System.out.println("Eliminato elemento in posizione 1");

        System.out.println("Lettura indice 1: " + l.lettura(1));

        l.eliminazioneCompleta("B");
        System.out.println("Eliminate tutte le B");

        System.out.println("Lista finale:");
        l.cursor = l.head;
        String valore;
        while ((valore = l.visita()) != null) {
            System.out.println(valore);
        }
    }
}
