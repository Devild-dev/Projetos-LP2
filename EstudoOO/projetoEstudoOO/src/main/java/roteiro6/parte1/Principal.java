package roteiro6.parte1;

public class Principal {
    public static void main(String[] args){
        
        Ligacao ligacao1 = new Ligacao("121212","565656", "A", "B","10:15:02");
        ligacao1.setHoraFim("10:20:35");
        String horaFim = ligacao1.getHoraFim();
        String horaInicio = ligacao1.getHoraInicio();
        
        ConversorDeHora conversor1 = new ConversorDeHora();
        ConversorDeHora conversor2 = new ConversorDeHora();
        
        int resultadoSegundos = conversor1.horaPsegundos(horaFim) - conversor1.horaPsegundos(horaInicio);
        System.out.println("Ligação Inicial: "+conversor1.horaPsegundos(horaInicio));
        System.out.println("Ligação Final: "+conversor1.horaPsegundos(horaFim));
        System.out.println("Total de Tempo em Segundos: "+resultadoSegundos);
        
        /*ligacao1.setHoraFim("10:20:35");
        String horaFim = ligacao1.getHoraFim();
        
        String[] hms = horaFim.split(":");
        int hora = Integer.parseInt(hms[0]);
        int min = Integer.parseInt(hms[1]);
        int seg = Integer.parseInt(hms[2]);
        
        int segundos = ((hora*3600)+min*60)+seg;
        
        System.out.println("quantidade de segundos: "+segundos);
        
        
        System.out.println("Resultado1 :"+hms[0]);
        System.out.println("Resultado2 :"+hms[1]);
        System.out.println("Resultado3 :"+hms[2]);*/
        
        System.out.println("Número de Origem: "+ligacao1.getNumOrigem());
        System.out.println("Número de Destino:"+ligacao1.getNumDestino());
        System.out.println("Local de Origem: "+ligacao1.getLocalOrigem());
        System.out.println("Local de Destino: "+ligacao1.getLocalDestino());
        System.out.println("Hora de Início da Chamada: "+ligacao1.getHoraInicio());
        System.out.println("Hora de Finalização da Chamada: "+ligacao1.getHoraFim());
    }
}
