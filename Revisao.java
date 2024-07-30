import java.util.Scanner;
 
 public class Revisao{
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        float nota,media=0;
        int contador=0; 
        float menor=0;
        float maior=0;
               
           while(contador<8){
        
             System.out.println("Insira 8 notas");
             nota =in.nextFloat();

             if(contador==0 || nota< menor ){
                menor = nota;

             }
              if(contador==0 || nota>maior ){
                maior = nota;

             }
              media = media+nota;
             

            contador++;
           }
           media=media-maior-menor;
           
            media = media/6;
          
           System.out.println("media"+ media);
    }
 }