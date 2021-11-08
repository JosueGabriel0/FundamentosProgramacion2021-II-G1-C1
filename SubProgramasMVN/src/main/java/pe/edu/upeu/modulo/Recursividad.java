package pe.edu.upeu.modulo;
import java.math.BigInteger;
import java.util.Scanner;
public class Recursividad{
static Scanner sc= new Scanner(System.in);
  
  public long factorial(int numero){
   if(numero>1){
     return factorial(numero-1)*numero; 
   }

    return 1;
  }

  public BigInteger factorial(long numero){
   if(numero>1){
     return factorial(numero-1).multiply(new BigInteger(String.valueOf(numero))); 
   }

    return new BigInteger(String.valueOf(1));
  }
  

  public long fibonacci(int n){
    if(n>=2){
      return fibonacci(n-1)+fibonacci(n-2);
    }else{
      return n;
    }
  }

  //0,1,1,2,3,5,8,13,21,34
  public long fibonacciNrec(int numero){
  int valAnt=0, valNew=1, numAux=0;
  if (numero>1){
     for(int cont=1; cont<numero; cont++){
       numAux=valNew;
       valNew=valAnt+valNew;
       valAnt=numAux;
      
     }
     return valNew;
  }

  return numero; 
}

public BigInteger fibonacciNrecBig(int numero){
  BigInteger valAnt=new BigInteger("0"), valNew=new BigInteger("1"), numAux=new BigInteger("0");
  if (numero>1){
     for(int cont=1; cont<numero; cont++){
       numAux=valNew;
       valNew=valAnt.add(valNew);
       valAnt=numAux;
      
     }
     return valNew;
  }

  return new BigInteger(String.valueOf(numero)); 
}


}