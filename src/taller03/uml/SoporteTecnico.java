package taller03.uml;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico() {
        super();
    }

    public SoporteTecnico(String usuario, String contrasenia,
                          String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {

        if (usuario == null) {
            System.out.println("No se pudo brindar asistencia.");
            return;
        }

        System.out.println("Brindando asistencia a: "
                + usuario.getNombre() + " "
                + usuario.getApellido());
    }

    public void resolverProblemaTecnico(Usuario usuario) {

        if (usuario == null) {
            System.out.println("No se pudo resolver el problema técnico.");
            return;
        }

        System.out.println("Problema técnico resuelto para: "
                + usuario.getNombre() + " "
                + usuario.getApellido());
    }

    public void derivarProblemaDeGestion(Administrador administrador) {

        if (administrador == null) {
            System.out.println("No se pudo derivar el problema.");
            return;
        }

        System.out.println("Problema derivado al administrador: "
                + administrador.getNombre() + " "
                + administrador.getApellido());
    }
}