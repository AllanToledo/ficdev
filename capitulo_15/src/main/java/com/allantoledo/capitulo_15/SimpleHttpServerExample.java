package com.allantoledo.capitulo_15;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServerExample {

    public static void main(String[] args) throws
            IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/api/ola", new MyHandler());
        server.start();
        System.out.println("Started. Visit http://localhost:8080/api/ola");
    }

    static class MyHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello guys, it's me, your friend(nobodys remember)!!";
            exchange.sendResponseHeaders(200,
                    response.getBytes().length);
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.close();
        }
    }
}
