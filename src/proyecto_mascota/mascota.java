package proyecto_mascota;
public abstract class mascota {
    protected String nombre;
    protected String especie;
    protected int agresividad;
    protected String dieta;
    protected int aniosVida;
    protected String habilidad;

    public mascota() {
    }
    

    public mascota(String nombre, String especie, int agresividad, String dieta, int aniosVida, String habilidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.agresividad = agresividad;
        this.dieta = dieta;
        this.aniosVida = aniosVida;
        this.habilidad = habilidad;
    }
    
    
}
