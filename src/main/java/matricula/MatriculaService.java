package matricula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MatriculaService {
    private final ValidaDni validador = new ValidaDni();
    private final CalculadoraPrecios calculadora = new CalculadoraPrecios();

    private final List<Matricula> matriculas = new ArrayList<>();

    public Matricula crearMatricula(String dni, String curso, double precioBase, boolean bonificacion) {
        ValidaDni.validarDni(dni);
        double precioFinal = CalculadoraPrecios.calcularPrecio(precioBase, bonificacion);

        Matricula m = new Matricula(dni, curso, LocalDate.now(), precioFinal);
        matriculas.add(m);

        // Simulación de notificación (no I/O real, solo consola)
        System.out.println("[AVISO] Matriculado " + dni + " en " + curso + " por " + precioFinal + "€");
        return m;
    }

    public String exportarResumen() {
        String resultado = "RESUMEN MATRÍCULAS\n";

        for (Matricula m : matriculas) {
            resultado += m.getDni() + " | "
                    + m.getCurso() + " | "
                    + m.getFecha() + " | "
                    + m.getPrecioFinal() + "\n";
        }

        return resultado;
    }
}