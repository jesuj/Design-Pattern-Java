package Estado;

/**
 *
 * @author Oni
 */
public class Casado implements State {

    @Override
    public void soltero(Persona persona) {
        persona.setEstadoPersona("Estoy Casado no soltero");
    }

    @Override
    public void casado(Persona persona) {
        persona.setEstadoPersona("Estado Casado");
    }

    @Override
    public void viudo(Persona persona) {
        persona.setEstadoPersona("Luto");
        persona.setEstado(new Viudo());
    }

    @Override
    public void diavorsiado(Persona persona) {
        persona.setEstadoPersona("Firmando contrato");
        persona.setEstado(new Divorsiado());
    }

    
}
