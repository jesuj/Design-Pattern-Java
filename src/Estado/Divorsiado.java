package Estado;

/**
 *
 * @author Oni
 */
public class Divorsiado implements State{

    @Override
    public void soltero(Persona persona) {
        persona.setEstadoPersona("Estoy Diborsiado");
    }

    @Override
    public void casado(Persona persona) {
        persona.setEstadoPersona("Volviendo a firmar para casarme");
        persona.setEstado(new Casado());
    }

    @Override
    public void viudo(Persona persona) {
        persona.setEstadoPersona("Estoy Diborciado no viudo");
    }

    @Override
    public void diavorsiado(Persona persona) {
        persona.setEstadoPersona("Estado diborciado");
    }

    
    
}
