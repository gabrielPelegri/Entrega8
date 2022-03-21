package Obras;

public class Libro extends Obra {
    
    String autor;
    String titulo;
    int paginas;
    int ident;

    public Libro(String autor, String titulo, int paginas) {
        contador++;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.ident = contador;

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

    @Override
    public int getIdent() {
        return this.ident;
    }

    public String toString() {
        String s = this.ident + ": ";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        s += " (" + this.getPaginas() + " paginas)";
        return s;

    }
}
