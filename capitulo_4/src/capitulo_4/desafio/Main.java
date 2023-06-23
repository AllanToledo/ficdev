package capitulo_4.desafio;

//@author Allan Toledo

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    //Resolução problema 1244
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      List<List<String>> frases = new ArrayList();
      
      int i = 0;
      while(i++ < n){
          String linha = sc.nextLine();
          List<String> frase = new ArrayList(Arrays.asList(linha.split(" ")));
          Collections.sort(frase, (p1, p2) -> {
              return p2.length() - p1.length();
          });
          frases.add(frase);
      }
      
      Collections.sort(frases, (f1, f2) -> {
          return f2.get(0).length() - f1.get(0).length();
      });
     
      
      for(List<String> frase: frases){
          for(String palavra: frase){
              System.out.printf("%s ", palavra);
          }
          System.out.println("");
      }
    }
}
