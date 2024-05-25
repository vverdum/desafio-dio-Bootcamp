package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFnicial = dataInicial.plusDays(45);
    private Set<Dev>devsInscritos = new HashSet<>();
    private Set<Conteudo>conteudos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public LocalDate getDataFnicial() {
        return dataFnicial;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicial(), bootcamp.getDataInicial()) && Objects.equals(getDataFnicial(), bootcamp.getDataFnicial()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDataFnicial(), getDevsInscritos(), getConteudos());
    }
}
