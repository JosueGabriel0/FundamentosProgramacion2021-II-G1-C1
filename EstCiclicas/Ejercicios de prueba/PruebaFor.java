import java.util.Scanner;
public class pruebafor {
    static Scanner sc = new Scanner(System.in);
 
    static void pruebaFor(){
        //Definir variables
        int nume, numfinal;
        //Datos de entrada
        System.out.println("Introdusca el numero inicial de la escala Asendente: ");
        nume = sc.nextInt();
        System.out.println("Introdusca el numero final de la escala Asendente: ");
        numfinal = sc.nextInt();
       //Proceso
       for(int i=nume; i<=numfinal; i++){
         System.out.println(i);
         
       }

    }

    public static void main(String[] args) {
        pruebaFor();
      }
}