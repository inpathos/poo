class fibonacci {
    public static void main(String[] args) {
        int fib1 = 1, fib2 = 1;
        while(fib1 < 101){
            System.out.println(fib1 + "\n" + fib2);
            fib1 += fib2;
            fib2 += fib1;
        }
    }

}

/*
    Imprima os primeiros números da série de Fibonacci até passar de 100.

    A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc...

    Para calculá-la, o primeiro elemento vale 0, o segundo vale 1,
    daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao
    (n-2)-ésimo elemento (ex: 8 = 5 + 3)
*/
