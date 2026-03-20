package rrhh;

public interface EmpleadoRepositorio {
        boolean existe(String dni);
        void guardar(Empleado e);
}
