import java.util.Scanner;
/*
Criar um programa que calcule a média final das notas de um aluno. O programa deve ler as notas dos 4 
bimestres e o número de faltas. Em seguida deve calcular a média aritmética das notas e imprimir umas das 
seguintes mensagens.
1- ‘Aprovado’ para média entre 7.0 e 10.0 e número de faltas até 36; 
2- ‘Exame final’ - média de 4.0 à 7.0 e número de faltas até 36;
3- ‘Reprovado’ - média abaixo de 4.0 ou número de faltas maior que 36;
*/
public class IFELSE {
    public static void main(String[] args) {
        Float n1, n2, n3, n4, media;
        int faltas;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        n1 = ler.nextFloat();

        System.out.println("Digite a nota 2:");
        n2 = ler.nextFloat();

        System.out.println("Digite a nota 3:");
        n3 = ler.nextFloat();

        System.out.println("Digite a nota 4:");
        n4 = ler.nextFloat();

        System.out.println("Digite o numero de faltas: ");
        faltas = ler.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;

        if (media < 4) {
            System.out.println("Reprovado");

        } else if (media >= 4 && media <= 7 && faltas <= 36) {
            System.out.println("Exame final");
        } else if (media >= 7 && faltas <= 36) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
