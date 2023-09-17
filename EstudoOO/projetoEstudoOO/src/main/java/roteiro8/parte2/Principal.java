package roteiro8.parte2;

public class Principal {
    public static void main(String[] args){
        //Veiculo v1 = new Veiculo("11111-BA",2010);
        VeiculoCarga v2 = new VeiculoCarga("22222-BA", 2011, 5000);
        VeiculoPasseio v3 = new VeiculoPasseio("33333-BA", 2012, 10);
        VeiculoPequeno v4 = new VeiculoPequeno("44444-BA", 2012, "moto");
        
        System.out.println("Calculo do Pedagio: R$ "+v2.calcPedagio());
        System.out.println("Calculo do Pedagio: R$ "+v3.calcPedagio());
        System.out.println("Calculo do Pedagio: R$ "+v4.calcPedagio());
    }
}
