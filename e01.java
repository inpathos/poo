import java.util.Scanner;


class qtsNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, n, atual, negativos;

        System.out.println("Digite n: ");
        n = teclado.nextInt();
        negativos = 0;

        for(i = 0; i < n; i++){
            atual = teclado.nextInt();
            if(atual < 0) negativos++;
        }

        System.out.println("Dos "+ n + " valores digitados, " + negativos + " são negativos.");

    }

}

/*  Escreva um programa que recebe como parâmetro um número inteiro n.
    A função deve ler n valores do teclado e
    retornar quantos destes valores são negativos.
*/
