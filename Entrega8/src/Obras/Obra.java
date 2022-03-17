package Obras;

public abstract class Obra {
    private static int contador = 0;
    String titulo;
    String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }
}
