package com.github.app.model.consulta;

import java.time.LocalDateTime;

import com.github.app.model.medico.Medico;
import com.github.app.model.paciente.Paciente;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "consultas")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "medicoId") // Define o nome da coluna "alias" na tabela consulta, ou seja, pega a PK do médico e transforma em FK em consulta com o nome da coluna de medicoId
    @ManyToOne
    private Medico medico;

    @JoinColumn(name = "pacienteId")
    @ManyToOne
    private Paciente paciente;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String observacao;

    private LocalDateTime data;

    public Consulta(DadosAgendamentoConsulta dados){
        // this.medico = new Medico(dados.medicoId());
        // this.paciente = new Paciente(dados.pacienteId());
        this.data = dados.data();
        this.status = Status.AGENDADA;
    }


}