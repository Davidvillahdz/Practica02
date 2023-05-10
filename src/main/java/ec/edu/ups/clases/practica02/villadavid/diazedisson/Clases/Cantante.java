package ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases;

import java.util.ArrayList;
import java.util.List;

public class Cantante extends Persona {
 private String nombreArtistico;
 private String generoMusical;
 private int numeroDeSencillos;
 private int numeroDeConciertos;
 private int numeroDeGiras;
 private List<Disco>discografia;
 
 //constructor vacio

     public Cantante() {
        this.discografia = new ArrayList<>();
    }
    
    //constructor

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, List<Disco> discografia, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = new ArrayList<>();
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
        this.discografia = discografia;
    }
    public double calcularSalario() {
        int salarioBase = 450;
        if (getNumeroDeSencillos() > 10 && getNumeroDeGiras() > 3) {
            int salarioFinal = salarioBase + 1000;
            return salarioFinal;
        } else if (getNumeroDeSencillos() >= 1 && getNumeroDeSencillos() <= 10) {
            double porcentaje = salarioBase * 0.05;
            return porcentaje + salarioBase;
        } else if (getNumeroDeGiras() >= 1 && getNumeroDeGiras() <= 3) {
            double porcentaje = salarioBase * 0.03;
            return porcentaje + salarioBase;
        } else if (getDiscografia().size() >= 62) {
            int salarioFinal = salarioBase + 2000;
            return salarioFinal;
        }
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombreArtistico=" + nombreArtistico + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos + ", numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras + ", discografia=" + discografia + '}';
    }
}
