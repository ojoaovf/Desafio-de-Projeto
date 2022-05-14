import java.util.Scanner;
/* 
Escreva um programa que leia 10 números, ao final o programa deverá exibir o maior e o menor 
número digitado pelo usuário. 
*/
public class FOR {
    public static void main(String[] args) {
        int numero = 0, maior = 0, menor = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numero = ler.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numeroi é: " + menor);
    }
}
