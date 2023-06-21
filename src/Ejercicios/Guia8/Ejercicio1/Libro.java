package Ejercicios.Guia8.Ejercicio1;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;


    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return " El" +
                " isbn del libro es " + isbn +
                ", su titulo='" + titulo + '\'' +
                ", su autor='" + autor + '\'' +
                ", y su cantidad de paginas =" + numeroPaginas +
                '}';
    }
}
