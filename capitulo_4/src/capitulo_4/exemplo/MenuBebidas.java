package capitulo_4.exemplo;

//@author Allan Toledo

import java.util.Scanner;

public class MenuBebidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha uma bebida!");
        System.out.println("1: Coca-Cola");
        System.out.println("2: Pepsi");
        System.out.println("3: Suco Kapo");
        
        System.out.println("");
        
        int opcao = sc.nextInt();
        float preco = 0;
        String bebida = "";
        switch(opcao) {
            case 1:
                bebida = "Coca-Cola";
                preco = 4.5f;
                break;
            case 2:
                bebida = "Pepsi";
                preco = 4f;
                break;
            case 3:
                bebida = "Suco Kapo";
                preco = 3.33f;
                break;
            default:
                System.out.println("Bebida não encontrada :/");
        }
        
        if(preco > 0f) {
            System.out.printf("%s R$ %.2f\n\n", bebida, preco);
        }
    }
}
