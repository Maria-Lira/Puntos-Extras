
package com.mycompany.p_extra_sem_dos;

import javax.swing.JOptionPane;

public class P_Extra_Sem_Dos {

    public static void main(String[] args) {
        

    /*
    Desarrolle un ejercicio que le solicite al usuario los años de antigüedad,la cantidad de horas laboradas 
    por semana y el precio que se le paga por hora, con estos datos debe calcular el salario bruto.
    Si el usuario tiene más de 12 años de trabajar para la empresa, se le dará un bono del 5.5% de su salario bruto, si este nuevo salario 
    bruto es superior a $2500 debe hacerse una deducción del 2.7%, pero si el salario supera los $3500,esta deducción será del
    3.8%. Muestre al usuario el salario neto final.
    */
        
        /*
        Declarar Variables
        */
        String Años_antiguedad;
        String Horas_laboradas_sem;
        String Precioporhora;
        int Años_anti;
        int Horas_labo;
        float Salaporhora;
        float Salario_bruto;
        
        /*
        Pedir Información
        */
        
        Años_antiguedad = JOptionPane.showInputDialog("Ingrese los años de antiguedad en la empresa");
        Horas_laboradas_sem = JOptionPane.showInputDialog("Ingrese las horas laboradas por semana en la empresa");
        Precioporhora = JOptionPane.showInputDialog("Ingrese el salario por hora en la empresa");
        
        /*
        Conversión
        */               
        Años_anti = Integer.parseInt(Años_antiguedad);
        Horas_labo = Integer.parseInt(Horas_laboradas_sem);
        Salaporhora = Float.parseFloat(Precioporhora);
        
        /*
        Procedimientos
        */
        Salario_bruto = (((Salaporhora * Horas_labo)*52)/12);
        
        /*
        Desición
        */
        if (Años_anti > 12){
            System.out.println("Cuentas con más de 12 añor y se te aplica un bono");
            Salario_bruto = Salario_bruto + (Salario_bruto * 0.055f);    
        }   
        if (Salario_bruto > 3500){
            System.out.println("Como su salario supera los 3500 se te aplica una deduccion del 3.8");
            Salario_bruto = Salario_bruto -(Salario_bruto * 0.038f);
        }   
        if (Salario_bruto > 2500 && Salario_bruto < 3500){
            System.out.println("Como su salario es mayor que 2500 y menor que 3500, se te aplica una deduccion del 2,7");
            Salario_bruto = Salario_bruto -(Salario_bruto * 0.027f);

        }
        
        System.out.println("Su salario neto es de "+ Salario_bruto);
        
    }
}

