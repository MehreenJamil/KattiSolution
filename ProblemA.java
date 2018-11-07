
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehre
 */
public class ProblemA {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         String[] ss = input.split(" ");
         double v  = Math.sin(Math.toRadians(Double.parseDouble(ss[1]))),h= Double.parseDouble(ss[0]);
         double x = h/v; 
      
         System.out.println(Math.round(x+.5));// Length of ladder

        
    }
    
}
