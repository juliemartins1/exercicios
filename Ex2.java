import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, par=0, impar=0, cont = 0;

        while (cont < 10) {
           
            numero = in.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
              
                impar++;
            }
            cont++;
        }
        System.out.println("A quantidade de numero par eh: " +par);
        System.out.println("A quantidade de numero impar eh: " +impar);
    }
}
