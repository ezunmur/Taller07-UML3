package taller03.uml;

public class Administrador extends Usuario {

    public Administrador(String usuario, String contra, String nombre, String apellido) {
        super(usuario, contra, nombre, apellido);
    }
    
    public void crearUsuarioConRol(String usuario, String contrasenia) {
        Usuario nUsuario = new Usuario();
        nUsuario.setUsuario(usuario);
        nUsuario.setContrasenia(contrasenia);

        System.out.println("Usuario creado exitosamente: " + nUsuario.getUsuario());
    }

    public void asignarPermiso(String usuario){
        System.out.println("Permisos agregados al usuario: ");
    }

    public void actualizarSoftware() {
        System.out.println("Software actualizado exitosamente");
    }

    public void asignarResponsable() {
        // Faltan implementacion de entrada
    }
}
