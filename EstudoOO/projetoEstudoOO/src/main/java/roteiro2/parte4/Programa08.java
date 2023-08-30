package roteiro2.parte4;
import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int tam = 5;
        int[] vetorNotas = new int[5];
        
        for(int i=0;i<tam;i++){
            System.out.println("Informe uma nota");
            int nota = read.nextInt();
            vetorNotas[i] = nota;
        }
        for(int i=0;i<tam;i++){
            int aux = i+1;
            System.out.println("A nota "+ aux +" é :"+ vetorNotas[i]);
        }
    }
}
