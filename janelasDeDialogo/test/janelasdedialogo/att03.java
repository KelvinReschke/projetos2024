/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasdedialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author kelvin
 */
public class att03 {

    public static void main(String[] args) {
        String CEP = JOptionPane.showInputDialog(null, "informe o seu CEP (XXXXX-XXX) ");
       int validacao = Integer.parseInt(CEP);
       if (validacao>9){
           System.out.println("CEP validoo!");
       } else {
           System.out.println("CEP invalido!");
       }
    }
}