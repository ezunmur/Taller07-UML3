package taller03.uml;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {

    private int id;
    private LocalDateTime fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private LocalDateTime fechaCerrado;
    private String tipo;
    private Usuario responsable;

    public Incidente(int id, LocalDateTime fechaReportado, String estado,
                     String titulo, String descripcion,
                     LocalDateTime fechaCerrado, String tipo) {

        this.id = id;
        this.fechaReportado = fechaReportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCerrado = fechaCerrado;
        this.tipo = tipo;
        this.responsable = null;
        this.logActualizaciones = new ArrayList<>();
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaReportado() {
        return fechaReportado;
    }

    public void setFechaReportado(LocalDateTime fechaReportado) {
        this.fechaReportado = fechaReportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getLogActualizaciones() {
        return logActualizaciones;
    }

    public void setLogActualizaciones(List<String> logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }

    public LocalDateTime getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(LocalDateTime fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public void asignarResponsable(Usuario usuario) {
        this.responsable = usuario;
        if (usuario != null) {
            agregarActualizacion("Responsable asignado: " + usuario.getUsuario());
        }
    }

    // Métodos de gestión

    public void agregarActualizacion(String actualizacion) {
        logActualizaciones.add(actualizacion);
    }

    public void cerrarIncidente() {
        this.estado = "Cerrado";
        this.fechaCerrado = LocalDateTime.now();
    }

    
}