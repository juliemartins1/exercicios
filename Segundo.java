import java.util.Scanner;
public class Segundo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       
        int N = in.nextInt();
        int cont = 0;
        int soma = 0;

        while (cont <= N) {
           System.out.println("CONT " + cont);
            
           soma=soma+cont;
            cont=cont+2;
        }
         
          System.out.println(soma);
      }

   }
    