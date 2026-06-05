package proyecto_mascota;

import javax.swing.JOptionPane;

public class Perro extends mascota implements Habilidad, Jugar, Alimentar, Bañar{

    public Perro() {
    }

    public Perro(String nombre, String especie, int agresividad, String dieta, int aniosVida, String habilidad) {
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
        JOptionPane.showMessageDialog(null, "Lanzar la pelota","Perro",JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void Alimentar() {
        JOptionPane.showMessageDialog(null, "Croquetas","Perro",JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void activarHabilidad() {
        JOptionPane.showMessageDialog(null, "Crecer 5 metros","Perro",JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public void Bañar() {
        JOptionPane.showMessageDialog(null, "Preparar la mangera y el jabon","Perro",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
