package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp = "i am here in the hello handler with thread name " + Thread.currentThread().getName();
        exchange.sendResponseHeaders(200, resp.length()); // ok
        OutputStream o = exchange.getResponseBody();
        o.write(resp.getBytes());
        o.flush();
        o.close();
    }
}
