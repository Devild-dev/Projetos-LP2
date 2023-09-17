package roteiro8.parte3;

public class Principal {
    public static void main(String[] args){
        Cliente c1 = new Cliente("058.857.965-47", "Davi", "Jardim Vera Cruz-IAPI - Salvador", "davi@gmail.com", "(71)99999-1234");
        VeiculoCarga v2 = new VeiculoCarga("22222-BA", 2011, 5000);
        VeiculoPasseio v3 = new VeiculoPasseio("33333-BA", 2012, 5);
        VeiculoPequeno v4 = new VeiculoPequeno("44444-BA", 2012, "moto");
        //c1.setVeiculo(v2);
        //c1.setVeiculo(v3);
        c1.setVeiculo(v4);
        
        System.out.println("CPF: "+c1.getCpf_cnpj());
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Endereço: "+c1.getEndereco());
        System.out.println("Calculo do pedagio: "+c1.getVeiculo().calcPedagio());
    }
}
