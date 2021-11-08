package clasesYobjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Definir variables
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos

    //Metodo para pedirle al usuario que digite 2 numeros
    public void leerNumeross(){
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }

    //Metodo para sumar amboss numeros
    public void sumar(){
        suma = numero1+numero2;
    }

    //Metodo para restar amboss numeros
    public void restar(){
        resta = numero1-numero2;
    }

    //Metodo para multiplicar amboss numeros
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }

    //Metodo para dividir amboss numeros
    public void dividir(){
        division = numero1/numero2;
    }

    //Metodo para mostrar los resultados 
    public void mostrarResultador(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        
    }
}
