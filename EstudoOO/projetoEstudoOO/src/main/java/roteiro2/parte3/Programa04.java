package roteiro2.parte3;
import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int cont = 0;
        while(cont < 5){
            System.out.println("Informe uma nota:");
            int nota = read.nextInt();
            if(nota >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
            cont++;
        }
    }
}
