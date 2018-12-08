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
public class DartScores {
     public static void main(String[] args) {
         int scores[] =
{
    0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
    2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,
    3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60
   
};
         String output = "";
          Scanner in = new Scanner(System.in);
          int value = in.nextInt();
          
          outerloop:
         for(int x=0;x<scores.length;x++){
             if(scores[x]==value){
                 output = getStatus(x)+" "+getNumber(scores[x],x);
                 break outerloop;
             }
             for(int y=0;y<scores.length;y++){
             if(scores[x]+scores[y]==value){
                 output = getStatus(x)+" "+getNumber(scores[x],x)+"\n"+getStatus(y)+" "+getNumber(scores[y],y);
                 break outerloop;
             }
             for(int z=0;z<scores.length;z++){
             if(scores[x]+scores[y]+scores[z]==value){
                 output = getStatus(x)+" "+getNumber(scores[x],x)+"\n"+getStatus(y)+" "+getNumber(scores[y],y)+"\n"+getStatus(z)+" "+getNumber(scores[z],z);
                 break outerloop;
             }
             }
             }
              
         }
         if(output.isEmpty())
              System.out.print("Impooossible");
          else System.out.print(output);
         
     }
     
     public static String getNumber(int n,int index){
         if(index==0)
             return "";
         if(index<=20)
              return ""+n;
         else if(index<=40)
               return ""+n/2;
         else if(index>40)
             return ""+n/3;
         else return "";
       
     }
     public static String getStatus(int n){
         //System.out.println(n);
         if(n==0)
             return "";
         if(n<=20)
              return "single";
         else if(n<=40)
               return "double";
         else if(n>40)
             return "triple";
         else return "";
       
     }

}
