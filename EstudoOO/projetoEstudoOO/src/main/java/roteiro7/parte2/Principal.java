package roteiro7.parte2;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    
   public static void main(String[] args){        
        Scanner read = new Scanner(System.in);
        int quant = 2;
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        int matricula;
        String nome;
        String curso;
        int anoIngresso;
        
        for(int i = 0; i < quant; i++){
            System.out.println("Digite o número da matrícula : ");
            matricula = read.nextInt();
            System.out.println("Digite o nome do aluno  : ");
            read.nextLine();
            nome = read.nextLine();
            System.out.println("Digite o curso : ");
            curso = read.nextLine();
            System.out.println("Digite o ano do ingresso :");
            anoIngresso = read.nextInt();
            
            Aluno aluno = new Aluno(matricula,nome,curso,anoIngresso);
            listaAlunos.add(aluno);
        }
        
        System.out.println("Listando os Alunos :");
        System.out.println("----------------------------------");
        for (int i = 0; i < quant;i++){
            System.out.println("Matricula : "+listaAlunos.get(i).getMatricula());
            System.out.println("Nome : "+listaAlunos.get(i).getNome());
            System.out.println("Curso : "+ listaAlunos.get(i).getCurso());
            System.out.println("Ano Ingresso : "+ listaAlunos.get(i).getAnoIngresso());
           System.out.println("----------------------------------");
        }
   }
}