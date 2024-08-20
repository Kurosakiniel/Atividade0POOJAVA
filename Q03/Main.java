public class Main {
    public static void main(String[] args) {

        int contador = 10;
        int some = 0;

        while (contador > 0) {
            System.out.println("Contador: " + contador);

            some += contador;
            contador--;
        }

        System.out.println("O contador acabou");
        System.out.println("A soma dos números é: " + some);

        }
    }