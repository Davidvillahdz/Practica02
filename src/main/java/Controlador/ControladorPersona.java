
package Controlador;

import ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases.Persona;
import java.util.ArrayList;
import java.util.List;

public class ControladorPersona implements IControlador {
    private List<Persona> personas; 
   
    public ControladorPersona() {
    personas  =new ArrayList<Persona>();
} 
    //imprimir 
    public void imprimir(){
    for(Persona p: personas){
        System.out.println(p.toString());
    }
}
    //buscar por nombre del disco 
    public Persona buscarPorNombreDeDisco(String valor) {
        for (Persona p : personas) {
            if (p.getNombredisco().equals(valor)) {
                return p;
            }
        }
        return null;
    }    
    //buscar el titulo de la cancion 
    public Persona buscarPorTituloDeCancion (String valor){
        for(Persona p: personas){
            if(p.getTitulo().equals(valor)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Persona){
            personas.add((Persona) obj);
        } 
    }

    @Override
    public Object read(Object obj) {
       for (Persona p : personas) {
            if (p.equals(obj)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(Object obj) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).equals(obj)) {
                personas.set(i, (Persona) obj);
                break;
            }
        }
        }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                }
            }
        }
    }

    @Override
    public void list() {
        for(Persona persona : personas){
        System.out.println(persona.toString());
    }
    }
}

