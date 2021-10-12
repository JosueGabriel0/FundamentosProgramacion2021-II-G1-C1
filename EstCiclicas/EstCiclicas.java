import java.math.BigInteger;
import java.util.Scanner;

class EstCiclicas{
  static Scanner sc = new Scanner(System.in);

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

static void suma20numerosParesDowhile(){
  //Declaracion de variables e inicializacion de variables
  int sumaNumPar=0, numInit=1;
  //Proceso
  do{
    if(numInit%2==0){
      sumaNumPar=sumaNumPar+numInit;
    }
    numInit++;
  }while(numInit<=20);
  //Datos de salida
  System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}

static void suma20mumerosParesFor(){
  //Declarar variables e inicializacion de valores
  int sumaNumPar=0;
  //Proceso
    for(int numInit=1; numInit <= 20; numInit++) {

      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
      System.out.println("numInit:"+numInit+ " sumaNumPar:"+sumaNumPar);      
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}

static void asignaturasCursadas(){
  //Definir variables
   int asigCod, calf, cred, cantAsignCur=0,  cont=0;
   double promPond=0, sumCred=0, temp=0;
  //Datos de entrada y Proceso
    System.out.println("Ingrese el codigo de la asignatura:");
    asigCod=sc.nextInt();
    while(asigCod!=9999){
      System.out.println("Ingrese la claificacion del curso "+asigCod+":");
      calf=sc.nextInt();
      System.out.println("Ingrese el numero de creditos del curso "+asigCod+":");
      cred=sc.nextInt();
      temp=temp+(calf*cred);
      sumCred=sumCred+cred;
      cont++;
      System.out.println("Ingrese el codigo de la siguiende asignatura:");
      asigCod=sc.nextInt();
      if(asigCod==9999){
        if(sumCred>=25 && sumCred<=50){
          promPond=Math.round((temp/sumCred)*100.0) / 100.0;
        }else{
          System.out.println("La cantidad de creditos no estan entre los rangos permitidos..intente nuevamente");
          System.out.println("Ingrese el codigo de la asignatura:");
          asigCod=sc.nextInt();
          temp=0;
          sumCred=0;
          cont=0;
        }
      }
    }
  //Datos de salida
   System.out.println("Cantidad de Asignaturas cursadas es:"+cont);
   System.out.println("Suma de creditos cursados:"+sumCred);
   System.out.println("Promedio Ponderado:"+promPond);
}


static long factorial(int n){
    //Declarar variables
    long resultF=1;
    //Proceso
    if(n>1){
       for(int i=1; i<=n;i++){
         resultF=resultF*i;
       }
    }
    //Datos de salida
    return resultF;
  }

  static BigInteger factorialBig(int N){
    //Declarar variables
    BigInteger resultF=new BigInteger("1");
    //Proceso
    if(N>1){
       for(int i=1; i<=N;i++){
         resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
       }
    }
    //Datos de salida
    return resultF;
  }

  static void ejercicio2(){
    //Definir variables
    int sumanumpar=0, a=0, b=0;
    //Datos de Entrada
    System.out.println("Ingrese el valor de A:");
    a=sc.nextInt();
    System.out.println("Ingrese el valor de A:");
    b=sc.nextInt();
   
    //Proceso
    for(int i=a; i<=b; i++){
      if(i%2==0){
        sumanumpar=sumanumpar+i;
      }
    }
    System.out.println("La suma "+a+" y "+b+"es:"+ sumanumpar);
  }

  static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar "+"1=xxxx,2=xxxx,3=numeros pares"+"\n4=Cantidad Cursos y Detalle:"+"\n5=Factorial"+"\n6=Factorialbig"+     "\n7=ejercicio2";
    System.out.println(msg);
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: suma20mumerosParesWhile();break;
          case 2: suma20mumerosParesFor();break;
          case 3: suma20numerosParesDowhile();break;
          case 4: asignaturasCursadas();break;
          case 5: 
          System.out.println("Ingrese un numero para calcular el factorial:");
          int n=sc.nextInt();
          System.out.println("El factorial de"+n+ "es:"+factorial(n));break;
          case 6:
          System.out.println("Ingrese un numero para calcular el factorial:");
          int N=sc.nextInt();
          System.out.println("El factorial de"+N+ "es:"+factorialBig(N));break;
          case 7: ejercicio2();break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }

  
  public static void main(String[] args) {
    System.out.println("Holas Est. Repetitivas");
    menuOpciones();
  }
  
}