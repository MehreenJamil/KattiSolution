/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katti;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author mehre
 */
public class PrintedStatues {
     public static void main(String[] args) throws Exception {
         
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=0;
        double output=0;
       
    
        for(; i<num;i++){
            
          output=Math.pow(2, i);
            
           
            if(output >= num){
                break;
            }        
        }
         System.out.println(++i);
        
    }
}
