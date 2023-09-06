package roteiro3.parte1;
import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float salarioBase = 0.0f;
        float gratificacao = 0.0f;
        float imposto = 0.0f;
        float salarioFinal = 0.0f;
        
        System.out.println("Informe o salário base:");
        salarioBase = read.nextFloat();
        
        //gratificacao = Programa11.calcGrat(salarioBase);
        gratificacao = calcGrat(salarioBase);
        imposto = calcImp(salarioBase);
        
        System.out.println("Gratificação = R$ "+ gratificacao);
        System.out.println("Imposto = R$ "+ imposto);
        
        salarioFinal = salarioBase+gratificacao-imposto;
        
        System.out.println("O salário final é R$ "+ salarioFinal);
         
    }
    
    public static float calcGrat(float salarioBase){
        return salarioBase * 0.05f;
    }
    
    public static float calcImp(float salarioBase){
        return salarioBase * 0.07f;
    }
}
