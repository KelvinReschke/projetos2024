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
public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o usuario");
        String usuario = entrada.next();
        System.out.println("informe a sua senha ");
        String senha = entrada.next();
         int contador = 1;
        
        while (usuario.equals(senha)&& contador<3 ) {
            System.out.println("usuario não pode ser igua a sua senha");
            System.out.println("informe o usuario");
            usuario = entrada.next();
            System.out.println("informe a sua senha ");
            senha = entrada.next();
            contador = contador + 1 ;
            
        }
    if(contador ==3 && usuario.equals(senha)){
            System.out.println("acesso negado");
    }else{
        System.out.println("acesso permitido");
    } 
    
    
    }
}
