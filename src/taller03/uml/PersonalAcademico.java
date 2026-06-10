package taller03.uml;

public class PersonalAcademico extends Usuario {

    public PersonalAcademico() {
        super();
    }

    public PersonalAcademico(String usuario, String contrasenia,
                             String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }

    public void reportarError(String email, String contenido) {

        System.out.println("=== REPORTE DE ERROR ===");
        System.out.println("Usuario: " + getNombre() + " " + getApellido());
        System.out.println("Email: " + email);
        System.out.println("Detalle: " + contenido);
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {

        System.out.println("=== SOLICITUD DE ASESORAMIENTO ===");
        System.out.println("Usuario: " + getNombre() + " " + getApellido());
        System.out.println("Email: " + email);
        System.out.println("Consulta: " + contenido);
    }

    public void comentarEnForo(Foro foro, String comentario) {

        if (foro == null) {
            System.out.println("No se pudo publicar el comentario.");
            return;
        }

        foro.setNumeroDeComentarios(
                foro.getNumeroDeComentarios() + 1
        );

        System.out.println(getNombre() + " comentó en el foro: "
                + foro.getTematica());
        System.out.println("Comentario: " + comentario);
    }

}