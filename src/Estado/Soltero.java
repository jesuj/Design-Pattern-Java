package Estado;

/**
 *
 * @author Oni
 */
public class Soltero implements State
{

    @Override
    public void soltero(Persona persona) {
        persona.setEstadoPersona("Estado soltero");
    }

    @Override
    public void casado(Persona persona) {
        persona.setEstadoPersona("Casandome");
        persona.setEstado(new Casado());
    }

    @Override
    public void viudo(Persona persona) {
        persona.setEstadoPersona("Estoy Soltero no se puede esa opcion de viudo");
    }

    @Override
    public void diavorsiado(Persona persona) {
        persona.setEstadoPersona("Estoy Soltero no se puede esa opcion de divorsiado");
    }
}
