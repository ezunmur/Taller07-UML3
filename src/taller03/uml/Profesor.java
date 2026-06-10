package taller03.uml;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends PersonalAcademico {

    private List<Curso> cursosResponsables = new ArrayList<>();

    public Profesor() {
        super();
    }

    public Profesor(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        if (curso == null || actividadSumativa == null) {
            System.out.println("No se pudo cargar la actividad: datos incompletos.");
            return;
        }
        curso.addActividad(actividadSumativa);
        System.out.println("Actividad '" + actividadSumativa.getTitulo() + "' cargada en el curso " + curso.getNombre());
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
        if (curso == null || estudiante == null || actividadSumativa == null) {
            System.out.println("No se pudo calificar: datos incompletos.");
            return;
        }

        // En este modelo simplificado la actividad tiene una calificación global.
        float nota = actividadSumativa.getPuntajeMaximo() * 0.8f; // ejemplo: 80% del máximo
        actividadSumativa.aplicarCalificacion(nota);
        System.out.println("Actividad '" + actividadSumativa.getTitulo() + "' calificada para " + estudiante.getNombre() + " con nota " + nota);
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {
        if (curso == null || usuarioEstudiante == null || usuarioEstudiante.isEmpty()) {
            System.out.println("No se pudo aceptar inscripción: datos incompletos.");
            return;
        }
        System.out.println("Inscripción de '" + usuarioEstudiante + "' aceptada en el curso " + curso.getNombre());
    }

    public void crearNuevoForo(Foro foro) {
        if (foro == null) {
            System.out.println("Foro inválido.");
            return;
        }
        System.out.println("Foro creado: " + foro.getTematica());
    }

    public List<Curso> getCursosResponsables() {
        return new ArrayList<>(cursosResponsables);
    }

    public void addCursoResponsable(Curso curso) {
        if (curso != null && !cursosResponsables.contains(curso)) {
            cursosResponsables.add(curso);
        }
    }
}
