import java.util.Scanner;
public class pruebawhile {
    static Scanner sc = new Scanner(System.in);

    static void pruebaWhile(){
        //Definir variabless
        int i =10;
        //Proceso
        while(i>=1){
            System.out.println(i);
            i--;
        }
        
    }

    static void pruebaWhileintroducirInicioAsendente(){
      //Definir variabless
      int i;
      //Datos de entrada 
      System.out.println("Ingrese el numero que empezara el bucle asendente hasta el 100:");
      i=sc.nextInt();
      //Proceso
      while(i<=100){
      System.out.println("los numeros:"+i);
      i++;
      }
    }



    static void pruebaWhileintroducirInicioDesendente(){
      //Definir variabless
      int i;
      //Datos de entrada 
      System.out.println("Ingrese el numero que empezara el bucle desendente hasta el -100:");
      i=sc.nextInt();
      //Proceso
      while(i>=-100){
      System.out.println("los numeros:"+i);
      i--;
      }
      if (i<=-101){
       System.out.println("Error de numero");
      }
    
    }


    static void pruebaWhileintroducirFinalAsendente(){
      //Definir variabless
      int i=1, result;
      //Datos de entrada 
      System.out.println("Ingrese el numero que finalizara el bucle asendente desde 1:");
      result=sc.nextInt();
      //Proceso
      while(i<=result){
      System.out.println("los numeros:"+i);
      i++;
      }
      if (result<=-1){System.out.println("Error de numero");
      }
    }


    static void pruebaWhileintroducirFinalDesendente(){
      //Definir variabless
      int i=-1, result;
      //Datos de entrada 
      System.out.println("Ingrese el numero que finalizara el bucle desendente desde -1:");
      result=sc.nextInt();
      //Proceso
      while(i>=result){
      System.out.println("los numeros:"+i);
      i--;
      }
    }

    static void pruebaWhileintroducirIniciFinalAsendente(){
      //Definir variables
      int i, resu;
      //Datos de entrada
      System.out.println("Ingrese el numero de Inicio Asendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero de Final:");
      resu=sc.nextInt();
      //Proceso
      while(i<=resu){
        System.out.println("Los numeros:"+i);
        i++;
      }
      //Datos de salida

    
    }

    static void pruebaWhileintroducirIniciFinalDesendente(){
      //Definir variables
      int i, resu;
      //Datos de entrada
      System.out.println("Ingrese el numero de Inicio Desendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero de Final:");
      resu=sc.nextInt();
      //Proceso
      while(i>=resu){
        System.out.println("Los numeros:"+i);
        i--;
      }
      //Datos de salida

    
    }

    static void pruebaWhileintroducirIniciFinalAsendentemultiplic(){
      //Definir variables
      int i, fi, num, multipli;
      //Datos de entrada
      System.out.println("Ingrese el numero que empezara la multiplicacion Ascendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero con el que se multiplicaran los numeros Asendentes:");
      num=sc.nextInt();

      System.out.println("Ingrese el numero de Final De los numeros ascendentes:");
      fi=sc.nextInt();
      //Proceso
      while(i<=fi){
        multipli=num*i;
        System.out.println(num+"X"+i+"="+multipli);
        i++;
      }
      //Datos de salida
      
    
    }


    static void pruebaWhileintroducirIniciFinalDesendentemultiplicnormal(){
      //Definir variables
      int i, fi, multipli;
      //Datos de entrada
      System.out.println("Ingrese el numero que empezara la multiplicacion Desendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero de Final De los numeros Desendentes:");
      fi=sc.nextInt();
      //Proceso
      while(i>=fi){
        multipli=i*i;
        System.out.println(i+"X"+i+"="+multipli);
        i--;
      }
      //Datos de salida
      
    
    }


    static void pruebaWhileintroducirIniciFinalAsendentemultiplicsuma(){
      //Definir variables
      int i, fi, num, multipli, resul=0;
      //Datos de entrada
      System.out.println("Ingrese el numero que empezara la multiplicacion Ascendente:");
      i=sc.nextInt();

      System.out.println("Ingrese el numero con el que se multiplicaran los numeros Asendentes:");
      num=sc.nextInt();

      System.out.println("Ingrese el numero de Final De los numeros ascendentes:");
      fi=sc.nextInt();
      //Proceso
      while(i<=fi){
        multipli=num*i;
        resul=multipli+resul;//resul=resul+multipli;
        System.out.println(num+"X"+i+
        "="+multipli);
        i++;
      }
      //Datos de salida
    System.out.println("La suma de los productos de los numeros ascendentes son :"+resul);
    
    }


    static void suma20mumerosParesWhile(){
        //Declarar variables e inicializacion de valores
        int numInit=1, sumaNumPar=0;
        //Proceso
          while(numInit <= 20) {
            if(numInit%2==0){
              sumaNumPar=sumaNumPar+numInit;
            }
            numInit++;//numInit=numInit+1;
          }
        //Datos de Salida
          System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
      }
     

      static void suma20mumerosParesWhilediferente(){
        //Declarar variables e inicializacion de valores
        int i=0, sumNumPar=0;
        //Proceso
          while(i<= 20) {
              sumNumPar = sumNumPar+i;
              System.out.println("Esta es la prueba :"+sumNumPar);
              i+=2;
            }
            
          
        //Datos de Salida
          System.out.println("La suma de numeros pares entre 1 y 20 esxd:"+sumNumPar);
      }


      static void suma20mumerosParesWhileIntroducirvalores(){
        //Declarar variables e inicializacion de valores
        int numInit, sumaNumPar=0 ,numfin;
        System.out.println("Ingrese el numero de inicio: ");
        numInit=sc.nextInt();
        System.out.println("Ingrese el numero final: ");
        numfin=sc.nextInt();

        //Proceso
          while(numInit <= numfin) {
            if(numInit%2==0){
              sumaNumPar=sumaNumPar+numInit;
              System.out.println("La prueba: "+sumaNumPar);
            }
            numInit++;//numInit=numInit+1;
          }
        //Datos de Salida
          System.out.println("La suma de numeros pares es:"+sumaNumPar);
      }
     

      static void suma20mumerosParesWhilediferenteIntroducirvalores(){
        //Declarar variables e inicializacion de valores
        int i, sumNumPar=0, numFinal;
        System.out.println("Ingrese numero inicial : ");
        i=sc.nextInt();
        System.out.println("Ingrese el numero final: ");
        numFinal=sc.nextInt();
        //Proceso change  pamela's pasword to =perrito
          while(i<= numFinal) {
              sumNumPar = sumNumPar+i;
              System.out.println("Esta es la prueba :"+sumNumPar);
              i+=2;
            }
            
          
        //Datos de Salida
          System.out.println("La suma de los numeros en un intervalo de 2 esxd:"+sumNumPar);
      }
    public static void main(String[] args) {
      suma20mumerosParesWhilediferenteIntroducirvalores();
    }
}
