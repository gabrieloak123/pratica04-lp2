package br.ufrn.imd.view;

import br.ufrn.imd.model.Homem;
import br.ufrn.imd.model.Mulher;
import br.ufrn.imd.model.Repositorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramaSaude {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Homem homem = new Homem();
        homem.setNome("Zé lezin");
        homem.setDataNascimento(formato.parse("20/01/1945"));
        homem.setPeso(74.8);
        homem.setAltura(1.75);

        Mulher mulher = new Mulher();
        mulher.setNome("Frida Khalo");
        mulher.setDataNascimento(formato.parse("06/07/1907"));
        mulher.setPeso(50.2);
        mulher.setAltura(1.69);

        Repositorio repositorio = new Repositorio();
        repositorio.add(homem);
        repositorio.add(mulher);

        repositorio.relatorio();
    }
}
