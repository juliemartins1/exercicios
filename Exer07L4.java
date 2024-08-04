import java.util.Scanner;

public class Exer07L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha,senhaincor,cont=0,i=0;
       
        System.out.println("informe  a senha de 5 digitos:");
        while(true){
           
            senha=in.nextInt();
            
            if(senha==12345){
                System.out.println("Vc acertou a senha");
                break;
            }else{
                System.out.println("Senha incorreta: digite novamente");
                       
             }
             i++;
             cont=i+1;
        }
        System.out.println("Voce tentou : "+cont +" vezes");
        }
    }
    

