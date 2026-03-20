package rrhh;

public class AltaEmpleado {
    private final EmpleadoRepositorio repositorio ;
    private final GeneradorContraseña generador;

    public AltaEmpleado(EmpleadoRepositorio repositorio, GeneradorContraseña generador) {
        this.repositorio = repositorio;
        this.generador = generador;
    }

    public Empleado alta(String dni, String nombre) {
        if (dni == null || dni.isBlank()) throw new IllegalArgumentException("DNI requerido");
        if (repositorio.existe(dni)) throw new IllegalStateException("Ya existe");

        String password = generador.generar();
        Empleado e = new Empleado(dni, nombre, password);
        repositorio.guardar(e);

        System.out.println("Usuario creado: " + nombre);
        return e;
    }
}
