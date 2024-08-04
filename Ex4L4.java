import java.util.Scanner;
public class Ex4L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor = 0.0f, saque, deposito = 0.0f, saldo;
        String opcao = "";
        int cont = 0;

        while (cont < 100) {
            System.out.println("informe a opcao desejada: a - consulta saldo b- deposito c-saque d-sair");
            opcao = in.next();
            if (opcao.equals("b")) {
                System.out.println("Informe o valor do deposito");
                deposito = in.nextFloat() + valor;
                valor = deposito;
            }if (opcao.equals("c")) {
                System.out.println("Informe o valor do saque");
                saque = valor - in.nextFloat();
                valor = saque;
            }if (opcao.equals("d")) {
                System.out.println("Saiu do sistema");            
           } if (opcao.equals("a")) {
                System.out.println("saldo eh: " + valor);
                valor = valor;
            }
            cont++;
        }
    }
}