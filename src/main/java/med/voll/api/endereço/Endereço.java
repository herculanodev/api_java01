package med.voll.api.endereço;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Endereço {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    // Construtor que recebe DadosEndereço
    public Endereço(DadosEndereço dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }

    public void atualizarInformacoes(DadosEndereço dados) {
        Optional.ofNullable(dados.logradouro()).ifPresent(logradouro -> this.logradouro = logradouro);
        Optional.ofNullable(dados.bairro()).ifPresent(bairro -> this.bairro = bairro);
        Optional.ofNullable(dados.cep()).ifPresent(cep -> this.cep = cep);
        Optional.ofNullable(dados.cidade()).ifPresent(cidade -> this.cidade = cidade);
        Optional.ofNullable(dados.uf()).ifPresent(uf -> this.uf = uf);
        Optional.ofNullable(dados.complemento()).ifPresent(complemento -> this.complemento = complemento);
        Optional.ofNullable(dados.numero()).ifPresent(numero -> this.numero = numero);
    }

}