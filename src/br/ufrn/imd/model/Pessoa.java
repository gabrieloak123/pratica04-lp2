package br.ufrn.imd.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected double altura;

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract String calcularIMC();

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String imc = String.format("%.2f", (peso / (altura*altura)));

        String output = "Nome: " + nome + "\n";
        output += "Data de nascimento: " + dateFormat.format(dataNascimento)  + "\n";
        output += "Peso: " + peso + "\n";
        output += "Altura: " + altura + "\n";
        output += "IMC: " + imc + " - " + calcularIMC();
        return output;
    }
}
