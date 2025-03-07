package Atividades4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Random {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Random rm = new Random();

        int numero = rm.nextInt(100);
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        for (tentativas = 1; tentativas <= 7; tentativas++) {
            System.out.println("Tentativa " + tentativas);
            palpite = tc.nextInt();

            if (palpite == numero) {

                System.out.println("Parabéns você acertou em " + tentativas + "tentativas!");

            } else if (palpite < numero) {

                System.out.println("O número é maior");

            } else {
                System.out.println("O número é menor");

            }

        }
        if (palpite != numero) {

            System.out.println("Você não conseguiu adivinhar o número. \nO número era " + numero);

        }

    }

}
