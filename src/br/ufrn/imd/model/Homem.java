package br.ufrn.imd.model;

public class Homem extends Pessoa {
    @Override
    public String calcularIMC() {
        double imc = peso / (altura * altura);

        if(imc <= 20.7) {
            return "Abaixo do peso ideal";
        } else if(imc > 20.7 && imc < 26.4) {
            return "Peso ideal";
        } else if(imc >= 26.4) {
            return "Acima do peso ideal";
        }
        return "Erro";
    }
}
