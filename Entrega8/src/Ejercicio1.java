import java.util.Scanner;

public class Ejercicio1 extends Dado {

    public static void Lanzar(Scanner teclado) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        JugadorGuerra j1 = new JugadorGuerra(d1);
        JugadorGuerra j2 = new JugadorGuerra(d2);
        System.out.println("¿Nombre del jugador?");
        String nombre1 = teclado.next();
        j1.setNombre(nombre1);
        System.out.println("¿Nombre del jugador?");
        String nombre2 = teclado.next();
        j2.setNombre(nombre2);

        do {
            d1.lanzarDado();
            d2.lanzarDado();
            System.out.println(j1.getNombre() + " ha sacado " + d1.getUltima());
            System.out.println(j2.getNombre() + " ha sacado " + d2.getUltima());
            if (d1.ultimaCara > d2.ultimaCara) {
                j1.Victoria();
                j2.Derrota();

                System.out.println(j1.getNombre() + " gana");
            } else if (d2.ultimaCara > d1.ultimaCara) {
                j2.Victoria();
                j1.Derrota();

                System.out.println(j2.getNombre() + " gana");
            } else {

                System.out.println("Hay empate");
            }
            System.out.println(j1.getNombre() + " : " + j1.getFichas());
            System.out.println(j2.getNombre() + " : " + j2.getFichas());
        } while (j1.getFichas()>0 && j2.getFichas()>0);
        if (j1.getFichas() == 0) {
            System.out.println(j2.getNombre() + "ha ganado el juego");
        } else {
            System.out.println(j1.getNombre() + "ha ganado el juego");
        }
    }

}
