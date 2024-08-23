/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices;

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
}
