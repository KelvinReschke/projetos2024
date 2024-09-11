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
public class att02 {

    public static void main(String[] args) {

    double cddA = 8000;
    double cddB = 20000;
   int Anos = 0;
  
    while (cddA<cddB){
        cddA=cddA*1.03;
        cddB=cddB*1.015;
        Anos++;
        System.out.println ("anos; "+ Anos );
        
        
        
        
    }
   
}
}