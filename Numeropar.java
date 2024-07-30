import java.util.Scanner;
  public class Numeropar{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       int valor, menor=-9999;
       int cont=0;
        
         
         
         while(cont<10){
            System.out.println("digite o valor");
            valor=in.nextInt();
           if(valor%2==0){
            System.out.println("par");
            pares++;
           } else{
            System.out.println("impar");
            impar++;
           }
          cont++;                                                                                                                                                                                                                                                         
         }
        
        System.out.println("pares:" + pares);
        System.out.println("impares:" + impares);

    
           
    
    }

  }