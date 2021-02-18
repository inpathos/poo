import java.util.Scanner;


class quadradoMagico {
    private static Boolean isQuadradoMagico(int[][] matriz, int dimensao){
        int i, j, linha, coluna, diagonal1 = 0, diagonal2 = 0;
        for(i = 0; i < dimensao; i++) diagonal1 += matriz[i][i];
        for(i = 0; i < dimensao; i++){
            linha = 0;
            for(j = 0; j < dimensao; j++){
                linha += matriz[i][j];
                if(i + j == dimensao - 1) diagonal2 += matriz[i][j];
            }
            if(linha != diagonal1) return false;
        }
        if(diagonal2 != diagonal1) return false;
        for(j = 0; j < dimensao; j++){
            coluna = 0;
            for(i = 0; i < dimensao; i++) {
                coluna += matriz[i][j];
            }
            if(coluna != diagonal1) return false;
        }
        return true;
    }

    private static int[][] criarQuadradoMagico(int dimensao){
        int i, j;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os elementos do quadrado: ");
        int[][] matriz = new int[dimensao][dimensao];
        for(i = 0; i < dimensao; i++){
            for(j = 0; j < dimensao; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }
        return matriz;
    }

    private static void imprimeQuadradoMagico(int[][] matriz, int dimensao){
        int i, j;
        for(i = 0; i < dimensao; i++) {
            System.out.print("\t");
            for(j = 0; j < dimensao; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimensao, i, j;
        int[][] matriz;
        System.out.println("Digite a dimensão do quadrado: ");
        dimensao = teclado.nextInt();
        matriz = criarQuadradoMagico(dimensao);
        System.out.println("\nO quadrado digitado é:\n");
        imprimeQuadradoMagico(matriz, dimensao);
        System.out.println("\nÉ quadrado mágico? " + isQuadradoMagico(matriz, dimensao));

    }

}

/*

    Um quadrado mágico é uma matriz quadrada, de valores inteiros,
    na qual a soma dos elementos de cada linha, a soma dos elementos
    de cada coluna e a soma dos elementos da diagonal primária e
    da diagonal secundária são iguais.

    A matriz quadrada de ordem 4 abaixo é um exemplo de quadrado mágico,
    no qual todas as somas são iguais a 34:
    4   14  15  1
    9   7   6   12
    5   11  10  8
    16  2   3   13

    Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n
    e imprima se a matriz é um quadrado mágico ou não.

*/
