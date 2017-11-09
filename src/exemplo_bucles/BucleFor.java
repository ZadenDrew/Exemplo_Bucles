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
public class BucleFor {
    public void calcularFor(){
      int suma=0,num,producto=1;
       Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
           System.out.println("Introduce 7 numeros para realizar suma y producto :");
            num=sc.nextInt();
            suma +=num;
            producto *= num;
        }
        System.out.println("La suma es -->:"+suma+"El producto es -->:"+producto);
    }
}