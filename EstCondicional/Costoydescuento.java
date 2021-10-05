
import java.util.Scanner;
public class Costoydescuento {
    static Scanner sc = new Scanner(System.in);
    static void costYdes(){
  //Declaracion de variables e inicializacion  
   int precio=0;
   double costototal=0;
   int descuento=0;
  //Datos de Entrada
  System.out.println("Ingrese el precio");
  precio=sc.nextInt();
  //Proceso
  if(precio>=200){costototal = (precio-15)/100;
  }else if(precio>100 && precio<200){costototal=(precio-12)/100;
  }else if(precio<100){costototal=(precio-10)/100;
  }
  if(precio>=200){descuento=15;
  }else if (precio>100 && precio<200){descuento=12;
  }else if (precio<100){descuento=10;
  }
  //Datos de Salida
    System.out.println("El costo total es de:" +costototal);
    System.out.println("El descuento es de:" +descuento);
    }

public static void main(String[] args){
  costYdes();
}
}