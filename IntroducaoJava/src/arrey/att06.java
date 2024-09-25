
package arrey;

 //@author kelvin
import java.util.Scanner;


 
public class att06 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String [6];
        String PesquisarNome = " ";
        boolean NomeSemCadastro = true;
         for (int i = 0; i < 6; i++) {
             System.out.println("informe o seu nome: " + (i+1));
             nomes[i] = entrada.next();        
                   }
         System.out.println("informe o valor o nome que vc quer pesquisar");
           PesquisarNome = entrada.next(); 
           for (int i = 0; i < 6; i++) {
             if(PesquisarNome.equalsIgnoreCase(nomes[i])){
                 System.out.println("esse nome ja esta registrado na posição "+(i +1));
                 NomeSemCadastro = false ;
                 
         }
         }
        
       if(NomeSemCadastro) {
           System.out.println("seu nome não está cadastrado em nosso sistema");
       }
        
        
        
        
}}
