import java.time.LocalDateTime;
// Utilizar LocalDateTime
public class ActividadSumativa{
    
    protected String id;
    protected String titulo; 
    protected LocalDateTime fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion; 

    public ActividadSumativa(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = 0.0f; 
    }
    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public LocalDateTime getFechaDeEntrega() { 
        return fechaDeEntrega; 
    }
    
    public void setFechaDeEntrega(LocalDateTime fechaDeEntrega) { 
        this.fechaDeEntrega = fechaDeEntrega; 
    }

    public float getPuntajeMaximo() { 
        return puntajeMaximo; 
    }
    
    public void setPuntajeMaximo(float puntajeMaximo) { 
        this.puntajeMaximo = puntajeMaximo; 
    }

    public String getContenido() { 
        return contenido; 
    }
    
    public void setContenido(String contenido) { 
        this.contenido = contenido; 
    }

    public float getCalificacion() { 
        return calificacion; 
    }
    
    public void setCalificacion(float calificacion) { 
        this.calificacion = calificacion; 
    }
}