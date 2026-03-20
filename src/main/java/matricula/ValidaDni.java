package matricula;

public class ValidaDni {
    public static void validarDni(String dni) {
        if (dni == null || dni.isBlank() || dni.length() < 7) {
            throw new IllegalArgumentException("DNI inválido");
        }
    }
}
