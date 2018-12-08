/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;



import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mehre
 */





public class AnagramCounting {
    
    
    public  static int repLetter(String s, char c ){
                int count=0;
                
                for(int i=0; i<s.length();i++){
                
                    char ch= s.charAt(i);
                    
                    if(ch==c)
                        count++;                
                }
           
           return count;
           }
    
    public static BigInteger factorial(int length){
        BigInteger  ans=new BigInteger("1");
                      
                       for(int i=length; i>0; i--){
                           ans = ans.multiply(new BigInteger("" + i));
                               
                       }
                       return ans;
    }
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
       try ( // TODO code application logic here
               Scanner input = new Scanner(System.in)) 
           
           
       {
          while(input.hasNext(".*[a-zA-Z]+.*"))
              
               try{
                   
                       
                       String a=input.nextLine();
                       int length =a.length();
                       
                                          
                       BigInteger  ans=factorial(length);

                       String str="";
                       for(int j=0;j<length;j++){
                       if(str.indexOf(a.charAt(j))<0){
                           str = str+String.valueOf(a.charAt(j));
                           ans = ans.divide(factorial(repLetter(a,a.charAt(j))));
                       }
                       }
                      
                         System.out.println(ans);
                   }
             
               catch (NumberFormatException e) {
                   System.exit(0);
                   
               }
 
           
       }
     
     
     }  
     
    }

       

  
