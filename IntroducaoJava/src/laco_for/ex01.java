/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laco_for;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class ex01 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        exA
    for(int i = 1; i <=100; i++)    
            System.out.print(i+ "  ");
    
//    exB
     for(int i = 100; i >=1; i += i--)    
            System.out.print(i+ "  ");
     
//     exC
      for(int i = 7; i <=77; i += 7)    
            System.out.print(i+ "  ");
      
//      exD
       for(int i = 20; i >=2 ; i -=2)    
            System.out.print(i+ "  ");
       
//       exE
        for(int i = 2; i <=20; i +=3)    
            System.out.print(i+ "  ");
        
//        exF
        for(int i = 99; i >=0; i -=11)    
            System.out.print(i+ "  ");
        
        
        
}}
