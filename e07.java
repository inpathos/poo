import java.util.Scanner;


class howMeals {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, pessimas = 0, ruins = 0, boas = 0, otimas = 0;
        float porcento, total = 0;
        nota = teclado.nextInt();
        while (nota > 0 && nota < 100) {
            total++;
            if(nota < 25) pessimas++;
            else if(nota < 50) ruins++;
            else if(nota < 75) boas++;
            else if(nota < 101) otimas++;
            nota = teclado.nextInt();
        }
        porcento = pessimas/total * 100;
        System.out.println("Pessimas: " + porcento + "%");
        porcento = ruins/total * 100;
        System.out.println("Ruins: " + porcento + "%");
        porcento = boas/total * 100;
        System.out.println("Boas: " + porcento + "%");
        porcento = otimas/total * 100;
        System.out.println("Ótimas: " + porcento + "%");
    }

}

/*
    O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa
    com os funcionários pedindo que cada um avaliasse a qualidade das refeições
    informando uma nota de 0 a 100. O setor quer saber o percentual de
    funcionários que considera as refeições
    péssimas (nota entre 0 e 25),
    ruins (nota acima de 25 e até 50),
    boas (nota acima de 50 e até 75) e
    ótimas (acima de 75 até 100).

    Escreva um programa que leia as notas informadas e imprima
    o percentual de funcionários que votou em cada faixa.

    A entrada de dados deve terminar quando for lido um valor
    que não pertença a nenhum dos intervalos acima.

*/
