package Estrategia;

/**
 *
 * @author Oni
 */
public class SerieB implements SerieEstrategia {
    public int siguiente(int i) {
        int total=1;
        for (int j = 1; j < i; j++) {
            total*=10;
        }
        return total;
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
