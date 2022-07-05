package Java.pacote2;

import java.util.Scanner;

public class Calculamedia {
    public static void main(String[] args){


        System.out.print("Digite a nota da ap1: ");
        Scanner lerap1 = new Scanner(System.in);
        float ap1 = lerap1.nextFloat();

        System.out.print("Digite a nota da ap2: ");
        Scanner lerap2 = new Scanner(System.in);
        float ap2 = lerap2.nextFloat();

        float media = (ap1+ap2)/2;

        if(media >= 6){
            System.out.println("media: "+media+"\nAluno Aprovado!");
        }else{
            System.out.println("mdia: "+media+"\nAluno Reprovado!");
        }
       
    }
}
