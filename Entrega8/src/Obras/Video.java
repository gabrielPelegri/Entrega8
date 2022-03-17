package Obras;

public class Video extends Obra {
    String titulo;
    String autor;
    int duracion;

    public Video(String autor, String titulo, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String toString() {
        String s = "";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        s += " (" + this.getDuracion() + " minutos)";
        return s;
    }
}
