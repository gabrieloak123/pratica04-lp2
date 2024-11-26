package br.ufrn.imd.model;

public class Mulher extends Pessoa{
    @Override
    public String calcularIMC() {
       double imc = peso / (altura * altura);

       if(imc < 19) {
           return "Abaixo do peso ideal";
       } else if(imc >= 18 && imc < 25.8) {
           return "Peso ideal";
       } else if(imc >= 25.8) {
           return "Acima do peso ideal";
       }
       return "Erro";
    }
}
