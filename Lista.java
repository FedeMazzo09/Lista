public class Lista {
    public Nodo head;
    public Nodo cursor;
    
    public Lista() {
        this.head = null;
        this.cursor = null;
    }

    public String visita() {
        if (cursor == null)
            cursor = head;

        if (cursor == null)
            return null;

        String valore = cursor.value;
        cursor = cursor.next;
        return valore;
    }

    public String lettura(int indice) {
        Nodo temp = head;
        int i = 0;

        while (temp != null && i < indice) {
            temp = temp.next;
            i++;
        }

        if (temp == null)
            return null;

        return temp.value;
    }

    public int ricerca(String valore) {
        Nodo temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.value.equals(valore))
                return i;
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public void inserimento(String valore, int indice) {
        Nodo nuovo = new Nodo(valore, null);

        if (indice == 0) {
            nuovo.next = head;
            head = nuovo;
            return;
        }

        Nodo temp = head;
        int i = 0;

        while (temp != null && i < indice - 1) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            nuovo.next = temp.next;
            temp.next = nuovo;
        }
    }

    public void accodamento(String valore) {
        Nodo nuovo = new Nodo(valore, null);

        if (head == null) {
            head = nuovo;
            return;
        }

        Nodo temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = nuovo;
    }

    public void eliminazione(int indice) {
        if (head == null)
            return;

        if (indice == 0) {
            head = head.next;
            return;
        }

        Nodo temp = head;
        int i = 0;

        while (temp.next != null && i < indice - 1) {
            temp = temp.next;
            i++;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void eliminazioneCompleta(String valore) {
        while (head != null && head.value.equals(valore))
            head = head.next;

        Nodo temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.value.equals(valore))
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
    }

    public void stampa() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
