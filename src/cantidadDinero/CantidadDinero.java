
package cantidadDinero;

import java.util.Scanner;


/*Guillermo tiene N dolares. 
Luis tiene la mita de lo que posee Guillermo. 
Juan tiene la mitad de lo que poseen Luis y guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad  de dinero que tienen entre los 3.*/

public class CantidadDinero {

    public static void main(String[] args) {
        double guillermoD, total;
        double luisD;
        double juanD;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println(" Ingresa la cantidad de plata que tiene Guillermo: ");
        guillermoD = entrada.nextDouble();
        
        
        luisD = guillermoD/2;
        
        juanD = (luisD+guillermoD)/2;
        
        System.out.println("\t\t\n Como Luis tiene la mitad de plata que tiene Guillermo eso quiere decir que Luis tiene:"+luisD);
        
        System.out.println("\t\t \n y Juan por el otro lado tiene: "+juanD);
        
        total = juanD + luisD + guillermoD;
        
        System.out.println("\t\t\n El TOTAL del dinero entre los 3 es: "+total);
    }
}
