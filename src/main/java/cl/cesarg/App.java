package cl.cesarg;

/**
 * Pantalla principal para la ejecución de la implementación
 * de una lista enlazada, con el proposito de entender mejor
 * las diversas estructuras de datos y su correcto uso
 *
 * @autor   Cesar Gonzalez Molina     @donpandix
 * @version v.20190109
 */
public class App {

    /**
     * Ejecución de las instrucciones de prueba
     * @param args  por el momento no las usa
     */
    public static void main( String[] args ) {

        System.out.println("\nCrea una lista enlazada");

        int[] lista_valores = {1,2,3,4,5,6,7,8,9,90,100,30,22};
        Node lista = null;
        for (int n : lista_valores) {
            if (lista == null) {
                lista = new Node(n);
            } else {
                lista.addOnLast(n);
            }
        }
        lista.listado();

        System.out.println("\nElimina elementos {100, 1, 22, 5}");

        lista.deleteNode(100);
        lista.deleteNode(1);
        lista.deleteNode(22);
        lista.deleteNode(5);

        lista.listado();

    }
}
