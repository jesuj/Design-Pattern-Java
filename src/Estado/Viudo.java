package Estado;

/**
 *
 * @author Oni
 */
public class Viudo implements State {

    @Override
    public void soltero(Persona persona) {
        persona.setEstadoPersona("Estoy Viudo");
    }

    @Override
    public void casado(Persona persona) {
        persona.setEstadoPersona("Firmando para casarme de nuevo");
        persona.setEstado(new Casado());
    }

    @Override
    public void viudo(Persona persona) {
        persona.setEstadoPersona("estado viudo");
    }

    @Override
    public void diavorsiado(Persona persona) {
        persona.setEstadoPersona("Estoy viudo no divorsiado");
    }

}
