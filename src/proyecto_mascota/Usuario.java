package proyecto_mascota;
public class Usuario {
    protected String name;
    protected int edad;
    protected String mascota;
    protected String estadoMascota;

    public Usuario() {
    }

    public Usuario(String name, int edad, String mascota, String estadoMascota) {
        this.name = name;
        this.edad = edad;
        this.mascota = mascota;
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

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(String estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    
    
    
    
}
