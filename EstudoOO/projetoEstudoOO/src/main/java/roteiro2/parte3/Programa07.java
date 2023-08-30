package roteiro2.parte3;
import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int flag = 1;
        int cont = 0;
        float media = 0.0f;
        float somatorio = 0.0f;
        
        while(flag != 0){
            System.out.println("Informe uma nota:");
            int nota = read.nextInt();
            if(nota >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
            somatorio+=nota;
            cont++;
            System.out.println("Digite 0(zero) para finalizar!");
            flag = read.nextInt();
        }
        media = somatorio/cont;
        System.out.println("A média encontrada foi: "+ media);
    }
}
