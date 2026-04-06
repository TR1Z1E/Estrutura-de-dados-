package Vetores;
import javax.swing.JOptionPane;
public class ex001 {
    public static void main(String[] args) {
       double soma; 
       int n;
       n = Integer.parseInt(JOptionPane.showInputDialog("Digite as notas"));
       double vet [] = new double [n];
        

       for (int i = 0; i < n; i++) {
        vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite as notas"));

    }
    soma=0; 
    for (int i = 0; i < n; i++) {
        soma += vet[i];
    }
        System.out.println("A media é " +soma/n);
        
    }
}
