package Obras;

public class Video extends Obra {

    String titulo;
    String autor;
    int duracion;
    int ident;

    public Video(String autor, String titulo, int duracion) {
        contador++;
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
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

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public int getIdent() {
        return this.ident;
    }

    @Override
    public String toString() {

        String s = this.ident + ": ";
        s += this.getTitulo() + " de ";
        s += this.getAutor();
        if (duracion <= 60) {
            s += "( " + this.duracion + " min)";
        } else {
            int horas = this.duracion / 60;
            int minutos = this.duracion % 60;
            s += "( " + horas + "h " + minutos + " min)";
        }

        return s;
    }
}
