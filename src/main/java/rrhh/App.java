package rrhh;

public class App {
    public static void main(String[] args) {
        // Aquí "inyectamos" las implementaciones concretas
        EmpleadoRepositorio repo = new EmpleadoRepositorio() {
            @Override
            public boolean existe(String dni) {
                return false;
            }

            @Override
            public void guardar(Empleado e) {

            }
        };
        GeneradorContraseña gen = new GeneradorContraseña() {
            @Override
            public String generar() {
                return "";
            }
        };

        AltaEmpleado service = new AltaEmpleado(repo, gen);
        service.alta("11111111A", "Lucía");
    }
}