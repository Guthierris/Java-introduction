package Java.pacote2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        
        int n1, n2, soma, subt, div, mult;

        System.out.print("Digite primeiro numero: ");
        Scanner ler1 = new Scanner(System.in);
        n1 = ler1.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        Scanner ler2 = new Scanner(System.in);
        n2 = ler2.nextInt();

        System.out.println("Digite a operação");
        System.out.println("1:Adição \n2:Subtração \n3:Multiplicação \n4:Divisão");
        Scanner ler3 = new Scanner(System.in);
        int escolha = ler3.nextInt();

        soma = n1+n2;
        subt = n1-n2;
        div = n1*n2;
        mult = n1/n2;

        switch (escolha){
            case 1:
                System.out.println("Adição\n"+n1+"+"+n2+"="+soma);
            break;
            case 2:
                System.out.println("Subtração\n"+n1+"-"+n2+"="+subt);
            break;
            case 3:
                System.out.println("Multiplicação\n"+n1+"*"+n2+"="+div);
            break;
            case 4:
                System.out.println("Divisão\n"+n1+"/"+n2+"="+mult);
            default:
            break;
        }
    }

}
