package roteiro4.parte2;

public class Principal {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(111, "João", "Sistemas de Informação", 2017);
        
        System.out.println("Matricula : "+ aluno1.matricula);
        System.out.println("Nome : "+ aluno1.nome);
        System.out.println("Curso : "+ aluno1.curso);
        System.out.println("Ano de Ingresso : "+ aluno1.anoIngresso);
        System.out.println(" ");
    }
}
