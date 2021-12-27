package Estado;

/**
 *
 * @author Oni
 */
public interface State {
    void soltero(Persona persona);
    void casado(Persona persona);
    void viudo(Persona persona);
    void diavorsiado(Persona persona);
}