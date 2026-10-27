package br.fiap.calculadoraImc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcularIMCService {
    public double calcular(double altura, double peso){
        return peso/(altura * altura);
    }

    public String classificar(double imc){
        if (imc < 18.5){
            return "Abaixo do Peso";
        } else if (imc <= 24.9) {
            return "Peso Normal";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc <= 39.9){
            return "obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
