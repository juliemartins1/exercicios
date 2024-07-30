import java.util.Scanner;
  public class Media{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       float valor,media=0,menor=123;
       int cont=0,numerorepeticao;
        
         System.out.println("quantas notas são necessarias");
         numerorepeticao=in.nextInt();
         
            
         while(cont<numerorepeticao){
           System.out.println("Informe a nota");
            valor= in.nextFloat();
            if(cont == 0){
                menor=valor;
            }
             if(valor<menor){
                menor=valor;
             }
            media = media+valor;
              System.out.println("Soma Atual" + media);
          cont++;
                                                                                                                                                                                                                                                                
         }
         
        media=(media-menor)/(numerorepeticao-1);
        System.out.println("media dos valores eh:" + media);
    
           
    
    }

  }