

package Atividades4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Tabudada {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        
        System.out.println("Digite um valor:");
        int valor = teclado.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = "+(valor*i));
        }
        
    }
    

}
