
public class Cliente {
   private static int contador = 0;
    String nombre;
    int id = 0;

    public Cliente() {
        contador++;
        this.id=contador;
    }

    public Cliente(String n) {
        contador++;
        this.nombre = n;
        this.id = contador;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String s = "";
        s = "Cliente n.º" + this.id + " [" + this.nombre + "]\n";
        return s;
    }

}