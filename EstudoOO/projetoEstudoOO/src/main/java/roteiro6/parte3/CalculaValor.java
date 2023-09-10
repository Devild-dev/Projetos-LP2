package roteiro6.parte3;

public class CalculaValor {
     
    public double CalculaValor(Tempo t1, Tempo t2){
       ConversorDeHora conversor1 = new ConversorDeHora();
       //ConversorDeHora conversor2 = new ConversorDeHora(); 
       double valor;
       int horaInicio = conversor1.horaPsegundos(t1);
       int horaFim = conversor1.horaPsegundos(t2);
       
       if(horaFim < horaInicio){
           horaFim+=86400;
       }
       
       int tempo = horaFim - horaInicio;
       if(tempo > 19 && tempo < 59){
           valor = 1.0;
       }else{
           valor = tempo/60;
       }
       
       
       return valor;
    }
     
     
    
}
