import java.util.Scanner;
public class pruebadowhile {
    static Scanner sc = new Scanner(System.in);
    
    
    static void pruebaDowhile(){
    //Definir variabless
    int i, sumaNum=0, finals;
    //Datos de entrada
    System.out.println("Introdusca el numero Inicial de los numeros Asendentes: ");
    i=sc.nextInt();
    System.out.println("Introdusca el numero final de los numeros Asendentes: ");
    finals=sc.nextInt();
    //Proceso
    do{
        
        if(i%2==0){
            sumaNum=sumaNum+i;
            System.out.println("Prueba"+i+"="+sumaNum);
          }
          
          
        i++;
        
        
    }while(i<=finals);
    
    //Datos de Salida
    System.out.println("La suma de los numeros pares Asendentes son: "+sumaNum);
}


static void pruebaDowhiledos(){
    //Definir variabless
    int i, sumaNum=0, finals;
    //Datos de entrada
    System.out.println("Introdusca el numero Inicial de los numeros Asendentes: ");
    i=sc.nextInt();
    System.out.println("Introdusca el numero final de los numeros Asendentes: ");
    finals=sc.nextInt();
    //Proceso
    do{
        
            sumaNum=sumaNum+i;
            System.out.println("Prueba"+i+"="+sumaNum);
          
          
          
        i+=2;
        
        
    }while(i<=finals);
    
    //Datos de Salida
    System.out.println("La suma de los numeros pares Asendentes son: "+sumaNum);
}


public static void main(String[] args) {
    pruebaDowhiledos();
  }
}