/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

//Escreva um programa que simule o preenchimento de
import java.util.Scanner;

//um cheque, ou seja, o usuário do programa informa um
//valor numérico e o programa deve escrevê-lo por
//extenso, conforme mostra a imagem abaixo. Considere
//números de 0 a 9.999.
//        int U;
//        int D;
//        int C;
//        int UM;
////        String Un;
//        String eDez;
//        String eCen;
//        String eUnMil;
//        
public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = entrada.nextInt();
        int Un = valor % 10;
        int Dez = valor % 100 / 10;
        int Cen = valor % 1000 / 100;
        int uM = valor / 1000;
        String ext = "";
        switch (uM) {
            case 1:
                ext = ext + "mil ";
                break;
            case 2:
                ext = ext + "dois mil ";
                break;
            case 3:
                ext = ext + "trez mil ";
                break;
            case 4:
                ext = ext + "quatro mil ";
                break;
            case 5:
                ext = ext + "cinco mil ";
                break;
            case 6:
                ext = ext + "seis mil ";
                break;
            case 7:
                ext = ext + "sete mil ";
                break;
            case 8:
                ext = ext + "oito mil ";
                break;
            case 9:
                ext = ext + "nove mil ";
                break;

        }
        switch (Cen) {
            case 1:
                if(Un == 0 && Dez == 0){
                ext = ext + "cem ";
                }else {
                    ext = ext + "cento ";
                }
                break;
            
            case 2:
                ext = ext + "duzentos ";
                break;
            case 3:
                ext = ext + "trezentos ";
                break;
            case 4:
                ext = ext + "quatrocentos ";
                break;
            case 5:
                ext = ext + "quinhentos ";
                break;
            case 6:
                ext = ext + "seicentos ";
                break;
            case 7:
                ext = ext + "setecentos ";
                break;
            case 8:
                ext = ext + "oitocentos ";
                break;
            case 9:
                ext = ext + "novecentos ";
                break;

        }
        switch (Dez) {
            case 1:
        
            switch(Un){
            case 0:
                ext = ext + "dez ";
                break;
            case 1:
                ext = ext + "onze ";
                break;
            case 2:
                ext = ext + "doze ";
                break;
            case 3:
                ext = ext + "treze ";
                break;
            case 4:
                ext = ext + "quatorze ";
                break;
            case 5:
                ext = ext + "quinze ";
                break;
            case 6:
                ext = ext + "desseseis ";
                break;
            case 7:
                ext = ext + "dessesete ";
                break;
            case 8:
                ext = ext + "dezoito ";
                break;
            case 9:
                ext = ext + "dezenove ";
                break;
                
        }
            Un = 0;
            break;
            case 2:
                 ext = ext + "vinte";
                break;
                case 3:
                 ext = ext + "trinta";
                break;
                case 4:
                 ext = ext + "quarenta";
                break;
                case 5:
                 ext = ext + "cinquenta";
                break;
                case 6:
                 ext = ext + "sessenta";
                break;
                case 7:
                 ext = ext + "setenta";
                break;
                case 8:
                 ext = ext + "oitenta";
                break;
                case 9:
                 ext = ext + "noventa";
                break;
        
        }
       
        switch (Un) {
            case 1:
                ext = ext + "um ";
                break;
            case 2:
                ext = ext + "dois ";
                break;
            case 3:
                ext = ext + "três ";
                break;
            case 4:
                ext = ext + "quatro ";
                break;
            case 5:
                ext = ext + "cinco ";
                break;
            case 6:
                ext = ext + "seis ";
                break;
            case 7:
                ext = ext + "sete ";
                break;
            case 8:
                ext = ext + "oito ";
                break;
            case 9:
                ext = ext + "nove ";
                break;
        }
        System.out.println("o seu valor é : " + ext);

    }
}
