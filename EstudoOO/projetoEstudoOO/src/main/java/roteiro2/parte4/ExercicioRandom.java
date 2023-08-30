package roteiro2.parte4;
import java.util.*;

public class ExercicioRandom {
    public static void main(String[] args){
        Random random = new Random();
        int flag = 0;
        Scanner read = new Scanner(System.in);
        int numeroSecreto = random.nextInt(10)+1;
                
        while(flag != numeroSecreto){
            System.out.println("Digite um valor");
            flag = read.nextInt();
            
            if(flag > numeroSecreto){
                System.out.println("Número informado maior que número secreto!");
            }else{
                System.out.println("Número informado é menor que o número secreto!");
            }
        }
        System.out.println("Numero aleatório:"+numeroSecreto);
        
    }
    
}
