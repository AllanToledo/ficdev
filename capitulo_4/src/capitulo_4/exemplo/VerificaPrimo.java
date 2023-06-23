package capitulo_4.exemplo;

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int possivelPrimo = sc.nextInt();
        
        boolean ehPrimo = possivelPrimo > 1;
        int raiz = (int) Math.round(Math.sqrt(possivelPrimo)) + 1;
        for(int i = 2; i < raiz; i++){
            if(possivelPrimo % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if(ehPrimo) 
            System.out.printf("%d é primo\n", possivelPrimo);
        else
            System.out.printf("%d não é primo\n", possivelPrimo);
    }
}
