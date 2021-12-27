package Plantilla;

/**
 *
 * @author Oni
 */
public class SerieB extends SeriePlantilla {

    @Override
    public int siguiente(int i) {
        int total=1;
        for (int j = 1; j < i; j++) {
            total*=10;
        }
        return total;
    }
    
}
