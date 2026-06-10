package taller03.uml;

public class SoporteTecnico extends Usuario{

    public SoporteTecnico() {
        super();
    }
    
    public SoporteTecnico(String usuario, String contra, String nombre, String apellido) {
        super(usuario, contra, nombre, apellido);
    }
    
    public void brindarAsistencia(Usuario usuario) {
        System.out.println("Brindando asistencia a: " + usuario.getNombre());
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        System.out.println("Resolviendo problema técnico de: " + usuario.getNombre());
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        System.out.println("Problema derivado a: " + administrador.getNombre());
    }

}
