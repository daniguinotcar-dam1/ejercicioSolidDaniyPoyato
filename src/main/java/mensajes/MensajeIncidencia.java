package mensajes;

public class MensajeIncidencia extends Mensaje {
    private final String alumno;
    private final String tutoria;
    private final String gravedad;

    public MensajeIncidencia(String canal, String destinatario, String titulo, String cuerpo, String fecha, String alumno, String tutoria, String gravedad) {
        super(canal, destinatario, titulo, cuerpo, fecha);
        this.alumno = alumno;
        this.tutoria = tutoria;
        this.gravedad = gravedad;
    }

    @Override
    public String generarTexto() {
        String asuntoBase = "[" + canal.toUpperCase() + "] ";

        return asuntoBase + "Incidencia (" + gravedad + "): " + titulo + "\n" +
                "Alumno/a: " + alumno + "\n" +
                "Tutoría: " + tutoria + "\n" +
                "Detalle: " + cuerpo + "\n";
    }
}
