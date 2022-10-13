/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Looping_E {
    public static void main(String[] args) {
//      =============LOOP E================
                System.out.println("FOR");
            for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 5; b++){
                System.out.print(a == b ? "0" : "*");
        }
                System.out.println("");
        }
        
                System.out.println("WHILE");
        int c = 1;
            while (c <= 5){
        int d=1;
            while (d <= 5){
                System.out.print(c == d ? "0" : "*");
            d++;
        }
                System.out.println("");
            c++;
        }
        
         
                System.out.println("DO WHILE");
        int f = 1 ;
            do  {
        int g = 1 ;
            do  {
                System.out.print(f == g ? "0" : "*");
            g++;
        }   while (g<=5);
                System.out.println();
            f++;
        }   while (f<=5);
        }
        }

