package proyecto_mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Proyecto_Mascota {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PINK = "\u001B[35m";
    
    
    public static void main(String[] args) {
        
        List<Usuario> usu = new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
          
        System.out.println("Introduce tu nombre");
        String nom=sc.nextLine();
        System.out.println("Introduce tu edad");
        int ed=sc2.nextInt();
        
        usu.add(new Usuario(nom,ed));
        
        int opc=0;
        Scanner sca = new Scanner(System.in);
        
        do{
        
            System.out.println("                 Bienvenido a..." +"\n"+ANSI_PINK
                    +"-------------LAS MASCOTAS MARAVILLA--------------"+ANSI_RESET);
            System.out.println("");
            System.out.println("Que te gustaria hacer");
            System.out.println("1. Adoptar una mascota");
            System.out.println("2. Consultar mis mascotas");
            System.out.println("3. Salir");

            if(sca.hasNextInt()){
                opc=sca.nextInt();
                switch(opc){
                    case 1:
                        mascotita(usu);
                        break;
                    case 2:
                        consultita(usu);
                        break;
                }
            }
        }while(opc !=3);
    }    

    private static void mascotita(List<Usuario> usu) {
                int op;
                Scanner scan= new Scanner(System.in);
                do{
                    System.out.println("");
                    System.out.println(ANSI_YELLOW +"Que mascota te gustaria adoptar"+ANSI_RESET);
                    System.out.println("1. Armadillo");
                    System.out.println("2. Delfin");
                    System.out.println("3. Oso");
                    System.out.println("4. Pajaro");
                    System.out.println("5. Perro");
                    System.out.println("6. Volver a menu principal");

                    if(scan.hasNextInt()){
                        op=scan.nextInt();
                        switch(op){
                            case 1:
                                int resultado= armadillito(usu);
                                if (resultado == 0) return;
                                break;
                            case 2:
                                int resultadito = delfincito(usu);
                                if (resultadito == 0) return;
                                break;
                            case 3:
                                int result = osito(usu);
                                if (result == 0) return;
                                break;
                            case 4:
                                int regresar = pajaritito(usu);
                                if (regresar == 0) return;
                                break;
                            case 5:
                                int regre = perritito(usu);
                                if (regre == 0) return;
                                break;
                            case 6:
                                return;
                            default:
                                System.out.println("Selecciona una opcion valida");
                        }
                    }else{
                        System.out.println("Selecciona una opcion valida");
                        scan.nextLine();
                    }
                }while(true);
    }

    private static void consultita(List<Usuario> usu) {
        System.out.println(ANSI_YELLOW +"<------------------Mis Mascotas------------->"+ANSI_RESET);
                    for (int i = 0; i < usu.size(); i++) {
                        System.out.println("Nombre: "+usu.get(i).getName()+"\n"+"Edad: "+usu.get(i).getEdad());
                        if (!usu.get(i).getMascotas().isEmpty()) {
                            System.out.println("Mascotas:");
                            for (Mascota m : usu.get(i).getMascotas()) {
                                System.out.println("- " + m.getEspecie());
                            }
                        } else {
                            System.out.println("No tienes mascotas adoptadas aún.");
                        }
                        System.out.println("");
                    }
    }
    
    private static int armadillito(List<Usuario> usu) {
        
        Scanner ar = new Scanner(System.in);
        Armadillo arma= new Armadillo(null,"Armadillo",45,"Insectos",15,"Coraza de metal");
                
        System.out.println("Genial!!, has adoptado un Armadillo");
        System.out.println("Que nombre te gustaria darle?");
        String nombree = ar.nextLine();
        arma.setNombre(nombree);
        usu.get(0).agregarMascota(arma);
                
                
        System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        System.out.println("");
        System.out.println("Nombre: "+arma.getNombre()+"\n"+"Especie: "+ arma.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ arma.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + arma.getDieta()+"\n"
                        +"Años de vida: "+arma.getAniosVida()+"\n"+"Habilidad especial: "+arma.getHabilidad());
        System.out.println("");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        
        int accion=0;
        Scanner acc = new Scanner(System.in);
        do{
            System.out.println(ANSI_YELLOW+"¿Que te gustaria hacer con tu nueva mascota?"+ANSI_RESET);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Bañar");
            System.out.println("4. Mostrar habilidad");
            System.out.println("5. Salir");
            System.out.println("");
            
            if (acc.hasNextInt()) {
            accion=acc.nextInt();
            }
            else{
                System.out.println("No es un número entero");
                acc.next();
            }
            if (accion == 1) {
                System.out.println("Muy bien!");
                System.out.println("Has elegido alimentar a tu mascota"+"\n"
                        +"Recuerda que los armadillo comen insectos");
                arma.Alimentar();
                
            }
            if (accion == 2) {
                System.out.println("Excelente");
                System.out.println("Corre y tu mascota rodara por el suelo");
                arma.Jugar();
            }
            if (accion ==3) {
                System.out.println("Por lo visto tu mascota esta bastante sucia, es hora del baño");
                arma.Bañar();
            }
            if (accion == 4) {
                System.out.println("Valla, asi que quieres que tu mascota muestre su habilidad...");
                System.out.println("Esta bien, retrocede un poco, mientras tu mascota hace una demostración");
                arma.activarHabilidad();
            }
            switch(accion){
                case 5:
                    return 0;
            }
            
        }while(true);
    }

    private static int delfincito(List<Usuario> usu) {
        Scanner de = new Scanner(System.in);
        Delfin del = new Delfin(null,"Delfin",20,"Sardinas",30,"Lanza chorro de agua");
                
        System.out.println("Genial!!, has adoptado un tierno Delfin");
        System.out.println("Que nombre te gustaria darle?");
        String nombree = de.nextLine();
        del.setNombre(nombree);
        usu.get(0).agregarMascota(del);
                
        System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        System.out.println("");
        System.out.println("Nombre: "+del.getNombre()+"\n"+"Especie: "+ del.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ del.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + del.getDieta()+"\n"
                        +"Años de vida: "+del.getAniosVida()+"\n"+"Habilidad especial: "+del.getHabilidad());
        System.out.println("");
        
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        
        int accion=0;
        Scanner acc = new Scanner(System.in);
        do{
            System.out.println(ANSI_YELLOW+"¿Que te gustaria hacer con tu nueva mascota?"+ANSI_RESET);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Mostrar habilidad");
            System.out.println("4. Salir");
            System.out.println("");
            
            if (acc.hasNextInt()) {
            accion=acc.nextInt();
            }
            else{
                System.out.println("No es un número entero");
                acc.next();
            }
            if (accion == 1) {
                System.out.println("Muy bien!");
                System.out.println("Has elegido alimentar a tu mascota"+"\n"
                        +"Recuerda que los delfines comen sardinas");
                del.Alimentar();
                
            }
            if (accion == 2) {
                System.out.println("Excelente");
                System.out.println("A los delfines les gusta jugar con pelotas");
                del.Jugar();
            }
            
            if (accion == 3) {
                System.out.println("Valla, asi que quieres que tu mascota muestre su habilidad...");
                System.out.println("Esta bien, retrocede un poco, mientras tu mascota hace una demostración");
                del.activarHabilidad();
            }
            switch(accion){
                case 4:
                    return 0;
            }
            
        }while(true);
                 
    }

    private static int osito(List<Usuario> usu) {
        Scanner os = new Scanner(System.in);
        Oso osito = new Oso(null,"Oso",65,"Carne, pescado y fruta",30,"Lanzar rafagas de hielo");
                
        System.out.println("Genial!!, has adoptado un feroz Oso");
        System.out.println("Que nombre te gustaria darle?");
        String nombree = os.nextLine();
        osito.setNombre(nombree);
        usu.get(0).agregarMascota(osito);
                
        System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        System.out.println("");
        System.out.println("Nombre: "+osito.getNombre()+"\n"+"Especie: "+ osito.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ osito.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + osito.getDieta()+"\n"
                        +"Años de vida: "+osito.getAniosVida()+"\n"+"Habilidad especial: "+osito.getHabilidad());
        System.out.println("");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        
        int accion=0;
        Scanner acc = new Scanner(System.in);
        do{
            System.out.println(ANSI_YELLOW+"¿Que te gustaria hacer con tu nueva mascota?"+ANSI_RESET);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Bañar");
            System.out.println("4. Mostrar habilidad");
            System.out.println("5. Salir");
            System.out.println("");
            
            if (acc.hasNextInt()) {
            accion=acc.nextInt();
            }
            else{
                System.out.println("No es un número entero");
                acc.next();
            }
            if (accion == 1) {
                System.out.println("Muy bien!");
                System.out.println("Has elegido alimentar a tu mascota"+"\n"
                        +"Recuerda que los osos comen carne, pescado y fruta");
                osito.Alimentar();
                
            }
            if (accion == 2) {
                System.out.println("Excelente");
                System.out.println("Sube en el lomo de tu mascota y den un paseo");
                osito.Jugar();
            }
            if (accion ==3) {
                System.out.println("Por lo visto tu mascota esta bastante sucia, es hora del baño");
                osito.Bañar();
            }
            if (accion == 4) {
                System.out.println("Valla, asi que quieres que tu mascota muestre su habilidad...");
                System.out.println("Esta bien, retrocede un poco, mientras tu mascota hace una demostración");
                osito.activarHabilidad();
            }
            switch(accion){
                case 5:
                    return 0;
            }
            
        }while(true);
        
    }

    private static int pajaritito(List<Usuario> usu) {
        Scanner pa = new Scanner(System.in);
        Pajaro pajarito = new Pajaro(null,"Pajaro",10,"Semillas de girasol",20,"Prender en llamas");
                
        System.out.println("Genial!!, has adoptado un lindo Pajarito");
        System.out.println("Que nombre te gustaria darle?");
        String nombree = pa.nextLine();
        pajarito.setNombre(nombree);
        usu.get(0).agregarMascota(pajarito);
                
        System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        System.out.println("");
        System.out.println("Nombre: "+pajarito.getNombre()+"\n"+"Especie: "+ pajarito.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ pajarito.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + pajarito.getDieta()+"\n"
                        +"Años de vida: "+pajarito.getAniosVida()+"\n"+"Habilidad especial: "+pajarito.getHabilidad());
        System.out.println("");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
                
        int accion=0;
        Scanner acc = new Scanner(System.in);
        do{
            System.out.println(ANSI_YELLOW+"¿Que te gustaria hacer con tu nueva mascota?"+ANSI_RESET);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Mostrar habilidad");
            System.out.println("4. Salir");
            System.out.println("");
            
            if (acc.hasNextInt()) {
            accion=acc.nextInt();
            }
            else{
                System.out.println("No es un número entero");
                acc.next();
            }
            if (accion == 1) {
                System.out.println("Muy bien!");
                System.out.println("Has elegido alimentar a tu mascota"+"\n"
                        +"Recuerda que los pajaros comen semillas de girasol");
                pajarito.Alimentar();
                
            }
            if (accion == 2) {
                System.out.println("Excelente");
                System.out.println("Corre y tu mascota emprendera el vuelo");
                pajarito.Jugar();
            }
            if (accion == 3) {
                System.out.println("Valla, asi que quieres que tu mascota muestre su habilidad...");
                System.out.println("Esta bien, retrocede un poco, mientras tu mascota hace una demostración");
                pajarito.activarHabilidad();
            }
            switch(accion){
                case 4:
                    return 0;
            }
            
        }while(true);
                
    }

    private static int perritito(List<Usuario> usu) {
        Scanner pe = new Scanner(System.in);
        Perro perrito = new Perro(null,"Perro",5,"Croquetas",18,"Crecer 5 metros");
                
        System.out.println("Genial!!, has adoptado un tierno Perro");
        System.out.println("Que nombre te gustaria darle?");
        String nombree = pe.nextLine();
        perrito.setNombre(nombree);
        usu.get(0).agregarMascota(perrito);
                
        System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        System.out.println("");
        System.out.println("Nombre: "+perrito.getNombre()+"\n"+"Especie: "+ perrito.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ perrito.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + perrito.getDieta()+"\n"
                        +"Años de vida: "+perrito.getAniosVida()+"\n"+"Habilidad especial: "+perrito.getHabilidad());
        System.out.println("");
        System.out.println(ANSI_CYAN+"-----------------------------------------"+ANSI_RESET);
        
        int accion=0;
        Scanner acc = new Scanner(System.in);
        do{
            System.out.println(ANSI_YELLOW+"¿Que te gustaria hacer con tu nueva mascota?"+ANSI_RESET);
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Bañar");
            System.out.println("4. Mostrar habilidad");
            System.out.println("5. Salir");
            System.out.println("");
            
            if (acc.hasNextInt()) {
            accion=acc.nextInt();
            }
            else{
                System.out.println("No es un número entero");
                acc.next();
            }
            if (accion == 1) {
                System.out.println("Muy bien!");
                System.out.println("Has elegido alimentar a tu mascota"+"\n"
                        +"Recuerda que los perros comen croquetas");
                perrito.Alimentar();
                
            }
            if (accion == 2) {
                System.out.println("Excelente");
                System.out.println("Agarra una pelota y lanzala para que tu mascota vaya por ella");
                perrito.Jugar();
            }
            if (accion ==3) {
                System.out.println("Por lo visto tu mascota esta bastante sucia, es hora del baño");
                perrito.Bañar();
            }
            if (accion == 4) {
                System.out.println("Valla, asi que quieres que tu mascota muestre su habilidad...");
                System.out.println("Esta bien, retrocede un poco, mientras tu mascota hace una demostración");
                perrito.activarHabilidad();
            }
            switch(accion){
                case 5:
                    return 0;
            }
            
        }while(true);
    }
    
}

