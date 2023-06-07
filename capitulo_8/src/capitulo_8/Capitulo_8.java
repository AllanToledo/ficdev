/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ficdev
 */
public class Capitulo_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }  catch (FileNotFoundException ex) {
            Logger.getLogger(Capitulo_8.class.getName()).log(Level.SEVERE, "Não foi possível abrir o arquivo.", ex);
        } catch (IOException ex) {
            Logger.getLogger(Capitulo_8.class.getName()).log(Level.SEVERE, "Erro na leitura do arquivo.", ex);
        }
    }

}
