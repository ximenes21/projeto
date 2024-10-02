package com.example.services;

import com.example.domains.Medico;
import com.example.domains.Paciente;
import com.example.repositories.MedicoRepository;
import com.example.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;

    @Autowired
    private PacienteRepository pacienteRepo;

    public void initDB(){

        Medico medico01 = new Medico(0, "Evandro Silvares", LocalDate.of(2024,9,10), new BigDecimal("15000.00"));
        Medico medico02 = new Medico(0, "Ricardo Jesus", LocalDate.of(2024,9,24), new BigDecimal("12000.00"));
        Medico medico03 = new Medico(0, "Sergio De Souza", LocalDate.of(2024,9,20), new BigDecimal("22000.00"));

        Paciente paciente01 = new Paciente(0, "Carlos de Souza", LocalDate.of(1980,9,25), new BigDecimal("5000.00"));
        Paciente paciente02 = new Paciente(0, "Bianca Cardoso", LocalDate.of(1990,10,30), new BigDecimal("3000.00"));
        Paciente paciente03 = new Paciente(0, "Beatriz Miranda", LocalDate.of(2000,6,14), new BigDecimal("8000.00"));

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);
        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        pacienteRepo.save(paciente03);

    }
}
