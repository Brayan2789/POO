/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class SumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n1, n2, suma = 0, mayor, menor;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\tPor favor introduzca un número entero:\t");
        n1 = sc.nextInt();
        System.out.print("\n\tIntroduzca otro número entero:\t");
        n2 = sc.nextInt();
        
        if (n1 > n2){
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
        
        for (int i = menor; i <= mayor; i++) {
            if ( i % 2 == 0)
                suma += i;
        }
        
        System.out.print("\n\tLa suma de los pares entre " + n1 + " y " + n2 + " es: " + suma + ".\n\n\n");
        sc.close();
    }
    
}
