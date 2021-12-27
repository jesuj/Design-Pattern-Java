package Plantilla;

/**
 *
 * @author Oni
 */
public abstract class SeriePlantilla {
    
    public abstract int siguiente(int i);
    
    public String mostrarSerie(int n){
        String acumulador = "{";
        for (int i = 0; i < n; i++) {
            acumulador += this.siguiente(i+1)+" , "; 
        }
        return acumulador+"}";
    }
}
