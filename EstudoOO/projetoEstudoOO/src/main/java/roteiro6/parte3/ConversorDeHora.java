package roteiro6.parte3;

public class ConversorDeHora {
    
    public int horaPsegundos(Tempo horaTotal){
        int hora = horaTotal.getHora();
        int min = horaTotal.getMinuto();
        int seg = horaTotal.getSegundo();
        return ((hora*3600)+min*60)+seg;
    }
}
