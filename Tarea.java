import java.time.LocalDateTime;
//Poner o inverstigar lo de DateTime
public class Tarea extends ActividadSumativa{
    
    private LocalDateTime fechaDePublicacion;

    public Tarea(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, LocalDateTime fechaDePublicacion) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}