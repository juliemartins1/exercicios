import java.util.Scanner;

public class Ex1L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma, numero, cont = 0, antessessor = 0;
        numero = in.nextInt();
        while ( 0 < numero) {
           
            antessessor = numero-1;
            soma= numero+antessessor;
           numero--;
        }
        soma = numero + antessessor;
        System.out.println(soma);
    }
}