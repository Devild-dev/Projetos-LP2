package roteiro5.parte2;

public class Principal {
    public static void main(String[] args){
        Loja loja1 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "112.233.445/0001-01");
        Loja loja2 = new Loja("Mercadão do Povo","", "001.233.445/0001-01");
        Loja loja3 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "112.233.445/0001-01");
        
        loja1.setValorFaturamento(10000);
        loja2.setValorFaturamento(20000);
        loja3.setValorFaturamento(10000);
        
        System.out.println("****** Teste 1 ******");
        if(loja1.getNomeFantasia() == loja3.getNomeFantasia()){
            System.out.println("Lojas Iguais");
        }else{
            System.out.println("Lojas Diferentes");
        }
        System.out.println("****** Teste 2 ******");
        if(loja1.getNomeFantasia().equals(loja3.getNomeFantasia())){
            System.out.println("Lojas Iguais");
        }else{
            System.out.println("Lojas Diferentes");
        }
        System.out.println("****** Teste 3 ******");
        if(loja1 == loja3){
            System.out.println("Lojas Iguais");
        }else{
            System.out.println("Lojas Diferentes");
        }
        System.out.println("****** Teste 4 ******");
        if(loja1.equals(loja3)){
            System.out.println("Lojas Iguais");
        }else{
            System.out.println("Lojas Diferentes");
        }
        System.out.println("****** Teste 5 ******");
        if(loja1.getValorFaturamento() == loja3.getValorFaturamento()){
            System.out.println("Faturamentos Iguais");
        }else{
            System.out.println("Faturamentos Diferentes");
        }
        System.out.println("****** Teste 6 ******");
        System.out.println(loja1==loja3);//false
        System.out.println(loja1.equals(loja3));//false
        /*if(loja1.equals(loja3)){
            System.out.println("Faturamentos Iguais");
        }else{
            System.out.println("Faturamentos Diferentes");
        }*/
        
        /*System.out.println("Imprimindo Loja1:\n"+loja1.getNomeFantasia()+"\n"+loja1.getRazaoSocial()+"\n"+loja1.getCnpj());
        System.out.println("");
        System.out.println("Imprimindo Loja2:\n"+loja2.getNomeFantasia()+"\n"+loja2.getRazaoSocial()+"\n"+loja2.getCnpj());*/
    }
}
