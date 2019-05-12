/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatoprogramacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author souquest
 */
public class Campeonatoprogramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /*
        Gestiona un campeonato de programación, introduce la puntuación (en enteros)
        obtenido por 5 programadores, conforme van terminando su prueba. La aplicación debe mostrar las 
        puntuaciones ordenadas de los 5. En ocasiones, cuando finalizan los 5 anteriores,  
        se suman al campeonato un maximo de 3 de exhibición, cuyos puntos se incluyen con el resto.
        La forma de especificar que no intervienen mas prog. de exhib. es introducir como
        puntuación -1. La aplicación debe, finalmente, mostrar los puntos ordenados de todos.
        
        */
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int puntos[] = new int[8];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Puntos del programador (" + (i+1)+"):");
            puntos[i] = Integer.parseInt(br.readLine());
            
        }
 
        Arrays.sort(puntos, 0, 5);
        System.out.println(Arrays.toString(puntos));
        
        int numElem = 5;
        System.out.println("Puntos del programador de exhibición: ");
        int puntosProgExh = Integer.parseInt(br.readLine());
        
        while(puntosProgExh != -1 && numElem < puntos.length){
            int pos = Arrays.binarySearch(puntos, 0, numElem, puntosProgExh);
            int indiceInsercion;
                    if (pos < 0){
                        indiceInsercion = -pos -1;
                    } else {
                        indiceInsercion = pos;
                    }
                    
                    
                    for (int i = numElem - 1; i >= indiceInsercion; i--) {
                        puntos[i+1] = puntos[i];
                        System.out.println(Arrays.toString(puntos));
            }
        
        puntos[indiceInsercion] = puntosProgExh;
            System.out.println(Arrays.toString(puntos));
        numElem++;
        if (numElem < puntos.length){
            System.out.println("Puntos del programador de exhibición: ");
            puntosProgExh = Integer.parseInt(br.readLine());
        }
                    
                    
        }
        System.out.println("Puntuacion final; ");
        System.out.println(Arrays.toString(puntos));
    }
}
