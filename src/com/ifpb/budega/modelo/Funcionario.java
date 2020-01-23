package com.ifpb.budega.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario {

    private String cpf;
    private String nome;
    private LocalDate ingresso;

    public Funcionario(String cpf, String nome, LocalDate ingresso) {
        this.cpf = cpf;
        this.nome = nome;
        this.ingresso = ingresso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIngresso() {
        return ingresso;
    }

    public void setIngresso(LocalDate ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(cpf, that.cpf) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(ingresso, that.ingresso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, ingresso);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", ingresso=" + ingresso +
                '}';
    }
}
