public class Test {
    public static void main(String[] args) {

        Lista l = new Lista();

        System.out.println("Accodamento:");
        l.accodamento("A");
        l.accodamento("B");
        l.accodamento("C");
        l.stampa();

        System.out.println("Inserimento in posizione 1:");
        l.inserimento("X", 1);
        l.stampa();

        System.out.println("Lettura indice 2:");
        System.out.println(l.lettura(2));

        System.out.println("Ricerca di B:");
        System.out.println(l.ricerca("B"));

        System.out.println("Visita:");
        System.out.println(l.visita());
        System.out.println(l.visita());
        System.out.println(l.visita());

        System.out.println("Eliminazione indice 1:");
        l.eliminazione(1);
        l.stampa();

        System.out.println("Eliminazione completa di A:");
        l.eliminazioneCompleta("A");
        l.stampa();
    }
}
