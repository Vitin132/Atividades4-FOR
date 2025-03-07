

package Atividades4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Caractere {

    public static void main(String[] args) {
        
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Digite uma letra:");
        String letra = tc.nextLine();
        
        
        
        System.out.println("Digite um número:");
        int num = tc.nextInt();
        
        
        for (int c = 1; c <= num; c ++){
            
            System.out.println(letra);
            
        }
        
    }
    
    
    
}
