package Atividades4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_MaiorValor {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        double V = tc.nextInt();
        double maior = V;
        double menor = V;

        for (int i = 2; i <= 7; i++) {
            System.out.println("Digite o número " + i + " : ");
            V = tc.nextDouble();
            if (V > maior) {

                maior = V;
            }

            if (V < menor) {

                menor = V;

            }

        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }

}
