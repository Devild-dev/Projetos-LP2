package roteiro6.parte1;

public class ConversorDeHora {
    
    public int horaPsegundos(String horaTotal){
        String[] hms = horaTotal.split(":");
        int hora = Integer.parseInt(hms[0]);
        int min = Integer.parseInt(hms[1]);
        int seg = Integer.parseInt(hms[2]);
        return ((hora*3600)+min*60)+seg;
    }
     public String segundosPhora(String segTotal){
         segTotal = segTotal;
        /*String[] hms = horaTotal.split(":");
        int hora = Integer.parseInt(hms[0]);
        int min = Integer.parseInt(hms[1]);
        int seg = Integer.parseInt(hms[2]);
        return ((hora*3600)+min*60)+seg;*/
        return segTotal;
    }
        /*ligacao1.setHoraFim("10:20:35");
        String horaFim = ligacao1.getHoraFim();
        
        String[] hms = horaFim.split(":");
        int hora = Integer.parseInt(hms[0]);
        int min = Integer.parseInt(hms[1]);
        int seg = Integer.parseInt(hms[2]);
        
        int segundos = ((hora*3600)+min*60)+seg;*/
}
