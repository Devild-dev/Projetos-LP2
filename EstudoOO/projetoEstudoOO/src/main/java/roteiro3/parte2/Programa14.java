package roteiro3.parte2;
import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double resultado = 0.0;
        
        System.out.println("Informe o valor de x:");
        double x = read.nextDouble();
        System.out.println("Informe a operacação (+,-,*,/): ");
        String operando = read.next();
        System.out.println("Informe o valor de y:");
        double y = read.nextDouble();
        
        switch(operando){
            case "+": resultado = soma(x,y);
                System.out.println("Resultado = "+ resultado);
                break;
            case "-": resultado = subtracao(x,y);
                System.out.println("Resultado = "+ resultado);
                break;
            case "*": resultado = multiplicacao(x,y);
                System.out.println("Resultado = "+ resultado);
                break;
            case "/": resultado = divisao(x,y);
                System.out.println("Resultado = "+ resultado);
                break;
            default:
                System.out.println("Operacao Inválida!");
        }
    }
    public static double soma(double x, double y){
        return (x + y);
    }
    public static double subtracao(double x, double y){
        return (x - y);
    }
    public static double multiplicacao(double x, double y){
        return (x * y);
    }
    public static double divisao(double x, double y){
        return (x / y);
    }
}
