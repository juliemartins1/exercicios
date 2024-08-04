import java.util.Scanner;
public class Exer05L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n=0.0f,nota=0.0f,media;
        for(int i=0;i<5;i++){
            System.out.println("Informe as notas:");
            n=in.nextFloat();
            nota+=n;
        }
          media=nota/5;
          System.out.println("A media eh: "+ media);
    }
}
