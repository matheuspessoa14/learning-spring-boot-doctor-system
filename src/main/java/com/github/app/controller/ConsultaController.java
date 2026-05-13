package com.github.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.app.model.consulta.Consulta;
import com.github.app.model.consulta.ConsultaRepository;
import com.github.app.model.consulta.DadosAgendamentoConsulta;
import com.github.app.model.medico.MedicoRepository;
import com.github.app.model.paciente.PacienteRepository;


@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public Consulta agendar(@RequestBody DadosAgendamentoConsulta dados) {
        // pegar o id do médico
        var medico = medicoRepository.getReferenceById(dados.medicoId());

        // pegar o id do paciente
        var paciente = pacienteRepository.getReferenceById(dados.pacienteId());

        // agendar a consulta
        var consulta = new Consulta(dados);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);

        return consultaRepository.save(consulta);
    }
}
