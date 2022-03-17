package Obras;

public class Video extends Obra {
    private static int contador = 0;
    String titulo;
    String autor;
    int duracion;

    public Video(String autor, String titulo, int duracion) {
        contador++;
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

    public int getContador() {
        return this.contador;
    }

    @Override
    public String toString() {
        String s = getContador() + ": ";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        s += " (" + this.getDuracion() + " minutos)";
        return s;
    }
}
