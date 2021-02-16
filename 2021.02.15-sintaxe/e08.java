import java.util.Scanner;


class quadradoMagico {
    private static bool isQuadradoMagico(int[][] m, int n){
        int i, j, soma, atual = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                atual += m[i][j];
            }
            soma = atual;
        }
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, i, j;
        n = teclado.nextInt();
        int[][] matriz = new int[n][n];
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }

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
