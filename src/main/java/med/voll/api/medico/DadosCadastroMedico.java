package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.endereço.DadosEndereço;

public record DadosCadastroMedico(

       @NotBlank
       String nome,

       @NotBlank
       @Email
       String email,

       @NotBlank
       @Pattern(regexp = "\\d{4,6}")
       String crm,

       @NotNull
       Especialidade especialidade,

       @NotNull
       @Valid
       DadosEndereço endereço) {
}
