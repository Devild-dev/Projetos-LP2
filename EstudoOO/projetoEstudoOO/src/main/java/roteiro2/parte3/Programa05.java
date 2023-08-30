package roteiro2.parte3;
import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        for(int i =0; i < 5;i++){
            System.out.println("Informe uma nota:");
            int nota = read.nextInt();
            
            if(nota >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }
    }
    
}
