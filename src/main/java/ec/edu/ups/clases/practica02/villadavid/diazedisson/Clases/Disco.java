package ec.edu.ups.clases.practica02.villadavid.diazedisson.Clases;

public class Disco extends Cantante{
    private int codigo;
    private String nombredisco;
    private int anioDeLanzamiento;

    //constructor vacio
    public Disco() {
    }
    
    //constructor
    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombredisco = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }
    
    //getters y setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombredisco() {
        return nombredisco;
    }

    public void setNombredisco(String nombre) {
        this.nombredisco = nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    //equals y hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        return this.codigo == other.codigo;
    }
    
    //toSrting
    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombredisco=" + nombredisco + ", anioDeLanzamiento=" + anioDeLanzamiento + '}';
    }
    
}
