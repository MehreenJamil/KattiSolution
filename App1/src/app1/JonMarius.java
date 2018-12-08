/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.Scanner;

/**
 *
 * @author mehre
 */
public class JonMarius {
     public static void main(String[] args) {
         
        String jo ;
        String dr;
        
        Scanner input1 = new Scanner(System.in);
       
        jo= input1.nextLine();
        
        dr=input1.nextLine();
        
         System.out.println(dr);
        
        if(jo.length()>=dr.length()){
            System.out.println("go");
        }
        else
        {
            System.out.println("no");
        }
    
}
}
