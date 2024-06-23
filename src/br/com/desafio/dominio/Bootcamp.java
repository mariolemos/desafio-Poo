package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Bootcamp {

    private String nome;
    private String descricai;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricai() {
        return descricai;
    }

    public void setDescricai(String descricai) {
        this.descricai = descricai;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricai, bootcamp.descricai) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricai, dataInicial, dataFinal);
    }
}
