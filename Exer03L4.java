import java.util.Scanner;
 public class Exer03L4{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int div, cont=2,n;
        String primo="primo: ";
        System.out.println("Informe um numero");
        n=in.nextInt();
        
        while(cont<n){
            //System.out.println(cont);
            if(n%cont==0){
              primo="nao eh primo";
              break;
            }else{
               primo="eh primo";
            }
            
           
           
            cont++;
        }
         System.out.println(primo); 
    }
 }