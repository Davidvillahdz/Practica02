package ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases;

import java.util.ArrayList;
import java.util.List;

public class Compositor extends Persona{
    private int numeroDeComposiciones;
    private List<Cancion>cancionesTop100billboard;
    private List<Cantante>Clientes;
    
    //Constructor vacio
    public Compositor() {
        this.cancionesTop100billboard = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }
    
    //Contronstructor

   public Compositor(int numeroDeComposiciones, List<Cancion> cancioesTop100Billboard, List<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100billboard = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }
   
   //setters y getters
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100billboard() {
        return cancionesTop100billboard;
    }

    public void setCancionesTop100billboard(List<Cancion> cancionesTop100billboard) {
        this.cancionesTop100billboard = cancionesTop100billboard;
    }

    public List<Cantante> getClientes() {
        return Clientes;
    }

    public void setClientes(List<Cantante> Clientes) {
        this.Clientes = Clientes;
    }

    public double calcularSalario() {
        int salarioBase = 450;
        if (getNumeroDeComposiciones() > 5) {
            int salarioFinal = salarioBase + 300;
            return salarioFinal;
        } else if (getCancionesTop100billboard().size() >= 1 && getCancionesTop100billboard().size() <= 3) {
            double salarioFinal = (salarioBase * 0.1) + salarioBase;
            return salarioFinal;
        } else if (getCancionesTop100billboard().size() >= 4 && getCancionesTop100billboard().size() <= 6) {
            double salarioFinal = (salarioBase * 0.2) + salarioBase;
            return salarioFinal;
        } else if (getCancionesTop100billboard().size() > 6) {
            double salarioFinal = (salarioBase * 0.2) + salarioBase;
            return salarioFinal;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100billboard=" + cancionesTop100billboard + ", Clientes=" + Clientes + '}';
    }

    
}
   
