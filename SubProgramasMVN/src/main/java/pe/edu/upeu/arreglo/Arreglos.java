package pe.edu.upeu.arreglo;

import pe.edu.upeu.modelo.Persona;

public class Arreglos{

  public static void ejemploVectores01(){
  
    //1.Declaramos un arreglo de enteros
    int edades[];
    //2. Instanciamos el arreglo de enteros
    edades = new int[3];
    //3. Inicializamos los valores del arreglo de enteros
    edades[0] = 30;
    edades[1] = 15;

    //4. Leemos los valores de cada elemento del arreglo
    System.out.println("Arreglo enteros indice 0: "+ edades[0]);
    System.out.println("Arreglo enteros indice 1: "+ edades[1]);

    //1.1
    Persona personas[];
    personas = new Persona[4];
    personas[0] = new Persona("Juan", "Quispe", "54873221");
    personas[1] = new Persona("Karla", "Apaza", "45879865");

    System.out.println("Arreglo personas indice 0: Nombre "+personas[0].nombre+ 
    " Apellidos:"+personas[0].apellidos+" DNI:"+personas[0].dni);
    System.out.println("Arreglo personas indice 1: Nombre "+personas[1].nombre+ 
    " Apellidos:"+personas[1].apellidos+" DNI:"+personas[1].dni);




  }

  public static void ejemploVectores02(){
    String nombres[]={"Sara","Laura","Carlos","Carmen"};
    System.out.println("Tamaño vector: "+nombres.length);
  
  }

  public static void ejemploMatrices01(){
    int edades[][];//int
    edades=new int[3][2];//Definir Tamaño

    edades[0][0]=30;
    edades[0][1]=15;
    edades[1][0]=20;
    edades[1][1]=45;
    edades[2][0]=5;
    edades[2][1]=38;
    //edad[2][2]=40;//Error

    System.out.println("Matriz(0,0): "+edades[1][0]);

    for(int i=0;i<edades.length;i++){
      for(int j=0;j<edades.length;j++){
         System.out.println("M["+i+"]["+j+"]: "+edades[i][j]);
      }
    }
  }

  
  public static void main(String [] args){
    //ejemploVectores01();
    //ejemploVectores02();
    ejemploMatrices01();
  }

  }



  
