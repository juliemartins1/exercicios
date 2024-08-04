import java.util.Scanner;
public class Exer08L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quanttotal,quant,cont=0;
        int prod;
        float precopoduto,preco,total=0.0f,media=0.0f,precototal=0.0f;
        System.out.println("Informe a quantidade em estoque: ");
        for(int i=0;true;i++){
            quanttotal=in.nextInt();
            break;
        }
        System.out.println("Informe a quantidade de produtos com precos diferentes: ");
        prod=in.nextInt();
         while(cont<prod){
            System.out.println("Informe qunatidade e o preco");
            quant=in.nextInt();
            preco=in.nextFloat();
            precopoduto=quant*preco;
            total+=precopoduto;
            
            cont++;
         }
         precototal=total/cont;
         System.out.println("Total em estoque:  "+quanttotal+"\n media de preço eh: "+precototal);
    }
}
