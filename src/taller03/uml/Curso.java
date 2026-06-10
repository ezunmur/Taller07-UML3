package taller03.uml;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    private List<Foro> foros = new ArrayList<>();
    private List<ActividadSumativa> actividades = new ArrayList<>();
    
    public Curso(String id, String nombre, boolean estadoDisponible){
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }

    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public boolean getEstadoDisponible() { 
        return estadoDisponible; 
    }
    
    public void setEstadoDisponible(boolean estadoDisponible) { 
        this.estadoDisponible = estadoDisponible; 
    }

    // Relación con foros
    public List<Foro> getForos() {
        return new ArrayList<>(foros);
    }

    public void addForo(Foro foro) {
        if (foro != null) {
            foros.add(foro);
        }
    }

    public boolean removeForo(Foro foro) {
        return foros.remove(foro);
    }

    // Relación con actividades
    public List<ActividadSumativa> getActividades() {
        return new ArrayList<>(actividades);
    }

    public void addActividad(ActividadSumativa actividad) {
        if (actividad != null) {
            actividades.add(actividad);
        }
    }

    public boolean removeActividad(ActividadSumativa actividad) {
        return actividades.remove(actividad);
    }

}
