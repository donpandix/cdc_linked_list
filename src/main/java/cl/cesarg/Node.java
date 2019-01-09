package cl.cesarg;

/**
 * Objeto principal para el uso de lista enlazada
 */
public class Node {

    // Siguiente nodo
    public Node next = null;
    // Valor del nodo
    public int value;
    // Constructor
    public Node (int value) {
        this.value = value;
    }
    // Adiciona nodo al final de la lista
    public void addOnLast (int value) {
        Node ultimo = new Node(value);
        Node lista = this;
        while ( lista.next != null ) {
            lista = lista.next;
        }
        lista.next = ultimo;
    }

    // elimina un elemento del arreglo por su valor
    public Node deleteNode (int value) {
        // Puntero temporal al arreglo
        Node n = this;
        // En caso que el elemento a eliminar sea el primero
        if (n.value == value) return n.next;
        // Si el elemento a eliminar está en otro punto
        while (n.next != null) {
            if (n.next.value == value) {
                n.next = n.next.next;
                return this;
            }
            n = n.next;
        }

        return this;
    }




    // Lista los elementos del arreglo
    public void listado () {
        System.out.println("=== Elementos en Lista ===");
        Node lista = this;
        while ( lista != null ) {
            System.out.println( lista.value );
            lista = lista.next;
        }
    }

}
