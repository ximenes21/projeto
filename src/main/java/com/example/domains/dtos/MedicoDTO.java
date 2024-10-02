package com.example.domains.dtos;

import com.example.domains.Medico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MedicoDTO {

    private long id;

    @NotNull(message = "O campo nome nao pode ser nulo")
    @NotBlank(message = "O campo nome nao pode ser vazio")
    private String nome;

    @NotNull (message = "O campo dataContratacao nao pode ser nulo")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao;

    @NotNull
    @Digits(integer = 15, fraction = 2)
    private BigDecimal salario;

    public MedicoDTO() {

    }

    public MedicoDTO(Medico medico) {
        this.id = medico.getId();
        this.nome = medico.getNome();
        this.dataContratacao = medico.getDataContratacao();
        this.salario = medico.getSalario();
    }
}
