package Matrizes;

public class ExemMatrizVers1 {
    public static void main(String[] args){
        int [][] m = new int[3][3];
            System.out.println( "Sorteando números");
        for(int n = 0; n < 3; n++) {
            for(int i = 0; i < 3; i++) {
                m[n][i] = (int)(Math.random()*9)+1;
            }
        }
        System.out.println("Matriz preenchida");
        System.out.println("Conteudo de cada posição da matriz:");
        for (int n = 0; n<3; n++){
            for(int i = 0; i < 3; i++){
                System.out.println("m["+n+"]["+i+"] = "+m[n][i]);
            }
        }
    }
}