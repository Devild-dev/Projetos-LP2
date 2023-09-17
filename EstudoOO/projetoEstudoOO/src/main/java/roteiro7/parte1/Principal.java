package roteiro7.parte1;
import java.util.Scanner;

public class Principal {
    
   public static void main(String[] args){        
        Scanner read = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[3];
        
        int matricula;
        String nome;
        String curso;
        int anoIngresso;
        
        
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o número da matrícula : ");
            matricula = read.nextInt();
            System.out.println("Digite o nome do aluno  : ");
            read.nextLine();
            nome = read.nextLine();
            System.out.println("Digite o curso : ");
            //read.nextLine();
            curso = read.nextLine();
            System.out.println("Digite o ano do ingresso :");
            anoIngresso = read.nextInt();
            
            Aluno aluno = new Aluno(matricula,nome,curso,anoIngresso);
            listaAlunos[i] = aluno;
        }
        
        /*
        Aluno aluno1 = new Aluno(111,"Jose","Sistemas de Informação", 2019);
        Aluno aluno2 = new Aluno(222, "Maria","Engenharia Civil", 2020);
        Aluno aluno3 = new Aluno(333, "Carlos", "Quimica", 2021);
    
        listaAlunos[0] = aluno1;
        listaAlunos[1] = aluno2;
        listaAlunos[2] = aluno3;*/
        
        System.out.println("Listando os Alunos :");
        System.out.println("----------------------------------");
        for (int i = 0; i < 3;i++){
            System.out.println("Matricula : "+listaAlunos[i].getMatricula());
            System.out.println("Nome : "+listaAlunos[i].getNome());
            System.out.println("Curso : "+ listaAlunos[i].getCurso());
            System.out.println("Ano Ingresso : "+ listaAlunos[i].getAnoIngresso());
           System.out.println("----------------------------------");
        }
   }
    
}