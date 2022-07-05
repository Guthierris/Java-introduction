package Java.pacote1;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in); //criando o objeto scanner
    System.out.print("Digite a idadade:"); //mensagem solicitando ao usuario

    int idade = leitor.nextInt(); //definindo a idade com oque foi escaneado
    System.out.println("Idade: "+idade); //imprimindo a idade

    if (idade >= 18) { //condição ...
        System.out.println("maior de idade");
    }else{
        System.out.println("menor de idade");
    }
}
}