public class Lista {
    public int size;
    public Nodo head;
    public Nodo cursor;
    
    public Lista(int size, Nodo head, Nodo cursor) {
        this.size = size;
        this.head = head;
        this.cursor = cursor;
    }

    public String visita() {
        if (cursor != null) {
            String val = cursor.value;
            cursor = cursor.next;
            return val;
        }
        return null;
    }


    public  void accoda(String value) {
        Nodo newNode = new Nodo(value, null);
        if (head == null) {
            head = newNode;
        } else {
            Nodo current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void eliminazione(int index) {
        if (head == null || index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            if (cursor == head) {
                cursor = head.next;
            }
            head = head.next;
        } else {
            Nodo current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            if (cursor == current.next) {
                cursor = current.next.next;
            }

            current.next = current.next.next;
        }
        size--;
        if (size == 0) {
            cursor = null;
        }
    }

    public String lettura(int index) {
        if (index < 0 || index >= size){
            return null;
        }

        Nodo current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int ricerca(String value) {
        Nodo current = head;
        int index = 0;

        while (current != null) {
            if (current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // non trovato
    }

    public void inserimento(String value, int index) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            head = new Nodo(value, head);
            size++;
            return;
        }

        Nodo current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = new Nodo(value, current.next);
        size++;
    }

    public void eliminazioneCompleta(String value) {
        while (head != null && head.value.equals(value)) {
            head = head.next;
            size--;
        }

        Nodo current = head;
        while (current != null && current.next != null) {
            if (current.next.value.equals(value)) {
                if (cursor == current.next) {
                    cursor = current.next.next;
                }
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }

        if (size == 0) cursor = null;
    }

}
