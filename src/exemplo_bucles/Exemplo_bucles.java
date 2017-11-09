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
public class Exemplo_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int menu;
       Scanner sm =new Scanner(System.in);
       System.out.println("Opción 1 : BucleWhile\nOpción 2 : Bucle DoWhile \nOpción 3 : Bucle For");
       menu=sm.nextInt();
       switch(menu){
           case 1:
                BucleWhile obxWhile=new BucleWhile();
                obxWhile.calcularWhile();
               break;
           case 2:
                BucleDoWhile obxDoWhile=new BucleDoWhile();
                obxDoWhile.calcularDoWhile();
               break;
           case 3:
                BucleFor obxFor = new BucleFor();
                obxFor.calcularFor();
               break;
       }
       
    }
}
