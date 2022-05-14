import java.util.Scanner;
//Crie um programa capaz de dizer o dia da semana baseado nos numeros de 1(domingo) a 7(sabado).

public class SWITCHCASE {
    public static void main(String[] args) {
        int dia = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana");
        dia = ler.nextInt();

        switch(dia){
           case 1:
                System.out.println("Domingo");
           break;
           case 2:
               System.out.println("Segunda");
           break;
           case 3:
               System.out.println("Terça");
           break;
           case 4:
               System.out.println("Quarta");
           break;
           case 5:
               System.out.println("Quinta");
           break;
           case 6:
               System.out.println("Sexta");
           break;
           case 7:
               System.out.println("Sabado");
           break;
           default:
               System.out.println("Número inválido");
           break;    
           
        }
    }
}
