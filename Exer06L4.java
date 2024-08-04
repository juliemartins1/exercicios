import java.util.Scanner;

 public class Exer06L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont=0;
        System.out.println("Informe o valor: ");
        n=in.nextInt();
        while(true){
        
         if(n>=1 && n<=10){
            
            break;
         }
         if(n==0 || n>=11){
            System.out.println("Informe o valor: ");
              n=in.nextInt();
         }
        
    }
    System.out.println("valor digitado: "+ n);
 }
}