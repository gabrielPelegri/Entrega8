package Obras;

public class Libro extends Obra {
    private static int contador = 0;
    String autor;
    String titulo;
    int paginas;

    public Libro(String autor, String titulo, int paginas) {
        contador++;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;

    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public int getContador() {
        return this.contador;
    }

    public String toString() {
        String s = getContador() + ": ";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        s += " (" + this.getPaginas() + " páginas)";
        return s;

    }
}
