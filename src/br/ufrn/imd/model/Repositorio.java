package br.ufrn.imd.model;

import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Pessoa> pessoas;

    public Repositorio() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void add(Pessoa p) {
        pessoas.add(p);
    }

    public void relatorio() {
        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
            System.out.println("-------------------------------------------------------");
        }
    }
}
