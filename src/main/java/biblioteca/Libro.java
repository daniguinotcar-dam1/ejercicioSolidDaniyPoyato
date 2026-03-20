package biblioteca;

import java.time.LocalDate;

public class Libro implements PuedePrestar {

    protected final String titulo;
    protected String prestadoA;
    protected LocalDate fechaDevolucion;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void prestarA(String dni, LocalDate fechaDevolucion) {
        this.prestadoA = dni;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void devolver() {
        this.prestadoA = null;
        this.fechaDevolucion = null;
    }

    public boolean estaPrestado() {
        return prestadoA != null;
    }

    public String getTitulo() {
        return titulo;
    }
}