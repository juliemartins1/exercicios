import java.util.Scanner;
 public class Ex3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
         int a,b;
        System.out.println("Informe o intervalo:");
       a=in.nextInt();
       b=in.nextInt();
        
        while(a<=b){
        
           if (a % 3==0){
            System.out.println(a);
           }
            
         a++;  
        }
         
    }
 }
