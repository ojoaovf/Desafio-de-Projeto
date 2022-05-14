import java.util.Scanner;
/*
Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. 
O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o 
código for igual a zero.
*/
public class DOWHILE {
    public static void main(String[] args) {
        int codigo;
        float media, n1, n2, n3;
        
        Scanner ler = new Scanner(System.in);
        
        do{
            System.out.println("Digite o codigo do aluno: ");
            codigo = ler.nextInt();
            if(codigo != 0){
            System.out.println("Digite a 1ª nota do aluno: ");
            n1 = ler.nextFloat();
            System.out.println("Digite a 2ª nota do aluno: ");
            n2 = ler.nextFloat();
            System.out.println("Digite a 3ª nota do aluno: ");
            n3 = ler.nextFloat();
            
            media = (n1 + n2 + n3) / 3;
            
                System.out.println("A media do aluno " + codigo + " é: " + media);
            }
        }while(codigo != 0);
    }
}