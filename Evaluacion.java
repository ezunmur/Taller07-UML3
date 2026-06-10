import java.time.LocalDateTime;
//Recordar DateTime para futuras referencias 
public class Evaluacion extends ActividadSumativa{
    
    private int limiteDeTiempo;

    public Evaluacion(String id, String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, int limiteDeTiempo) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido); 
        this.limiteDeTiempo = limiteDeTiempo;
    }
    public int getLimiteDeTiempo() {
        return limiteDeTiempo;}
    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }
}