

class somatorio {
    public static void main(String[] args) {
        int soma = 0, i;

        for(i = 1; i < 1000; i++){
            //System.out.print(i + " + ");
            soma += i;
            if(i > 3) System.out.println("1 + 2 + ... + " + (i-1) + " + " + i + " = " + soma);
            else System.out.println(soma);
        }
    }

}

/*
    Imprima a soma de 1 até 999
*/
