package br.fiap.calculadoraImc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcularIMCService {
    public double calcular (double peso, double altura){
        return peso/(altura * altura);
    }

    public String classificar(double imc){
        if (imc < 18.50){
            return "Abaixo do Peso";
        } else if (imc <= 24.90) {
            return "Peso Normal";
        } else if (imc <= 29.90) {
            return "Sobrepeso";
        } else if (imc <= 34.90) {
            return "Obesidade grau I";
        } else if (imc <= 39.90){
            return "obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
