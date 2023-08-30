package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = read.nextLine();
        System.out.println("Digite a sua idade");
        int idade = read.nextInt();
        
        System.out.println("Nome informado: " +nome);
        System.out.println("Idade informada: "+idade);     
        
        read.close();
    }
}
