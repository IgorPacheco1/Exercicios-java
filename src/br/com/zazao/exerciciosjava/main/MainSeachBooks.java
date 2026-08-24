package br.com.zazao.exerciciosjava.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSeachBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.googleapis.com/books/v1/volumes?q=culpadasestrelas&key=************
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o nome do livro");
        var titulo = leitura.nextLine();
        titulo = titulo.replace(" ","");
        String busca = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=**********";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
