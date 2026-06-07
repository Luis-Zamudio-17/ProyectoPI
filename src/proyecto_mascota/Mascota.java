package proyecto_mascota;
public class Mascota {
    protected String nombre;
    protected String especie;
    protected int agresividad;
    protected String dieta;
    protected int aniosVida;
    protected String habilidad;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int agresividad, String dieta, int aniosVida, String habilidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.agresividad = agresividad;
        this.dieta = dieta;
        this.aniosVida = aniosVida;
        this.habilidad = habilidad;
    }
    
    public String getEspecie(){
        return especie;
    }
    
}
