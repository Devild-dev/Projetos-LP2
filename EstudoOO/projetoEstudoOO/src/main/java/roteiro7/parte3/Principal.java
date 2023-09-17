package roteiro7.parte3;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    
   public static void main(String[] args){        
        Scanner read = new Scanner(System.in);
        int quantAlunos = 2;
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        int matricula;
        String nome;
        String curso;
        int anoIngresso;
        String disciplina;
        
        int flag = 1;
        
        for(int i = 0; i < quantAlunos; i++){
            System.out.println("Digite o número da matrícula: ");
            matricula = read.nextInt();
            System.out.println("Digite o nome do aluno: ");
            read.nextLine();
            nome = read.nextLine();
            System.out.println("Digite o curso: ");
            curso = read.nextLine();
            System.out.println("Digite o ano do ingresso:");
            anoIngresso = read.nextInt();
            
            Aluno aluno = new Aluno(matricula,nome,curso,anoIngresso);
            
            System.out.println("Cadastrando disciplinas!!!");
            while(flag != 0){   
                System.out.println("Digite a disciplina:");
                read.nextLine();
                disciplina = read.nextLine();
                aluno.setListaDisciplinas(disciplina);
            
                System.out.println("Digite 0 para finalizar cadastro de disciplinas!");
                flag = read.nextInt();
            }
            flag = 1;
            listaAlunos.add(aluno);
            
        }
        
        System.out.println("Listando os Alunos :");
        System.out.println("----------------------------------");
        for (int i = 0; i < quantAlunos;i++){
            System.out.println("Matricula: "+listaAlunos.get(i).getMatricula());
            System.out.println("Nome: "+listaAlunos.get(i).getNome());
            System.out.println("Curso: "+ listaAlunos.get(i).getCurso());
            System.out.println("Ano Ingresso: "+ listaAlunos.get(i).getAnoIngresso());
            System.out.println("Quantidade de Disciplinas do aluno: "+listaAlunos.get(i).getListaDisciplinas().size());
            System.out.println("Disciplinas do aluno:");
            for(int j=0; j < listaAlunos.get(i).getListaDisciplinas().size();j++){
                System.out.println(listaAlunos.get(i).getListaDisciplinas().get(j));
            }
            System.out.println("----------------------------------");
        }
   }
}