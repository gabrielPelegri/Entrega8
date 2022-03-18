package Obras;

public abstract class Obra {
    protected static int contador = 0;
    String titulo;
    String autor;
    int ident;

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getIdent() {
        return this.ident;
    }
}
