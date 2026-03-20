package mensajes;

public class MensajeAviso extends Mensaje {
    public MensajeAviso(String canal, String destinatario, String titulo, String cuerpo, String fecha) {
        super(canal, destinatario, titulo, cuerpo, fecha);
    }

    @Override
    public String generarTexto() {
        String asuntoBase = "[" + canal.toUpperCase() + "] ";

        return asuntoBase + "Aviso: " + titulo + "\n" +
                "Hola " + destinatario + ",\n" +
                cuerpo + "\n" +
                "Fecha: " + fecha + "\n";
    }
}