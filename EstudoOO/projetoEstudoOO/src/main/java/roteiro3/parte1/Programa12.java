package roteiro3.parte1;
import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float salarioBase = 0.0f;
        float gratificacao = 0.0f;
        float imposto = 0.0f;
        float salarioFinal = 0.0f;
        float porcentagem = 0.0f;
        System.out.println("Informe o salário base:");
        salarioBase = read.nextFloat();

        System.out.println("Digite a porcentagem da gratificação");
        porcentagem = read.nextFloat();
        gratificacao = calcPorcent(salarioBase, porcentagem);
        
        System.out.println("Digite a porcentagem do Imposto");
        porcentagem = read.nextFloat();
        imposto = calcPorcent(salarioBase, porcentagem);
        
        System.out.println("Gratificação = R$ "+ gratificacao);
        System.out.println("Imposto = R$ "+ imposto);
        
        salarioFinal = salarioBase+gratificacao-imposto;
        
        System.out.println("O salário final é R$ "+ salarioFinal);
         
    }
    
    public static float calcPorcent(float salarioBase, float porcentagem){
        porcentagem = porcentagem/100;
        return salarioBase * porcentagem;
    }
    
}
