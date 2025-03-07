package Atividades4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Incremento {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        int valor1 = tc.nextInt();

        
        System.out.println("Digite o 2° valor: ");
        int valor2 = tc.nextInt();
        
        System.out.println("Digite um incremento: ");
        String incre = tc2.nextLine();
        
        for (int c = valor1; c <= valor2; c++) {

            System.out.println(c + incre);

        }

    }

}
