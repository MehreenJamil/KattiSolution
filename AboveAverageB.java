/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package app1;

import java.util.Scanner;

import java.math.BigDecimal;
import java.text.DecimalFormat;
/**
 *
 * @author mehre
 */
public class AboveAverageB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int totalClasses = in.nextInt();
        in.nextLine();
        String []result = new String[totalClasses]  ; 
        for (int j = 1; j <= totalClasses; j++) {
            int avg=0;
        int aboveAvg=0;
            str = in.nextLine();
         
            String[] ss = str.split(" ");
            int[] marks = new int[Integer.parseInt(ss[0])];
            
            for (int i = 0; i < ss.length - 1; i++) {
                marks[i] = Integer.parseInt(ss[i+1]);
                avg +=marks[i];
            }
             avg = avg/Integer.parseInt(ss[0]);
             for (int i = 0; i < marks.length ; i++) {
               if(marks[i]>avg)
                   aboveAvg++;
            }
           
             DecimalFormat df = new DecimalFormat("0.000");
          result[j-1] = df.format(aboveAvg/Float.parseFloat(ss[0])*100);
        }
        
        for(int i=0;i<totalClasses;i++)
            System.out.println(result[i]+"%");

    }
    }
