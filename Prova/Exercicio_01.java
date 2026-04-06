package Prova;
import java.util.Scanner;

public class Exercicio_01{
    public static void main(String[] args) {
        int vetor [] = new int [5];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Digite os valores: ");
            vetor[i] = scanner.nextInt();
    
        }   
        for(int i = 0; i < 5; i++){
            if(vetor[i] >= 7){
                System.out.println(vetor[i]);
            }
        }

    }
}    