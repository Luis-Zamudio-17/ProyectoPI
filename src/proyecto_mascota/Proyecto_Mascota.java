package proyecto_mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Proyecto_Mascota {
 
    static final Scanner sc = new Scanner(System.in);
 
    // Descarta cualquier linea residual que haya quedado en el buffer
    private static void limpiarBuffer() {
        try {
            while (System.in.available() > 0) {
                System.in.read();
            }
        } catch (Exception ignored) {}
    }
 
    // Lee un entero con try-catch, repite si la entrada no es valida
    private static int leerEntero() {
        while (true) {
            try {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println(Estilos.ERROR + Estilos.ROJO_B + " Ingresa solo un numero entero." + Estilos.RESET);
                System.out.print(Estilos.PREGUNTA + " Opcion: ");
            }
        }
    }
 
    // Lee un entero dentro de un rango valido
    private static int leerEntero(int min, int max) {
        while (true) {
            int n = leerEntero();
            if (n >= min && n <= max) return n;
            System.out.println(Estilos.ERROR + Estilos.ROJO_B + " Opcion invalida. Elige entre " + min + " y " + max + "." + Estilos.RESET);
            System.out.print(Estilos.PREGUNTA + " Opcion: ");
        }
    }
 
    // Pausa generica antes de cambiar de vista
    private static void pausar() {
        System.out.println();
        System.out.print(Estilos.PREGUNTA + " Presiona Enter para continuar...");
        System.out.flush();
        limpiarBuffer();
        sc.nextLine();
        Estilos.limpiar();
    }
 
    public static void main(String[] args) {
 
        List<Usuario> usu = new ArrayList<>();
 
        Estilos.limpiar();
        pantallaInicio();
 
        System.out.print(Estilos.INFO + Estilos.CIAN_B + " Introduce tu nombre: " + Estilos.RESET);
        String nom = sc.nextLine().trim();
 
        int ed = 0;
        while (true) {
            try {
                System.out.print(Estilos.INFO + Estilos.CIAN_B + " Introduce tu edad:  " + Estilos.RESET);
                String linea = sc.nextLine().trim();
                ed = Integer.parseInt(linea);
                if (ed <= 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println(Estilos.ERROR + Estilos.ROJO_B + " Ingresa una edad valida." + Estilos.RESET);
            }
        }
 
        usu.add(new Usuario(nom, ed));
        System.out.println();
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Bienvenido/a, " + Estilos.NEGRITA + nom + Estilos.RESET + Estilos.VERDE_B + "!" + Estilos.RESET);
 
        // Pausa antes de entrar al menu principal
        pausar();
 
        int opc;
        do {
            menuPrincipal();
            System.out.print(Estilos.PREGUNTA + " Opcion: ");
            System.out.flush();
            opc = leerEntero(1, 3);
            Estilos.limpiar();
            switch (opc) {
                case 1: mascotita(usu); break;
                case 2: consultita(usu); break;
                case 3:
                    System.out.println();
                    System.out.println(Estilos.LINEA_SIMPLE);
                    System.out.println(Estilos.MAGENTA_B + Estilos.NEGRITA
                        + "  Hasta pronto, " + nom + "! Cuida bien a tus mascotas  " + Estilos.RESET);
                    System.out.println(Estilos.LINEA_SIMPLE);
                    break;
            }
        } while (opc != 3);
    }
 
    // ─── Pantallas ────────────────────────────────────────────────
 
    private static void pantallaInicio() {
        System.out.println();
        System.out.println(Estilos.LINEA_DOBLE);
        System.out.println(Estilos.centrar(""));
        System.out.println(Estilos.centrar(Estilos.NEGRITA + Estilos.AMARILLO_B + "~ LAS MASCOTAS MARAVILLA ~" + Estilos.RESET));
        System.out.println(Estilos.centrar(""));
        System.out.println(Estilos.centrar(Estilos.TENUE + "Tu refugio de criaturas extraordinarias" + Estilos.RESET));
        System.out.println(Estilos.centrar(""));
        System.out.println(Estilos.LINEA_DOBLE_FIN);
        System.out.println();
    }
 
    private static void menuPrincipal() {
        System.out.println();
        System.out.println(Estilos.LINEA_SIMPLE);
        System.out.println(Estilos.AMARILLO_B + Estilos.NEGRITA + "  MENU PRINCIPAL" + Estilos.RESET);
        System.out.println(Estilos.LINEA_SIMPLE);
        System.out.println(Estilos.CIAN   + "  1." + Estilos.RESET + "  Adoptar una mascota");
        System.out.println(Estilos.CIAN   + "  2." + Estilos.RESET + "  Consultar mis mascotas");
        System.out.println(Estilos.ROJO_B + "  3." + Estilos.RESET + "  Salir");
        System.out.println(Estilos.LINEA_SIMPLE);
        System.out.flush();
    }
 
    private static void mascotita(List<Usuario> usu) {
        int op;
        do {
            System.out.println();
            System.out.println(Estilos.LINEA_SIMPLE);
            System.out.println(Estilos.AMARILLO_B + Estilos.NEGRITA + "  ADOPTAR UNA MASCOTA" + Estilos.RESET);
            System.out.println(Estilos.LINEA_SIMPLE);
            System.out.println(Estilos.VERDE_B  + "  1." + Estilos.RESET + "  \uD83D\uDEE1 Armadillo  " + Estilos.TENUE + "(agresividad: 45)" + Estilos.RESET);
            System.out.println(Estilos.AZUL_B   + "  2." + Estilos.RESET + "  \uD83D\uDC2C Delfin     " + Estilos.TENUE + "(agresividad: 20)" + Estilos.RESET);
            System.out.println(Estilos.ROJO_B   + "  3." + Estilos.RESET + "  \uD83D\uDC3B Oso        " + Estilos.TENUE + "(agresividad: 65)" + Estilos.RESET);
            System.out.println(Estilos.AMARILLO_B+ "  4." + Estilos.RESET + "  \uD83D\uDC26 Pajaro     " + Estilos.TENUE + "(agresividad: 10)" + Estilos.RESET);
            System.out.println(Estilos.MAGENTA_B + "  5." + Estilos.RESET + "  \uD83D\uDC36 Perro      " + Estilos.TENUE + "(agresividad:  5)" + Estilos.RESET);
            System.out.println(Estilos.CIAN      + "  6." + Estilos.RESET + "  Volver al menu principal");
            System.out.println(Estilos.LINEA_SIMPLE);
            System.out.print(Estilos.PREGUNTA + " Opcion: ");
            System.out.flush();
            op = leerEntero(1, 6);
            Estilos.limpiar();
            switch (op) {
                case 1: if (armadillito(usu) == 0) return; break;
                case 2: if (delfincito(usu)  == 0) return; break;
                case 3: if (osito(usu)       == 0) return; break;
                case 4: if (pajaritito(usu)  == 0) return; break;
                case 5: if (perritito(usu)   == 0) return; break;
                case 6: return;
            }
        } while (true);
    }
 
    private static void consultita(List<Usuario> usu) {
        System.out.println();
        System.out.println(Estilos.LINEA_DOBLE);
        System.out.println(Estilos.centrar(Estilos.NEGRITA + Estilos.CIAN_B + "MIS MASCOTAS" + Estilos.RESET));
        System.out.println(Estilos.LINEA_DOBLE_FIN);
        for (Usuario u : usu) {
            System.out.println();
            System.out.println(Estilos.INFO + Estilos.NEGRITA + " Nombre: " + Estilos.RESET + u.getName()
                + Estilos.TENUE + "   |   Edad: " + u.getEdad() + Estilos.RESET);
            System.out.println(Estilos.LINEA_PUNTEADA);
            if (!u.getMascotas().isEmpty()) {
                System.out.println(Estilos.AMARILLO_B + "  Mascotas adoptadas:" + Estilos.RESET);
                for (Mascota m : u.getMascotas()) {
                    System.out.println(Estilos.VERDE_B + "    \u25b8 " + Estilos.RESET + m.getEspecie()
                        + Estilos.TENUE + " (" + m.getNombre() + ")" + Estilos.RESET);
                }
            } else {
                System.out.println(Estilos.TENUE + "  Aun no tienes mascotas adoptadas." + Estilos.RESET);
            }
        }
        System.out.println();
        System.out.println(Estilos.LINEA_SIMPLE);
        System.out.print(Estilos.PREGUNTA + " Presiona Enter para volver al menu...");
        System.out.flush();
        limpiarBuffer();
        sc.nextLine();
        Estilos.limpiar();
    }
 
    // ─── Helper: ficha de mascota ──────────────────────────────────
 
    private static void mostrarFicha(Mascota m) {
        System.out.println();
        System.out.println(Estilos.LINEA_DOBLE);
        System.out.println(Estilos.centrar(Estilos.NEGRITA + Estilos.AMARILLO_B + "FICHA DE MASCOTA" + Estilos.RESET));
        System.out.println(Estilos.LINEA_DOBLE_FIN);
        System.out.println(Estilos.CIAN_B   + "  Nombre          " + Estilos.RESET + ":  " + Estilos.NEGRITA + m.getNombre() + Estilos.RESET);
        System.out.println(Estilos.CIAN_B   + "  Especie         " + Estilos.RESET + ":  " + m.getEspecie());
        System.out.println(Estilos.AMARILLO_B+ "  Agresividad     " + Estilos.RESET + ":  " + m.getAgresividad() + " / 100");
        System.out.println(Estilos.VERDE_B  + "  Dieta           " + Estilos.RESET + ":  " + m.getDieta());
        System.out.println(Estilos.AZUL_B   + "  Anos de vida    " + Estilos.RESET + ":  " + m.getAniosVida());
        System.out.println(Estilos.MAGENTA_B + "  Habilidad       " + Estilos.RESET + ":  " + m.getHabilidad());
        System.out.println(Estilos.LINEA_SIMPLE);
        System.out.flush();
        // Pausa para que el usuario lea la ficha antes de ver el menu de acciones
        pausar();
    }
 
    // ─── Helper: menu de acciones ─────────────────────────────────
 
    private static void menuAcciones(boolean tieneBanio) {
        System.out.println();
        System.out.println(Estilos.AMARILLO_B + Estilos.NEGRITA + "  QUE DESEAS HACER?" + Estilos.RESET);
        System.out.println(Estilos.LINEA_PUNTEADA);
        System.out.println(Estilos.VERDE_B  + "  1." + Estilos.RESET + "  Alimentar");
        System.out.println(Estilos.AZUL_B   + "  2." + Estilos.RESET + "  Jugar");
        if (tieneBanio)
            System.out.println(Estilos.CIAN + "  3." + Estilos.RESET + "  Ba\u00f1ar");
        System.out.println(Estilos.MAGENTA_B + (tieneBanio ? "  4." : "  3.") + Estilos.RESET + "  Mostrar habilidad");
        System.out.println(Estilos.ROJO_B   + (tieneBanio ? "  5." : "  4.") + Estilos.RESET + "  Volver");
        System.out.println(Estilos.LINEA_PUNTEADA);
        System.out.print(Estilos.PREGUNTA + " Opcion: ");
        System.out.flush();
    }
 
    // Ejecuta una accion y pausa antes de volver al menu de acciones
    private static void ejecutarAccion(Runnable accion) {
        accion.run();
        pausar();
    }
 
    // ─── Mascotas ─────────────────────────────────────────────────
 
    private static int armadillito(List<Usuario> usu) {
        Armadillo arma = new Armadillo(null, "Armadillo", 45, "Insectos", 15, "Coraza de metal");
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Has adoptado un Armadillo!" + Estilos.RESET);
        System.out.print(Estilos.PREGUNTA + " Que nombre le pondras? ");
        System.out.flush();
        arma.setNombre(sc.nextLine().trim());
        usu.get(0).agregarMascota(arma);
        Estilos.limpiar();
        mostrarFicha(arma);
        int accion;
        do {
            menuAcciones(true);
            accion = leerEntero(1, 5);
            Estilos.limpiar();
            switch (accion) {
                case 1: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Los armadillos comen insectos."); arma.Alimentar(); }); break;
                case 2: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Corre! Tu armadillo rodara por el suelo."); arma.Jugar(); }); break;
                case 3: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Hora del bano, prepara el balde."); arma.Bañar(); }); break;
                case 4: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Retrocede... aqui viene la demostracion!"); arma.activarHabilidad(); }); break;
                case 5: return 0;
            }
        } while (true);
    }
 
    private static int delfincito(List<Usuario> usu) {
        Delfin del = new Delfin(null, "Delfin", 20, "Sardinas", 30, "Lanza chorro de agua");
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Has adoptado un tierno Delfin!" + Estilos.RESET);
        System.out.print(Estilos.PREGUNTA + " Que nombre le pondras? ");
        System.out.flush();
        del.setNombre(sc.nextLine().trim());
        usu.get(0).agregarMascota(del);
        Estilos.limpiar();
        mostrarFicha(del);
        int accion;
        do {
            menuAcciones(false);
            accion = leerEntero(1, 4);
            Estilos.limpiar();
            switch (accion) {
                case 1: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Los delfines comen sardinas."); del.Alimentar(); }); break;
                case 2: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " A los delfines les encanta jugar con pelotas!"); del.Jugar(); }); break;
                case 3: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Retrocede... aqui viene la demostracion!"); del.activarHabilidad(); }); break;
                case 4: return 0;
            }
        } while (true);
    }
 
    private static int osito(List<Usuario> usu) {
        Oso osito = new Oso(null, "Oso", 65, "Carne, pescado y fruta", 30, "Lanzar rafagas de hielo");
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Has adoptado un feroz Oso!" + Estilos.RESET);
        System.out.print(Estilos.PREGUNTA + " Que nombre le pondras? ");
        System.out.flush();
        osito.setNombre(sc.nextLine().trim());
        usu.get(0).agregarMascota(osito);
        Estilos.limpiar();
        mostrarFicha(osito);
        int accion;
        do {
            menuAcciones(true);
            accion = leerEntero(1, 5);
            Estilos.limpiar();
            switch (accion) {
                case 1: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Los osos comen carne, pescado y fruta."); osito.Alimentar(); }); break;
                case 2: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Sube en su lomo y den un paseo por el bosque!"); osito.Jugar(); }); break;
                case 3: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Hora del bano, llevalo al rio."); osito.Bañar(); }); break;
                case 4: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Retrocede... aqui viene la demostracion!"); osito.activarHabilidad(); }); break;
                case 5: return 0;
            }
        } while (true);
    }
 
    private static int pajaritito(List<Usuario> usu) {
        Pajaro pajarito = new Pajaro(null, "Pajaro", 10, "Semillas de girasol", 20, "Prender en llamas");
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Has adoptado un lindo Pajarito!" + Estilos.RESET);
        System.out.print(Estilos.PREGUNTA + " Que nombre le pondras? ");
        System.out.flush();
        pajarito.setNombre(sc.nextLine().trim());
        usu.get(0).agregarMascota(pajarito);
        Estilos.limpiar();
        mostrarFicha(pajarito);
        int accion;
        do {
            menuAcciones(false);
            accion = leerEntero(1, 4);
            Estilos.limpiar();
            switch (accion) {
                case 1: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Los pajaros comen semillas de girasol."); pajarito.Alimentar(); }); break;
                case 2: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Corre! Tu pajaro emprendera el vuelo!"); pajarito.Jugar(); }); break;
                case 3: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Retrocede... aqui viene la demostracion!"); pajarito.activarHabilidad(); }); break;
                case 4: return 0;
            }
        } while (true);
    }
 
    private static int perritito(List<Usuario> usu) {
        Perro perrito = new Perro(null, "Perro", 5, "Croquetas", 18, "Crecer 5 metros");
        System.out.println(Estilos.OK + Estilos.VERDE_B + " Has adoptado un tierno Perro!" + Estilos.RESET);
        System.out.print(Estilos.PREGUNTA + " Que nombre le pondras? ");
        System.out.flush();
        perrito.setNombre(sc.nextLine().trim());
        usu.get(0).agregarMascota(perrito);
        Estilos.limpiar();
        mostrarFicha(perrito);
        int accion;
        do {
            menuAcciones(true);
            accion = leerEntero(1, 5);
            Estilos.limpiar();
            switch (accion) {
                case 1: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Los perros comen croquetas."); perrito.Alimentar(); }); break;
                case 2: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Agarra una pelota y lanzala!"); perrito.Jugar(); }); break;
                case 3: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Prepara la manguera y el jabon!"); perrito.Bañar(); }); break;
                case 4: ejecutarAccion(() -> { System.out.println(Estilos.INFO + " Retrocede... aqui viene la demostracion!"); perrito.activarHabilidad(); }); break;
                case 5: return 0;
            }
        } while (true);
    }
}