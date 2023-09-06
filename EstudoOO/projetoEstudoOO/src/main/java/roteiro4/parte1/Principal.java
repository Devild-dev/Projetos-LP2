package roteiro4.parte1;

public class Principal {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.matricula = 1111;
        aluno1.nome = "José";
        aluno1.curso = "Sistemas de Informação";
        aluno1.anoIngresso = 2017;
        
        Aluno aluno2 = new Aluno();
        aluno2.matricula = 2222;
        aluno2.nome = "Paulo";
        aluno2.curso = "Medicina";
        aluno2.anoIngresso = 2020;
        
        System.out.println("Matricula : "+ aluno1.matricula);
        System.out.println("Nome : "+ aluno1.nome);
        System.out.println("Curso : "+ aluno1.curso);
        System.out.println("Ano de Ingresso : "+ aluno1.anoIngresso);
        System.out.println(" ");
        
        System.out.println("Matricula: " + aluno2.matricula);
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Curso: " + aluno2.curso);
        System.out.println("Ano de ingresso: " + aluno2.anoIngresso);
    }
}
