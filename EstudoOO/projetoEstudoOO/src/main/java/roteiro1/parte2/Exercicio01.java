package roteiro1.parte2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        double salarioBase = 2500;
        int totalHoras = 40;
        int numHorasExtras;
        
        //System.out.println("Salario base: "+ salarioBase );
        System.out.println("Digite a quantidade de horas extras");
        
        numHorasExtras = read.nextInt();
        double salarioPorHora = salarioBase/totalHoras;
        double valorHorasExtras = salarioPorHora*numHorasExtras;
        double totalSalario = salarioBase+valorHorasExtras;
        System.out.println("O salário total é igual a R$ "+ totalSalario);
        
    }
    
}
