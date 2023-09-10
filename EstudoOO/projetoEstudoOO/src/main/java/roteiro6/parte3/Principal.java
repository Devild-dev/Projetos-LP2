package roteiro6.parte3;

public class Principal {
    public static void main(String[] args){
        /*Tempo tempo1 = new Tempo(10,15,02);
        Tempo tempo2 = new Tempo(10,20,35);*/
        
        Tempo tempo1 = new Tempo(00,00,00);
        Tempo tempo2 = new Tempo(24,00,00);
                
        Ligacao ligacao1 = new Ligacao("121212","565656", "A", "B",tempo1);
        ligacao1.setHoraFim(tempo2);
        
        ConversorDeHora conversor = new ConversorDeHora();
        
        int horaInicio = conversor.horaPsegundos(tempo1);//converte a hora inicial da chamada em segundos
        int horaFim = conversor.horaPsegundos(tempo2);//converte a hora final da chamada em segundos
        
        //int resultadoSegundos = horaFim - horaInicio;
        CalculaValor resultado = new CalculaValor();
        double valor = resultado.CalculaValor(tempo1, tempo2);
        
        System.out.println("Horario Inicial: "+horaInicio);
        System.out.println("Horario Final: "+horaFim);
        System.out.println("Valor: R$ "+valor);
        
        String check = ligacao1.checkNumber("121212");//Verifica se o número faz ou recebe a ligação.
        System.out.println(check);
        
        
        System.out.println("Número de Origem: "+ligacao1.getNumOrigem());
        System.out.println("Número de Destino:"+ligacao1.getNumDestino());
        System.out.println("Local de Origem: "+ligacao1.getLocalOrigem());
        System.out.println("Local de Destino: "+ligacao1.getLocalDestino());
        System.out.println("Hora de Início da Chamada: "+tempo1.getHora()+":"+tempo1.getMinuto()+":"+tempo1.getSegundo());
        System.out.println("Hora de Finalização da Chamada: "+tempo2.getHora()+":"+tempo2.getMinuto()+":"+tempo2.getSegundo());
    }
}
