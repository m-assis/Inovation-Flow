package org.example.controller;

import org.example.service.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeminiController {

    @Autowired
    private GeminiService geminiService;

    @GetMapping("/perguntar")
    public String perguntarAoGemini(@RequestParam(value = "mensagem", defaultValue = "Olá, Gemini! Tudo bem?") String mensagem) {
        return geminiService.chamadaGemini(mensagem);
    }
}
