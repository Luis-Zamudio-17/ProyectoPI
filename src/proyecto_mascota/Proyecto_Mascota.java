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
