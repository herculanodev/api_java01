package med.voll.api.paciente;

import med.voll.api.endereço.DadosEndereço;
import med.voll.api.endereço.Endereço;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, DadosEndereço endereço) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                new DadosEndereço(
                        paciente.getEndereço().getLogradouro(),
                        paciente.getEndereço().getBairro(),
                        paciente.getEndereço().getCep(),
                        paciente.getEndereço().getCidade(),
                        paciente.getEndereço().getUf(),
                        paciente.getEndereço().getComplemento(),
                        paciente.getEndereço().getNumero()
                )
        );
    }
}
