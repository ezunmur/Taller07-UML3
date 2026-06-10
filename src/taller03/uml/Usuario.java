package taller03.uml;

public class Usuario {

    protected String usuario;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;

    public Usuario (String usuario, String contra, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasenia = contra;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public boolean logIn() {
        return true;
    }

    public boolean logOut() {
        return true;
    }
    
}
