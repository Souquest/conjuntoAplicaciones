/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author souquest
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Leer y almacenar n numeros enteros en una tabla, a partir de la
        que se construiran otras dos tablas con los elementos con valores
        pares e impares de la primera, respectivamente.
        */
        Scanner sc = new Scanner(System.in);
        int t[];
        System.out.println("escriba n:");
        int n = sc.nextInt();
        t = new int[n];
        
        for (int i = 0; i < t.length; i++) {
            System.out.println("introduzca un numero:");
            t[i] = sc.nextInt();
        }

        int contPar = 0;
        int contImpar = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                contPar++;
            }else{
                contImpar++;
            }
        }
     int par[] = new int[contPar];
     int impar[] = new int[contImpar];
     
     contPar = 0;
     contImpar = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                par[contPar] = t[i];
                contPar++;
            }else{
                impar[contImpar] = t[i];
                contImpar++;
            }
        }
        Arrays.sort(par);
        Arrays.sort(impar);
        System.out.println("tabla par: "+ Arrays.toString(par));
        System.out.println("tabla impar: "+ Arrays.toString(impar));
    }
    
}
