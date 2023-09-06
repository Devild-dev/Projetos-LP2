package roteiro4.parte4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int matricula;
        String nome;
        String curso;
        int anoIngresso;
        
        System.out.println("Digite a matricula do aluno:");
        matricula = read.nextInt();
        System.out.println("Digite o nome do aluno:");
        nome = read.next();
        System.out.println("Digite o curso do aluno:");
        curso = read.next();
        System.out.println("Digite o ano de ingresso do aluno:");
        anoIngresso = read.nextInt();
        
        Aluno aluno1 = new Aluno(matricula,nome,curso,anoIngresso);
       
        System.out.println("Digite a quantidade de disciplinas matriculadas");
        int qtdeDisciplina = read.nextInt();
        
        aluno1.setQtdeDisciplina(qtdeDisciplina);
        
        System.out.println("Matricula : "+ aluno1.getMatricula());
        System.out.println("Nome : "+ aluno1.getNome());
        System.out.println("Curso : "+ aluno1.getCurso());
        System.out.println("Ano de Ingresso : "+ aluno1.getAnoIngresso());
        System.out.println("Quantidade de disciplinas: "+ aluno1.getQtdeDisciplina());
        System.out.println("Situação do aluno : "+ aluno1.getSituacao());
    }
}
