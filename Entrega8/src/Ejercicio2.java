import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 extends Gestor {

    public static void Lanzar(Scanner teclado) {
        Gestor gc = new Gestor();
        Scanner teclado2 = new Scanner(System.in);
        int opcion = 0;
        while (opcion!=7) {

            System.out.println("\n-- Menu --\n");
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
                    gc.mostrarPedido();
                    break;
                case 6:
                    gc.mostrarObras();
                    break;
                case 7:
                    System.out.println("Volviendo al menu");
                    System.out.println("Datos del ejercicio 2 reiniciados");
                    break;
                default:
                    System.out.println("La opcion elegida no existe.");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("1 - Mostrar Clientes");
        System.out.println("2 - Crear un cliente");
        System.out.println("3 - Crear una obra");
        System.out.println("4 - Crear un pedido");
        System.out.println("5 - Mostrar pedidos");
        System.out.println("6 - Mostrar obras");
        System.out.println("7 - Salir");
    }

}
