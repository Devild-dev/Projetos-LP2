package roteiro2.parte2;
import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args){
        System.out.println("Informe o seu nome: ");
        
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        System.out.println("Nome Informado: "+ nome);
        JOptionPane.showMessageDialog(null,"Nome Informado: "+ nome);
        
        String strIdade = JOptionPane.showInputDialog("Informe sua Idade:");
        int idade = Integer.parseInt(strIdade);
        System.out.println("Idade Informada: "+ idade);
        JOptionPane.showMessageDialog(null,"Idade Informada: "+ idade);
    }
    
}
