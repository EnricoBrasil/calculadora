import java.util.Scanner;
public class Calculadora {
    int n1;
    int n2;
    int opc;
    int resul;

    public void somar(){
        resul = n1 + n2;
        System.out.println("O resultado deu: " +resul);
    }

    public void sub(){
        resul = n1-n2;
        System.out.println("O resultado deu: " +resul);
    }

    public void div(){
        resul = n1/n2;
        System.out.println("O resultado deu: " +resul);
    }

    public void mult(){
        resul = n1*n2;
        System.out.println("O resultado deu: " +resul);
    }

    public void menu(){
        switch (opc){
            case 1:
                System.out.println("Somar");
                somar();
                break;
            case 2:
                System.out.println("subtrair: ");
                sub();
                break;
            case 3:
                System.out.println("Divisão: ");
                div();
                break;
            case 4:
                System.out.println("Multiplicar: ");
                mult();
                break;
            default:
                System.out.println("Opção não encontrada! ");
        }
    }

    public void verificador(){

    }


}
