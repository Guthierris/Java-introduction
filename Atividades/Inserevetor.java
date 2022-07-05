package Java.pacote2;

import java.util.Scanner;

public class Inserevetor {
    public static void main (String[] args){
        String [] nomes = new String[3];

        System.out.print("Digite um nome: ");
        Scanner ler = new Scanner(System.in);
        nomes[0]= ler.nextLine();
        System.out.println("vet[0]: "+nomes[0]);

        System.out.print("Digite um nome: ");
        Scanner ler1 = new Scanner(System.in);
        nomes[1]= ler1.nextLine();
        System.out.println("vet[1]: "+nomes[1]);

        System.out.print("Digite um nome: ");
        Scanner ler2 = new Scanner(System.in);
        nomes[2]= ler2.nextLine();
        System.out.println("vet[3]: "+nomes[2]);

    }
}
