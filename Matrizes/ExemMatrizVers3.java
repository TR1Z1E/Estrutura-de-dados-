package Matrizes;

public class ExemMatrizVers3 {
    public static void main(String[] args){
        int [][] m = new int[3][3];
            System.out.println( "Sorteando números");
        for(int n = 0; n < 3; n++) {
            for(int i = 0; i < 3; i++) {
                m[n][i] = (int)(Math.random()*9)+1;
            }
        }
        System.out.println("Matriz preenchida");
        System.out.println("Conteudo da matriz:");
        for (int n = 0; n<3; n++){
            for(int i = 0; i < 3; i++){
                System.out.println("m["+n+"]["+i+"] = "+m[n][i]);
            }
        }
        System.out.println("Conteudo da matriz completa:");
        for(int n=0; n<3; n++){
            for(int i = 0; i < 3; i++){
                System.out.print(m[n][i]+" ");
             }
             System.out.println();
        }
        System.out.print("Soma dos elementos da 3º coluna: ");
        int somaColuna3 = 0;
        for(int n = 0; n < 3; n++){
            somaColuna3 = somaColuna3 + m[n][2];
        }
        System.out.println(somaColuna3);
    }
}

