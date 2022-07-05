package Java.pacote2;

import java.util.Scanner;

public class ParouImpar {
    public static void main(String[]args){
        int numero;

        System.out.print("Digite um numero e descubra se ele é Par ou Impar\n numero: ");
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();

        if(numero % 2 == 0){
        System.out.println("O numero digitado é PAR !");

    }else{
        System.out.println("O numero digitado é IMPAR !");
    }
}
}
