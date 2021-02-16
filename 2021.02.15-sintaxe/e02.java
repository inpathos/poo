import java.util.Scanner;


class qualMaior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior, R, S, T;

        System.out.println("Digite R: ");
        R = teclado.nextInt();
        maior = R;
        System.out.println("Digite S: ");
        S = teclado.nextInt();
        if(S > maior) maior = S;
        System.out.println("Digite T: ");
        T = teclado.nextInt();
        if(T > maior) maior = T;

        System.out.println("O maior numero digitado é: " + maior);

    }

}

/*
    Escreva um programa que efetue a leitura de três valores reais
    R, S e T, imprimindo qual deles é o maior
*/
