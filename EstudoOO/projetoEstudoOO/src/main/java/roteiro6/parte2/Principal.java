package roteiro6.parte2;

public class Principal {
    public static void main(String[] args){
        Tempo tempo1 = new Tempo(10,15,02);
        Tempo tempo2 = new Tempo(10,20,35);
        Ligacao ligacao1 = new Ligacao("121212","565656", "A", "B",tempo1);
        ligacao1.setHoraFim(tempo2);
        
        System.out.println("Número de Origem: "+ligacao1.getNumOrigem());
        System.out.println("Número de Destino:"+ligacao1.getNumDestino());
        System.out.println("Local de Origem: "+ligacao1.getLocalOrigem());
        System.out.println("Local de Destino: "+ligacao1.getLocalDestino());
        System.out.println("Hora de Início da Chamada: "+tempo1.getHora()+":"+tempo1.getMinuto()+":"+tempo1.getSegundo());
        System.out.println("Hora de Finalização da Chamada: "+tempo2.getHora()+":"+tempo2.getMinuto()+":"+tempo2.getSegundo());
    }
}
