package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereço.Endereço;

import java.util.Optional;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "crm", nullable = false, unique = true)
    private String crm;

    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade", nullable = false)
    private Especialidade especialidade;

    @Embedded
    private Endereço endereço;

    private String telefone;

    private Boolean ativo;


    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.crm = dados.crm();
        this.email = dados.email();
        this.endereço = new Endereço(dados.endereço());
        this.especialidade = dados.especialidade();
        this.telefone =  dados.telefone();
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        Optional.ofNullable(dados.nome()).ifPresent(nome -> this.nome = nome);
        Optional.ofNullable(dados.telefone()).ifPresent(telefone -> this.telefone = telefone);
        Optional.ofNullable(dados.endereço()).ifPresent(endereco -> this.endereço.atualizarInformacoes(endereco));
    }


    public void excluir() {
        this.ativo = false;

    }
}