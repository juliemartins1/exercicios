import java.util.Scanner;

  public class Fatorial{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        int contador=1;
         int valor;
         int fatorial= 1 ;
          
            System.out.println("digite um numero");
            valor=in.nextInt();
         
         while(contador<=valor){         

            fatorial=(fatorial*contador);
             

                   
                contador++;
         }
         System.out.printf("fatorial  %d" , fatorial);
    }
  }