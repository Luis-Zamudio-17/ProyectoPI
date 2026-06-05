package proyecto_mascota;
import javax.swing.JOptionPane;
public class Delfin extends mascota implements Jugar,Alimentar, Habilidad{

    public Delfin() {
    }

    public Delfin(String nombre, String especie, int agresividad, String dieta, int aniosVida, String habilidad) {
        super(nombre, especie, agresividad, dieta, aniosVida, habilidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getAniosVida() {
        return aniosVida;
    }

    public void setAniosVida(int aniosVida) {
        this.aniosVida = aniosVida;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
 

    @Override
    public void Jugar() {
        JOptionPane.showMessageDialog(null, "Jugar con la pelota","Delfin",JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void Alimentar() {
        JOptionPane.showMessageDialog(null, "Sardinas","Delfin",JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void activarHabilidad() {
        JOptionPane.showMessageDialog(null, "Lanza chorro de agua","Delfin",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
