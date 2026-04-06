package Vetores;
public class vetor2 {
    public static void main(String[] args) {
        int n = 5; //tamanho do vetor 
        int v[] = new int[n]; //declaração e alocação de espaço para o vetor 
        int i; //indice ou posição
        // preenchendo o vetor com os "n" elementos do vetor "v"
        for (i=0; i<n; i++){
            v[i] = i;
        }
        //imprimindo o vetor
        for (i=0; i<n; i++){
            System.out.println(v[i]);
        }
    }
}
