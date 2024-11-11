package med.voll.api.domain.paciente;

import med.voll.api.domain.endereço.DadosEndereço;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        DadosEndereço ender