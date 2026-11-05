
package com.mycompany.p_extra_sem_uno;

import javax.swing.JOptionPane;

public class P_Extra_Sem_Uno {

    public static void main(String[] args) {
        
        
    /*
    Escriba un programa que lea el nombre del trabajador y su salario semanal, con esta información calcule su salario
    mensual sin deducciones (salario bruto), el monto de las deducciones (que corresponden a un 9.34%) y el salario
    después de aplicadas las deducciones (salario neto).
    */
        
        /*
        Declaración de Variables
        */
        String Nombre;
        String Salario_semanal;
        float Salario_sem;
        float Salario_mensual;
        float Monto_deducciones;
        float Salario_Neto;
        
        /*
        Pedir Información
        */
        Nombre = JOptionPane.showInputDialog("Nombre del trabajador");
        Salario_semanal = JOptionPane.showInputDialog("Ingrese su salario semanal");
        
        /*
        Conversión
        */
        Salario_sem = Float.parseFloat(Salario_semanal);
        
        /*
        Procedimientos
        */
        Salario_mensual = (Salario_sem * 52)/12;
        Monto_deducciones = (Salario_mensual * 0.0934f);
        Salario_Neto = Salario_mensual - Monto_deducciones;
        
        /*
        Mostrar Datos
        */
        System.out.println("Estimado " + Nombre + ", el salario de este mes se desglosa de la siguiente manera");
        System.out.println("Salario bruto: " + Salario_mensual);
        System.out.println("Deducciones: " + Monto_deducciones);
        System.out.println("Salario Neto: " + Salario_Neto);
    }
}

