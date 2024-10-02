package com.example.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    private long id;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull
    @Digits(integer = 15, fraction = 2)
    private BigDecimal custoInternacao;

    public Paciente(){
        this.custoInternacao = BigDecimal.ZERO;
    }

    public Paciente(long id, String nome, LocalDate dataNascimento, BigDecimal custoInternacao) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.custoInternacao = custoInternacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
    }

    public @NotNull LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotNull LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull @Digits(integer = 15, fraction = 2) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(@NotNull @Digits(integer = 15, fraction = 2) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id == paciente.id && Objects.equals(nome, paciente.nome) && Objects.equals(dataNascimento, paciente.dataNascimento) && Objects.equals(custoInternacao, paciente.custoInternacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataNascimento, custoInternacao);
    }
}
