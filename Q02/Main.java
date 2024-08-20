// import do scanner

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando objeto de scanner para ter entrada

        Scanner ler = new Scanner(System.in);

        int numero;

        numero = ler.nextInt();

        ler.close();

        // Definindo positivo, par ou impar

        if (numero > 0) {
            System.out.println("Seu número é positivo");

            if (numero % 2 == 0) {
                System.out.println("Seu número é par");
            }
            if (numero % 2 != 0) {
                System.out.println("Seu número é impar");
            }
        }


        // Definindo se o numéro é impar

        if (numero < 0) {
            System.out.println("Seu número é negativo");
        }

        // Definindo que o numero é 0

        if (numero == 0) {
            System.out.println("Seu número é 0");
        }


    }
}