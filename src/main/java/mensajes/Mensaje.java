package mensajes;

public abstract class Mensaje {
        protected final String canal;
        protected final String destinatario;
        protected final String titulo;
        protected final String cuerpo;
        protected final String fecha;

        public Mensaje(String canal, String destinatario, String titulo, String cuerpo, String fecha) {
            this.canal = canal;
            this.destinatario = destinatario;
            this.titulo = titulo;
            this.cuerpo = cuerpo;
            this.fecha = fecha;
        }

        public abstract String generarTexto();
    }