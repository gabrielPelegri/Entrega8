public class JugadorGuerra {
    Dado dado;
    int fichas;
    String nombre;

    public JugadorGuerra(Dado dado) {
        this.dado = dado;
        this.fichas = 10;
    }

    public int getFichas() {
        return this.fichas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Derrota() {
        this.fichas--;
    }

    public void Victoria() {
        this.fichas++;
    }
}