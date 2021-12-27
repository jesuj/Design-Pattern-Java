package Estrategia;

/**
 *
 * @author Oni
 */
public class SerieA implements SerieEstrategia {
    
    public int siguiente(int i) {
        return i*i;
    }
    
    @Override
    public String mostrarSerie(int n) {
        String acumulador = "{";
        for (int i = 0; i < n; i++) {
            
            acumulador += this.siguiente(i+1)+" , "; 
        }
        return acumulador+"}";
    }
    
}
