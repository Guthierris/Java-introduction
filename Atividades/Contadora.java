package Java.pacote2;

import java.util.Scanner;

public class Contadora {
    public static void main(String[] args){
        int contador =1, num;

        System.out.print("Iniciando Contador\nDigite um numero:");
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();

        while (contador <= num) {
            System.out.println(contador);
            contador++;
        }
    }
}
