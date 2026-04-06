package Prova;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];

        Scanner scanner = new Scanner (System.in);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite os números da matriz: ");
            matriz [i][j] = scanner.nextInt();
            }
            
        } 
        System.out.println(" ");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; i++){
                if( i == j);

                System.out.println("O elemento de: " + "i: "+ i + " e " + "j: " + j + matriz[i][j]);
            }
        }

    }
}