/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd;
import java.util.Scanner;

/**
 *
 * @author ashkh
 */
public class MCD {

         public static int mcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      
        System.out.println("ingrese un numero ");
        int num1= input.nextInt();
         System.out.println("ingrese el segundo numero");
        int num2= input.nextInt();
        int rest= mcd(num1,num2);
          System.out.println("El Maximo Comun Divisor es "+rest);
    }
}
                
                
        
        
   

