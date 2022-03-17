package Obras;

public class Libro extends Obra {
    String autor;
    String titulo;
    int paginas;

    public Libro(String autor, String titulo, int paginas) {
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

    public String toString() {
        String s = "";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        s += " (" + this.getPaginas() + " páginas)";
        return s;

    }
}
