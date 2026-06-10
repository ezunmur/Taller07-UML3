package taller03.uml;

public class Usuario {

    protected String usuario;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected boolean sesionActiva;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasenia, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sesionActiva = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean logIn(String user, String pass) {
        if (sesionActiva) {
            return false;
        }

        if (this.usuario.equals(user) && this.contrasenia.equals(pass)) {
            sesionActiva = true;
            return true;
        }

        return false;
    }

    public boolean logOut() {
        if (sesionActiva) {
            sesionActiva = false;
            return true;
        }

        return false;
    }
}