import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Obras.*;

public class Gestor {

    ArrayList<Cliente> listaClientes;
    ArrayList<Obra> listaObras;

    public Gestor() {
        listaClientes = new ArrayList<Cliente>();
        listaObras = new ArrayList<Obra>();
    }

    public void crearCliente(Scanner teclado) {
        System.out.println("¿Nombre?");
        String nombre = teclado.next();
        Cliente c = new Cliente(nombre);
        listaClientes.add(c);

        System.out.println("Cliente n.º" + c.id + " [" + c.getNombre() + "] añadido");
    }

    public void mostrarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes");
        } else {
            System.out.println("-- Clientes --\n");
        }
        for (Cliente c : listaClientes) {
            System.out.println(c.toString());
        }
    }

    public void mostrarObras() {
        if (listaObras.isEmpty()) {
            System.out.println("No hay obras");
        } else {

        }
        for (Cliente c : listaClientes) {
            System.out.println(c.toString());
        }
    }

    public void crearObra(Scanner teclado) {

        int eleccion = 0;
        do {
            System.out.println("Entrada al bucle");
            System.out.println("¿Tipo?");
            System.out.println("1: Libro");
            System.out.println("2: Video");
            try {
                eleccion = teclado.nextInt();

            } catch (InputMismatchException e) {
                teclado.next();
            }
        } while (eleccion != 1 && eleccion != 2);
        System.out.println("Salida del bucle");
        System.out.println("¿Nombre de la obra?");
        String nombre = teclado.next();
        System.out.println("¿Nombre del autor?");
        String autor = teclado.next();
        if (eleccion == 1) {
            int paginas = 0;
            System.out.println("¿Cuántas páginas tiene?");
            while (true) {
                try {
                    paginas = teclado.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    teclado.next();
                }
            }
            Obra o = new Libro(autor, nombre, paginas);
            listaObras.add(o);
        } else if (eleccion == 2) {
            int duracion = 0;
            System.out.println("¿Duración (minutos)?");
            while (true) {
                try {
                    duracion = teclado.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    teclado.next();
                }
                Obra o = new Video(autor, nombre, duracion);
                listaObras.add(o);
            }
        }
    }

    public void crearPedido(Scanner teclado) {
        System.out.println("Cantidad: " + listaObras.size());
        if (!listaClientes.isEmpty()) {

            int eleccion = 0;
            Pedido p;
            while (true) {
                System.out.println("¿Para qué cliente?");
                mostrarClientes();
                try {
                    eleccion = teclado.nextInt();
                    eleccion--;
                    p = new Pedido(listaClientes.get(eleccion));
                    break;

                } catch (InputMismatchException e) {
                    teclado.next();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No válido");
                }
            }
            int salir=listaObras.size();
            eleccion=salir++;
            while (eleccion !=salir+1) {
                System.out.println("¿Qué obra agregar al pedido?");
                for (Obra o : listaObras) {
                    System.out.println(o.toString());
                }
                System.out.println(salir + "Finalizar");
                try {
                    eleccion = teclado.nextInt();
                    eleccion--;
                    p.setObras(listaObras.get(eleccion));
                } catch (InputMismatchException e) {
                    teclado.next();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No válido");
                }
            }
        }
    }

}
