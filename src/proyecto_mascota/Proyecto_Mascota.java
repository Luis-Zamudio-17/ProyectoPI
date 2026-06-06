package proyecto_mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proyecto_Mascota {

    public static void main(String[] args) {
        
        List<Usuario> usu = new ArrayList<>();
        
        System.out.println("LAS MASCOTAS MARAVILLA");
        
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
          
        System.out.println("Crea tu usuario");
        System.out.println("Introduce tu nombre");
        String nom=sc.nextLine();
        System.out.println("Introduce tu edad");
        int ed=sc2.nextInt();
        
        usu.add(new Usuario(nom,ed, null, null ));
        
        int opc=0;
        
        do{
        Scanner sca = new Scanner(System.in);
        System.out.println("Bienvenido a..." +"\n"+"LAS MASCOTAS MARAVILLA");
        System.out.println("Que te guatria hacer");
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
            System.out.println("Que mascota te gustaria adoptar");
            System.out.println("1. Armadillo");
            System.out.println("2. Delfin");
            System.out.println("3. Oso");
            System.out.println("4. Pajaro");
            System.out.println("5. Perro");

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
                
                System.out.println("Genial!!, has adoptado al armadillo");
                System.out.println("Que nombre te gustaria darle?");
                String nombree = ar.nextLine();
                arma.setNombre(nombree);
                
                System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
                System.out.println("Nombre: "+arma.getNombre()+"\n"+"Especie: "+ arma.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ arma.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + arma.getDieta()+"\n"
                        +"Años de vida: "+arma.getAniosVida()+"\n"+"Habilidad especial: "+arma.getHabilidad());
            }
            if (op==2) {
                Scanner de = new Scanner(System.in);
                Delfin del = new Delfin(null,"Delfin",20,"Sardinas",30,"Lanza chorro de agua");
                
                System.out.println("Genial!!, has adoptado un delfin");
                System.out.println("Que nombre te gustaria darle?");
                String nombree = de.nextLine();
                del.setNombre(nombree);
                
                System.out.println("Excelente, aqui estan los datos de tu nuevo amigo:");
                System.out.println("Nombre: "+del.getNombre()+"\n"+"Especie: "+ del.getEspecie() + "\n"
                        +"Nivel de agresividad: "+ del.getAgresividad()+ "\n"+ "Especificaciones de su dieta: " + del.getDieta()+"\n"
                        +"Años de vida: "+del.getAniosVida()+"\n"+"Habilidad especial: "+del.getHabilidad());
                
            }
               
        }
        if (opc==2) {
            System.out.println("------Mis Mascotas-----");
                for (int i = 0; i < usu.size(); i++) {
                    System.out.println(usu.get(i).getName());
                }
        }
           
        }while(opc !=3);
            
    }
    

    
}
