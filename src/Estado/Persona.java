package Estado;

/**
 *
 * @author Oni
 */
public class Persona {
    State estado;
    String nombre;
    String estadoPersona;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.estado = new Soltero();
    }
    
    public void setEstado(State estado) {
        this.estado = estado;
    }
    
    void setEstadoPersona(String estado){
        this.estadoPersona = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
