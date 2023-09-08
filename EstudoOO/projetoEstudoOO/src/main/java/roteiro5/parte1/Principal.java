package roteiro5.parte1;

public class Principal {
    public static void main(String[] args){
        Loja loja1 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "112.233.445/0001-01");
        Loja loja2 = new Loja("Mercadão do Povo", "", "001.233.445/0001-01");
        
        System.out.println("Imprimindo Loja1:\n"+loja1.getNomeFantasia()+"\n"+loja1.getRazaoSocial()+"\n"+loja1.getCnpj());
        System.out.println("");
        System.out.println("Imprimindo Loja2:\n"+loja2.getNomeFantasia()+"\n"+loja2.getRazaoSocial()+"\n"+loja2.getCnpj());
    }
}
