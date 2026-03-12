import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int quantidade_inteira, quantidade_meia;
        double valor_inteira, valor_meia, valor_total_meia, valor_total_inteira, valor_total, valor_medio;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de ingressos inteiros: ");
        quantidade_inteira = teclado.nextInt();

        System.out.print("Digite o valor do ingresso inteiro: ");
        valor_inteira = Double.parseDouble(teclado.next().replace(",", "."));

        System.out.print("Digite a quantidade de ingressos meia-entrada: ");
        quantidade_meia = teclado.nextInt();

        System.out.print("Digite o valor do ingresso meia-entrada: ");
        valor_meia = Double.parseDouble(teclado.next().replace(",", "."));

        valor_total_inteira = quantidade_inteira * valor_inteira;
        valor_total_meia = quantidade_meia * valor_meia;
        valor_total = valor_total_inteira + valor_total_meia;
        valor_medio = valor_total / (quantidade_inteira + quantidade_meia);

        System.out.println("==============================================");
        System.out.println("Valor total dos ingressos inteiros: R$ " + valor_total_inteira);
        System.out.println("Valor total dos ingressos meia-entrada: R$ " + valor_total_meia);
        System.out.println("Valor total arrecadado: R$ " + valor_total);
        System.out.println("Valor médio dos ingressos: R$ " + valor_medio);
    }
}
