package roteiro4.parte3;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplina;
    private String situacao;
    
    
    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        qtdeDisciplina = 0;
        situacao = "Não Matriculado";
    }
    
    public int getQtdeDisciplina(){
        return qtdeDisciplina;
    }
    
    public void setQtdeDisciplina(int qtdeDisciplina){
        this.qtdeDisciplina = qtdeDisciplina;
    }
    
    public String getSituacao(){
        if(this.getQtdeDisciplina() > 0){
            return this.situacao = "Matriculado";
        }else{
            return this.situacao = "Não Matriculado";
        }
    }
    
    public void setSituacao(String situacao){
        this.situacao = situacao;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
 
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public int getAnoIngresso(){
        return anoIngresso;
    }
    
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
}
