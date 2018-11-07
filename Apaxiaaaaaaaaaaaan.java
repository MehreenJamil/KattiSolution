/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katti;

/**
 *
 * @author mehre
 */

import java. util. Scanner;     
public class Apaxiaaaaaaaaaaaans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scan = new Scanner( System.in );

    String input = scan.nextLine();
    int oo=0;
    String output="";
    output += String.valueOf(input.charAt(oo));
   
    for(int i=1;i<input.length();i++)
    {
        if(input.charAt(i)!=output.charAt(oo))
        {
            oo++;
            output+=input.charAt(i);
            
        }
    }
    
     System.out.println(output);
    
    //if(isAlpha(input));
    
    

scan.close();     
    }
   
}
