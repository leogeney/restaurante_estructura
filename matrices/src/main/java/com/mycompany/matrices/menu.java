/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-18
 */
public class menu {
    String platos[];
    int datos[][];
    String semana[] = {"lunes", "martes" , "miercoles" , "jueves" , "viernes","sabado"};
    
    public void crearMenu(int cantidad){
    
    platos = new String[cantidad];
    
    int i = 0;
    
    while(i<cantidad){
        platos[i] =JOptionPane.showInputDialog( "ingrese el plato " + (i+1));
    i++;
    }
    }
    
    public void ConsultarMenu(){
        
        
        for (int i = 0; i < platos.length; i++) {
            
        
    JOptionPane.showMessageDialog(null, "platos:"+platos[i]);
    }}
    
    public void ingresarDatos(){
    datos = new int[6][platos.length];
    
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < platos.length; j++) {
                datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ventas del dia " +semana[i]+": plato " +platos[j]) );
            }
        }
    
    }
    public void conocerPlatosTotales(){
        
        int platosTotales= 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < platos.length; j++) {
                platosTotales+=datos[i][j];
            }
        }
        JOptionPane.showMessageDialog(null,"los platos vendidos fueron:" + platosTotales + " en total. ");
        JOptionPane.showMessageDialog(null,"el promedio de todos los platos es: " + platosTotales/(platos.length*6) );

    }
    
    
    public void conocerSemanaMayor(){
        int filaMayor = 0,sumaMaxima = 0;
        
        for (int i = 0; i < 6; i++) {
            int sumaFila = 0;
            for (int j = 0; j < platos.length; j++) {
                sumaFila+=  datos[i][j];
            }
            
            if(sumaFila > sumaMaxima){
            sumaMaxima =sumaFila;
            filaMayor = i;
            }
            
        }
                JOptionPane.showMessageDialog(null,"la semana donde mas se vendio es la:" + filaMayor +" semana");
                JOptionPane.showMessageDialog(null,"promedio de la semana que mas se vendio" + filaMayor/platos.length);

                
                int filaMenor = 0;
            int sumaMinima = Integer.MAX_VALUE;
    
            for (int i = 0; i < 6; i++) {
            int sumaFilam = 0;
            for (int j = 0; j < platos.length; j++) {
                sumaFilam+=  datos[i][j];
            }
            
            if(sumaFilam < sumaMinima){
            sumaMinima =sumaFilam;
            filaMenor = i;
            }
            
        }
                    JOptionPane.showMessageDialog(null,"promedio de la semana que menos se vendio" + filaMenor/platos.length);

    
                     Random random = new Random();
        int indiceAleatorio = random.nextInt(platos.length); 
        String datoAleatorio = platos[indiceAleatorio]; 

                            JOptionPane.showMessageDialog(null,"el plato recomendado es" + datoAleatorio);

        int diaAleatorio = random.nextInt(semana.length); 
        String datoAlea = semana[diaAleatorio]; 

                                    JOptionPane.showMessageDialog(null,"mejor dia de la semana para almorzar" + datoAlea );

                            
                                        // Supongamos que la matriz no está vacía y tiene al menos una columna
        int numFilas = datos.length;
        int numColumnas = datos[0].length;

        // Array para almacenar la suma de cada columna
        int[] sumaColumnas = new int[numColumnas];
                                    
                                    
                     for (int j = 0; j < platos.length; j++) {
            int suma = 0;
            for (int i = 0; i < 6; i++) {
                suma += datos[i][j];
            }
            sumaColumnas [j] = suma;
        }

        // Encontrar la columna con la mayor suma
        int columnaMayor = 0;
        int sumaMax = sumaColumnas[0];

        for (int j = 1; j < numColumnas; j++) {
            if (sumaColumnas[j] > sumaMax) {
                sumaMax = sumaColumnas[j];
                columnaMayor = j;
            }
        }

                                                  JOptionPane.showMessageDialog(null,"cantidad de platos que mas se vendieron" + columnaMayor   );

                            
                            
                            
                            
        
}
    
    public void EncontrarDia(){
     int mayor = 0;
    String fila = "";
    int columna = 0;

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < datos.length; j++) {
            if (datos[i][j] > mayor) {
                mayor = datos[i][j];
                fila = semana[i];
                columna = j;
            }
        }
    }
                            JOptionPane.showMessageDialog(null,"el plato que mas se vendio fue el: " +columna+ " del dia:" + fila + " y fueron" + mayor);

    
    int menor = 0;
    String filam = "";
    int columnam = 0;

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < datos.length; j++) {
            if (datos[i][j] > mayor) {
                menor = datos[i][j];
                filam = semana[i];
                columnam = j;
            }
        }
    }
                            JOptionPane.showMessageDialog(null,"el plato que mas se vendio fue el: " +columnam+ " del dia:" + filam + " y fueron" + menor);
                            
                            
                            
                            
                            
                            
    }
    
    
    
    
    
   
    
    
}
