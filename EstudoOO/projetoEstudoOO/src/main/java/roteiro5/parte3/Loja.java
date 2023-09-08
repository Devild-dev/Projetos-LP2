package roteiro5.parte3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFaturamento;
    private double area;
    private String nomeProprietario;
    
    public Loja(String nomeFantasia, String razaoSocial, String cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    public Loja(String nomeFantasia, String cnpj){
        this(nomeFantasia, nomeFantasia, cnpj);
        //this.nomeFantasia = nomeFantasia;
        //this.razaoSocial = nomeFantasia;
        //this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFaturamento() {
        return valorFaturamento;
    }

    public void setValorFaturamento(double valorFaturamento) {
        this.valorFaturamento = valorFaturamento;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    
   /*public static void comparaFaturamentoEstatic(Loja lojaA, Loja lojaB){
       if(lojaA.getValorFaturamento() > lojaB.getValorFaturamento()){
           System.out.println("Loja de maior faturamento: "+ lojaA.nomeFantasia);
           
       }else{
           System.out.println("Loja de maior faturamento: "+ lojaB.nomeFantasia);
       }
   }
   
   public void comparaFaturamentoNaoStatic(Loja lojaB){
       if(this.getValorFaturamento() > lojaB.getValorFaturamento()){
           System.out.println("Loja de maior faturamento: "+ this.getNomeFantasia());
       }else{
           System.out.println("Loja de maior faturamento: "+lojaB.getNomeFantasia());
       }
   }*/
   
   public static String comparaFaturamentoEstatic(Loja lojaA, Loja lojaB){
       if(lojaA.getValorFaturamento() > lojaB.getValorFaturamento()){
           return lojaA.getNomeFantasia();    
       }else{
           return lojaB.getNomeFantasia();
       }
   }
   
   public String comparaFaturamentoNaoStatic(Loja lojaB){
       if(this.getValorFaturamento() > lojaB.getValorFaturamento()){
           return this.getNomeFantasia();
       }else{
           return lojaB.getNomeFantasia();
       }
   }
}
