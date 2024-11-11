package med.voll.api.medico;

import med.voll.api.endereço.Endereço;

public record DadosDetalhamentoMedico(Long id, String nome, String crm, Especialidade especialidade, Endereço endereço) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereço());
    }
}
