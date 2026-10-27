package br.fiap.calculadoraImc.controller;

import br.fiap.calculadoraImc.service.CalcularIMCService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imc")
public class CalcularImcController {
    private final CalcularIMCService imcService;

    public CalcularImcController(CalcularIMCService imcService) {
        this.imcService = imcService;
    }

    @GetMapping("/calcular")
    public double calcular(double peso, double altura) {
        return imcService.calcular(peso, altura);
    }

    @GetMapping("/classificar")
    public String classificar(double imc){
        return imcService.classificar(imc);
    }
}

