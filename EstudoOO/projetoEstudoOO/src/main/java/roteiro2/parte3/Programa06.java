package roteiro2.parte3;
import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int flag = 1;
        
        while(flag != 0){
            System.out.println("Informe uma nota:");
            int nota = read.nextInt();
            if(nota >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
            System.out.println("Digite 0(zero) para finalizar!");
            flag = read.nextInt();
        }
    }
    
}
