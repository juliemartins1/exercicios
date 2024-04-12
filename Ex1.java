import java.util.Scanner;
  public class Ex1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int cont=0,valor,menor=-99999;
          while(cont<10){
            System.out.println("Informe os valores:");
            valor=in.nextInt();
            if(cont==0){
               menor = valor;
            } if(menor>valor){
                menor=valor;
            }
            cont++;
             
          }
           System.out.println("o menor valor eh:"+menor);
    }
  }
