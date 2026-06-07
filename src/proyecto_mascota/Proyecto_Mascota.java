package proyecto_mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proyecto_Mascota {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        
        List<Usuario> usu = new ArrayList<>();
        
        System.out.println(ANSI_PURPLE+"---------------LAS MASCOTAS MARAVILLA---------"+ANSI_RESET);
        System.out.println("");
        
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
          
        System.out.println("Crea tu usuario");
        System.out.println("Introduce tu nombre");
        String nom=sc.nextLine();
        System.out.println("Introduce tu edad");
        int ed=sc2.nextInt();
        
        usu.add(new Usuario(nom,ed, null ));
        
        int opc=0;
        
        do{
        Scanner sca = new Scanner(System.in);
        System.out.println(ANSI_CYAN+"                 Bienvenido a..." +"\n"+ANSI_CYAN+"-------------LAS MASCOTAS MARAVILLA--------------"+ANSI_RESET);
            System.out.println("");
        System.out.println("Que te gustaria hacer");
        System.out.println("1. Adoptar una mascota");
        System.out.println("2. Consultar mis mascotas");
        System.out.println("3. Salir");
        
        
        if(sca.hasNextInt()){
                opc=sca.nextInt();
        }else{
                System.out.println("Ingresa un numero");
                sca.next();
        }
        if (opc==1) {
            System.out.println(ANSI_YELLOW +"Que mascota te gustaria adoptar"+ANSI_RESET);
            System.out.println("1. Armadillo");
            System.out.println("2. Delfin");
            System.out.println("3. Oso");
            System.out.println("4. Pajaro");
            System.out.println("5. Perro");
            System.out.println("");

            int op=0;
            Scanner scan= new Scanner(System.in);
            if(scan.hasNextInt()){
                    op=scan.nextInt();
            }else{
                System.out.println("No es un numero entero");
                scan.next();
            }
            if (op==1) {
                Scanner ar = new Scanner(System.in);
                Armadillo arma= new Armadillo(null,"Armadillo",45,"Insectos",15,"Coraza de metal");
                
                System.out.println("Genial!!, has adoptado al Armadillo");
                System.out.println("Que nombre te gustaria darle?");
                String nombree = ar.nextLine();
                arma.setNombre(nombree);
                usu.get(0).agregarMascota(arma);
                
                
                System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
                System.out.println("");
                System.out.println("Nombre: "+arma.getNombre()+"\n"+"Especie: "+ arma.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ arma.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + arma.getDieta()+"\n"
                        +"Años de vida: "+arma.getAniosVida()+"\n"+"Habilidad especial: "+arma.getHabilidad());
                System.out.println("");
            }
            if (op==2) {
                Scanner de = new Scanner(System.in);
                Delfin del = new Delfin(null,"Delfin",20,"Sardinas",30,"Lanza chorro de agua");
                
                System.out.println("Genial!!, has adoptado al Delfin");
                System.out.println("Que nombre te gustaria darle?");
                String nombree = de.nextLine();
                del.setNombre(nombree);
                usu.get(0).agregarMascota(del);
                
                System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
                System.out.println("Nombre: "+del.getNombre()+"\n"+"Especie: "+ del.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ del.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + del.getDieta()+"\n"
                        +"Años de vida: "+del.getAniosVida()+"\n"+"Habilidad especial: "+del.getHabilidad());
                System.out.println("");
            }
            if (op==3) {
                Scanner os = new Scanner(System.in);
                Oso osito = new Oso(null,"Oso",65,"Carne, pescado y fruta",30,"Lanzar rafagas de hielo");
                
                System.out.println("Genial!!, has adoptado al Oso");
                System.out.println("Que nombre te gustaria darle?");
                String nombree = os.nextLine();
                osito.setNombre(nombree);
                usu.get(0).agregarMascota(osito);
                
                System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
                System.out.println("");
                System.out.println("Nombre: "+osito.getNombre()+"\n"+"Especie: "+ osito.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ osito.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + osito.getDieta()+"\n"
                        +"Años de vida: "+osito.getAniosVida()+"\n"+"Habilidad especial: "+osito.getHabilidad());
                System.out.println("");
                
            }
               
        }
        if (opc==2) {
            System.out.println(ANSI_CYAN +"------------------Mis Mascotas-------------"+ANSI_RESET);
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
           
        }while(opc !=3);
            
    }
    

    
}
