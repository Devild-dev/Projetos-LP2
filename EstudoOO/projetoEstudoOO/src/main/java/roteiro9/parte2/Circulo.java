package roteiro9.parte2;

public class Circulo implements FiguraGeometrica {
    private double raio;
    
    float pi = 3.141592653589793f;
    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public String getNomeFigura(){
        return "Circulo";
    }
    
    @Override
    public double getArea(){
        return (this.raio*this.raio)*pi;
    }
    
    @Override
    public double getPerimetro(){
        return 2*pi*raio;
    }
        
}
