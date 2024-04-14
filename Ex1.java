import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, menor = -99999, cont = 0;

        while (cont < 10) {
            System.out.println("informe os valores: ");
            numero = in.nextInt();
            if (cont == 0) {
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            cont++;
        }
        System.out.println("o menor numero eh: " + menor);
    }
}