package roteiro5.parte3;

public class Principal {
    public static void main(String[] args){
        Loja loja1 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "112.233.445/0001-01");
        Loja loja2 = new Loja("Mercadão do Povo","", "001.233.445/0001-01");
        Loja loja3 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "112.233.445/0001-01");
        
        loja1.setValorFaturamento(10000);
        loja2.setValorFaturamento(20000);
        loja3.setValorFaturamento(10000);
        
        System.out.println("*********Comparação com método estático***************");
        System.out.println("Loja de maior faturamento: "+Loja.comparaFaturamentoEstatic(loja1, loja2));
        
        System.out.println("**********Compração com método não estático***********");
        System.out.println("Loja de maior faturamento: "+loja1.comparaFaturamentoNaoStatic(loja2));
        
        System.out.println("**********Compração com método não estático***********");
        System.out.println("Loja de maior faturamento: "+loja2.comparaFaturamentoNaoStatic(loja1));
        
    }
}
