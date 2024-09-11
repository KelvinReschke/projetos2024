/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoWhile;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class att03 {
       
   public static void main (String [] args) {
       Scanner entrada = new Scanner (System.in);
         int A =0;
         int B =1;
         int C =0;
        
         while(C<500){
              System.out.print(" "
                      + " "+ C);
              C = A + B ;
              A = B;
              B = C;
         
         }
   }}
    
    
    
    
    
    
    
    
    
    
    
    

