/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_bucles;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class BucleWhile {
   
    public void calcularWhile(){
    int i=0,acuSuma=0,acuProducto=1,num;
    Scanner ler=new Scanner (System.in);
    System.out.println("Introduce 7 numeros para realizar suma y producto :");
    while(i<7){
    num=ler.nextInt();
    acuSuma=acuSuma+num;
    acuProducto=acuProducto*num;
    i++;
    }
    System.out.println("suma = " + acuSuma +"producto = " +acuProducto);
    }
}
