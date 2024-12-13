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
public class att02 {
    public static void main(String[] args) {
        String PrimeiroNome = JOptionPane.showInputDialog(null, "Informe o seu primeiro nome");
        String NomeDoMeio= JOptionPane.showInputDialog(null, "Informe o seu nome do meio");
        String SobreNome = JOptionPane.showInputDialog(null, "Informe o seu sobrenome");
        String NomeCompleto = PrimeiroNome+" "+NomeDoMeio+" "+SobreNome;
        JOptionPane.showMessageDialog(null, NomeCompleto, " Nome Completo ",JOptionPane.INFORMATION_MESSAGE);
    }
}
