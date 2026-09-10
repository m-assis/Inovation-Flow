package org.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class GeminiService {

    @Value("${gemini.api.key}")
    private String apiKey;

    @Value("${gemini.api.url}")
    private String apiUrl;

    public String chamadaGemini(String promptUsuario) {
        RestTemplate restTemplate = new RestTemplate();

        String urlCompleta = apiUrl + "?key=" + apiKey;

        Map<String, Object> parteTexto = Map.of("text", promptUsuario);
        Map<String, Object> conteudo = Map.of("parts", List.of(parteTexto));
        Map<String, Object> corpoRequisicao = Map.of("contents", List.of(conteudo));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> entidadeRequisicao = new HttpEntity<>(corpoRequisicao, headers);

        try {
            ResponseEntity<Map> resposta = restTemplate.postForEntity(urlCompleta, entidadeRequisicao, Map.class);
            return resposta.getBody().toString();
        } catch (Exception e) {
            return "Erro ao se comunicar com o Gemini: " + e.getMessage();
        }
    }
}
