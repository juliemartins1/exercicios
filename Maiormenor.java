import java.util.Scanner;
  public class Maiormenor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       int valor, menor=-9999;
       int cont=0;
        
         
         
         while(cont<10){
            System.out.println("digite o valor");
            valor=in.nextInt();
           if(cont == 0){
                menor=valor;
            }
             if(valor<menor){
                menor=valor;
             }
          cont++;                                                                                                                                                                                                                                                         
         }
        
        System.out.println("O menor valor eh:" +menor);
    
           
    
    }

  }