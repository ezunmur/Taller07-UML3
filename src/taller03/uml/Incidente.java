package taller03.uml;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {

    // Atributos
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones;
    protected LocalDateTime fechaCerrado;
    protected String tipo;

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
        this.logActualizaciones = new ArrayList<>();
    }

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
}