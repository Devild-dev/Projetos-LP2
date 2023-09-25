package roteiro9.parte2;

public class Principal {
    public static void main(String[] args){
        int lado = 2;
        double altura = 2.0;
        double largura = 4.0;
        double raio = 11.0;
        
        Quadrado q1 = new Quadrado(lado);
        Retangulo r1 = new Retangulo(altura,largura);
        Circulo c1 = new Circulo(raio);
        
        
        System.out.println("Nome: "+q1.getNomeFigura());      
        System.out.println("Lado: "+q1.getLado());
        System.out.println("Área: "+q1.getArea());
        System.out.println("Perímetro: "+q1.getPerimetro());
        System.out.println("---------------------------------");
        System.out.println("Nome: "+r1.getNomeFigura());
        System.out.println("Altura: "+r1.getAltura());
        System.out.println("Largura:"+r1.getLargura());
        System.out.println("Área: "+r1.getArea());
        System.out.println("Perímetro: "+r1.getPerimetro());
        System.out.println("---------------------------------");
        System.out.println("Nome: "+c1.getNomeFigura());
        System.out.println("Raio: "+c1.getRaio());
        System.out.println("Área: "+c1.getArea());
        System.out.println("Perímetro: "+c1.getPerimetro());
        
    }
}
