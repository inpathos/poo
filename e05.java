import java.util.Scanner;


class fatorial {

    private static int fatorial(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, n;

        n = teclado.nextInt();
        if(n > 0){
            System.out.println(n + "! = " + fatorial(n));
        }
    }

}

/*
    Escreva um programa recebe um valor N inteiro e que,
    se N for positivo, retorna o fatorial de N (N!).

    Se não for possível calcular o fatorial,
    a função deve imprimir uma mensagem e retornar o valor -1.
*/
