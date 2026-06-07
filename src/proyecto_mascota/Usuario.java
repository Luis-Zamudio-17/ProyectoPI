package proyecto_mascota;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
    protected String name;
    protected int edad;
    protected ArrayList<Mascota> mascotas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String name, int edad) {
        this.name = name;
        this.edad = edad;
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

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
   
}
