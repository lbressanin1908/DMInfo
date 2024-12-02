package org.application.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.application.DTO.DigimonDto;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.util.List;

public class ApiService {

    public DigimonDto getDigimon(String name) {
        DigimonDto digimonDto = null;

        try {
            // Configura o HttpClient para seguir redirecionamentos automaticamente
            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS) // Sempre seguir redirecionamentos
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://digi-api.com/api/v1/digimon/" + name))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verifica o código de status da resposta
            if (response.statusCode() == 200) {
                // Verifica se a resposta é JSON
                if (response.body().trim().startsWith("{") || response.body().trim().startsWith("[")) {
                    ObjectMapper mapper = new ObjectMapper();
                    digimonDto = mapper.readValue(response.body(), DigimonDto.class);
                } else {
                    System.out.println("Resposta não é JSON: " + response.body());
                }
            } else {
                System.out.println("Erro na requisição: Código de status " + response.statusCode());
                HttpHeaders headers = response.headers();
                List<String> location = headers.allValues("Location");
                if (!location.isEmpty()) {
                    System.out.println("Redirecionado para: " + location.get(0));
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        return digimonDto;
    }
}
