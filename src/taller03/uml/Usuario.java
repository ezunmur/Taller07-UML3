package taller03.uml;

public class Usuario {

    protected String usuario;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected boolean sesionActiva;

    public Usuario() {

    }

    public Usuario(String usuario, String contra, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasenia = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sesionActiva = false;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String u) {
        this.usuario = u;
    }

    public void setContrasenia(String c) {
        this.contrasenia = c;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setApellido(String a) {
        this.apellido = a;
    }

    // Métodos para autenticación

    public boolean logIn(String user, String pass) {
        if(sesionActiva) {
            return false;
        } else if (this.usuario.equals(user) && this.contrasenia.equals(pass)) {
            sesionActiva = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean logOut() {
        if(!sesionActiva) {
            sesionActiva = false;
            return true;
        }
        return false;
    }
    
}
