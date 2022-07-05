package Java.pacote1;
import java.util.Scanner;

public class swcase{
    public static void main(String[] args) {
      
       System.out.println("Digite uma opção:");
       System.out.println("1: Dean");
       System.out.println("2: Sam");
       Scanner leitor = new Scanner(System.in);
       int escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Dean Winchester");
                break;
            case 2:
                System.out.print("Sam Winchester");
                break;
            default:
                System.out.print("digite uma opção valida");
                break;
        }
    }
}




