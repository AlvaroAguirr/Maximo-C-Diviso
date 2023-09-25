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
public class MCDrec {

    public static int rec(int n1, int n2){
        if (n2==0){
            return n1;
        } else {
            return rec(n2, n1%n2);
            
        }
        
        
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("forma recursiva de encontrar el MCD");
        System.out.println("ingrese el primer numero");
        int n1 = input.nextInt();
        System.out.println("igrese el segundo numero ");
        int n2 = input.nextInt();
        int resultado= rec(n1,n2);
        System.out.println("el resultado final como el MCD es "+resultado);
        
        
        
    }
    
}
