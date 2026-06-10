package taller03.uml;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends PersonalAcademico {

    private List<Curso> cursosInscritos = new ArrayList<>();

    public Estudiante() {
        super();
    }

    public Estudiante(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }

    public void solicitarInscripcionCurso(Curso curso) {
        if (curso == null) {
            System.out.println("Curso inválido.");
            return;
        }
        if (!cursosInscritos.contains(curso)) {
            cursosInscritos.add(curso);
            System.out.println(getNombre() + " solicitó inscripción en el curso: " + curso.getNombre());
        } else {
            System.out.println(getNombre() + " ya está inscrito en el curso: " + curso.getNombre());
        }
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        if (curso == null || actividadSumativa == null) {
            System.out.println("Datos de actividad o curso incompletos.");
            return;
        }
        if (!cursosInscritos.contains(curso)) {
            System.out.println("No inscrito en el curso: " + curso.getNombre());
            return;
        }

        System.out.println(getNombre() + " entregó la actividad '" + actividadSumativa.getTitulo() + "' del curso " + curso.getNombre());
    }

    public List<Curso> getCursosInscritos() {
        return new ArrayList<>(cursosInscritos);
    }
}
