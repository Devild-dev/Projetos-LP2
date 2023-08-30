package roteiro2.parte4;
import java.util.*;

public class Programa10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int flag = 1;
        int cont = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        
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
            array.add(nota);
            
            somatorio+=nota;
            cont++;
            System.out.println("Digite 0(zero) para finalizar!");
            flag = read.nextInt();
        }
        
        media = somatorio/cont;
        System.out.println("A média encontrada foi: "+ media);
        
        cont = 0;
        for(int i=0;i<array.size();i++){
            if (array.get(i)> media){
                cont++;
            }
        }
        System.out.println("O total de "+ cont + " notas ficaram acima da média!");
    }
}
