package taller03.uml;

public class Administrador extends Usuario {

    public Administrador() {
        super();
    }

    public Administrador(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }

    // Crear un usuario con rol básico
    public Usuario crearUsuarioConRol(String usuario, String contrasenia, String nombre, String apellido) {
        return new Usuario(usuario, contrasenia, nombre, apellido);
    }

    // Asignar permisos (simulado)
    public void asignarPermiso(Usuario usuario, String permiso) {
        System.out.println("Permiso '" + permiso + "' asignado a: " + usuario.getUsuario());
    }

    // Actualización del sistema
    public void actualizarSoftware() {
        System.out.println("El sistema ha sido actualizado correctamente.");
    }

    // Asignar responsable de un curso (preferiblemente un Profesor)
    public void asignarResponsable(Curso curso, Profesor responsable) {
        if (curso == null || responsable == null) {
            System.out.println("No se pudo asignar responsable: datos incompletos.");
            return;
        }
        System.out.println("Responsable " + responsable.getNombre()
                + " asignado al curso " + curso.getNombre());
    }

    // Bloquear usuario
    public void bloquearUsuario(Usuario usuario) {
        System.out.println("Usuario bloqueado: " + usuario.getUsuario());
    }

    // Desbloquear usuario
    public void desbloquearUsuario(Usuario usuario) {
        System.out.println("Usuario desbloqueado: " + usuario.getUsuario());
    }
}