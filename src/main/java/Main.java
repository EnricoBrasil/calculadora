import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        c.n1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        c.n2 = ler.nextInt();

        System.out.println("Digite o numero que corresponda com a operação! ");
        System.out.println(" 1) somar \n 2) subtrair \n 3) dividir \n 4) multiplicar");
        c.opc = ler.nextInt();

        c.menu();

    }
}
