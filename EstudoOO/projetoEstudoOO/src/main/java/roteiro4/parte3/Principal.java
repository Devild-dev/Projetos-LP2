package roteiro4.parte3;

public class Principal {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(111, "João", "Sistemas de Informação", 2017);
        
        System.out.println("Matricula : "+ aluno1.getMatricula());
        System.out.println("Nome : "+ aluno1.getNome());
        System.out.println("Curso : "+ aluno1.getCurso());
        System.out.println("Ano de Ingresso : "+ aluno1.getAnoIngresso());
        System.out.println(" ");
        
        aluno1.setMatricula(222);
        aluno1.setQtdeDisciplina(-1);
        
        System.out.println("Matricula : "+ aluno1.getMatricula());
        System.out.println("Nome : "+ aluno1.getNome());
        System.out.println("Curso : "+ aluno1.getCurso());
        System.out.println("Ano de Ingresso : "+ aluno1.getAnoIngresso());
        System.out.println("Quantidade de disciplinas: "+ aluno1.getQtdeDisciplina());
        System.out.println("Situação do aluno :"+ aluno1.getSituacao());
    }
}
