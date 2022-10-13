/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Looping_F {
    public static void main(String[] args) {
//    ==========LOOP F==============

                System.out.println("FOR");       
            for (int a = 5; a > 0; a--) {
            for (int b = 0; b < 5; b++) {
                System.out.print(a < 2 ? "0" : "*");
        }
                System.out.println("0");
        }
         
                System.out.println("WHILE");        
                int c = 5;
            while(c > 0){
                int d  = 0;
            while(d < 5){
                System.out.print(c < 2 ? "0" : "*");
                d++;
        }
                System.out.println("0");
                c--;
        }
                System.out.println("DO WHILE");
                int i = 5;
            do
        {
                System.out.print("");
                int j = 0;
            do
        {
                System.out.print(i < 2 ? "0" : "*");
                j++;
        }   while (j < 5);
                System.out.println("0");
                i--;
        }   while(i > 0);        
        }
        }
