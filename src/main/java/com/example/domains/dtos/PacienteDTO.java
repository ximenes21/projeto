package com.example.domains.dtos;

import com.example.domains.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {

    private long id;

    @NotNull (message = "O campo nome nao pode ser nulo")
    @NotBlank (message = "O campo nome nao pode ser vazio")
    private String nome;

    @NotNull (message = "O campo dataNascimento nao pode ser nulo")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull
    @Digits(integer = 15, fraction = 2)
    private BigDecimal custoInternacao;

    public PacienteDTO() {

    }

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.dataNascimento = paciente.getDataNascimento();
        this.custoInternacao = paciente.getCustoInternacao();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome nao pode ser nulo") @NotBlank(message = "O campo nome nao pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome nao pode ser nulo") @NotBlank(message = "O campo nome nao pode ser vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo dataNascimento nao pode ser nulo") LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotNull(message = "O campo dataNascimento nao pode ser nulo") LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull @Digits(integer = 15, fraction = 2) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(@NotNull @Digits(integer = 15, fraction = 2) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }
}
