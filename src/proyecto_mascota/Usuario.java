package proyecto_mascota;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
    protected String name;
    protected int edad;
    protected String estadoMascota;
    protected ArrayList<Mascota> mascotas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String name, int edad, String estadoMascota) {
        this.name = name;
        this.edad = edad;
        this.estadoMascota = estadoMascota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(String estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
   
}
