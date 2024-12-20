package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereço.DadosEndereço;

public record DadosAtualizacaoMedico(

          @NotNull
          Long id

        , String nome

        , String telefone

        , DadosEndereço endereço)

{



}
