package Atividades4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Media {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        
        
        int soma =0;
        for (int c = 1; c <= 5; c++) {
            System.out.println("Digite um valor:");
            int valor = tc.nextInt();
            
            
            soma += valor;
            
            
            
        }
        
        double media = soma/5;
        
        System.out.println("A média é :"+media);
        
        

    }

}
