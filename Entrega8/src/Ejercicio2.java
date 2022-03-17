import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 extends Gestor {

    public static void Lanzar(Scanner teclado) {
        Gestor gc = new Gestor();
        Scanner teclado2 = new Scanner(System.in);
        int opcion = 0;
        while (true) {

            System.out.println("\n-- Menú --\n");
            menu();
            try {
                opcion = teclado2.nextInt();

            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (opcion) {
                case 1:
                    gc.mostrarClientes();
                    break;
                case 2:
                    gc.crearCliente(teclado2);
                    break;
                case 3:
                    gc.crearObra(teclado);

                    break;
                case 4:
                    gc.crearPedido(teclado);
                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("La opción elegida no existe.");
            }
        }
    }

    private static void menu() {
        System.out.println("1 - Mostrar Clientes");
        System.out.println("2 - Crear un cliente");
        System.out.println("3 - Crear una obra");
        System.out.println("4 - Crear un pedido");
        System.out.println("5 - Mostrar pedidos");
        System.out.println("6 - Salir");
    }

}
