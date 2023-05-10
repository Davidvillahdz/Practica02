
package Controlador;

import ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases.Persona;
import java.util.List;

public interface IControlador {
    public int MAX_OBJECTS =10;
    public abstract void create(Object obj);
    public abstract Object read(Object obj);
    public abstract void update(Object obj);
    public abstract void delete(Object obj);
    public abstract void list();
}
