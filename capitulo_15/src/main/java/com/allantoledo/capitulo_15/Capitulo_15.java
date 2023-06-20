/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.allantoledo.capitulo_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ficdev
 */
public class Capitulo_15 {

    public static void main(String[] args) {
        try {
            //URL url = new URL("https://www.boredapi.com/api/activity");
            URL url = new URL("https://dontpad.com/pesquisauqe%C3%A9bomnadane");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String linha;
            StringBuilder resposta = new StringBuilder();
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }

            reader.close();
            System.out.println(resposta.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Capitulo_15.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(Capitulo_15.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Capitulo_15.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
