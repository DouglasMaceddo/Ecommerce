package br.senai.fatesg.ecommerce.TarefaEcommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends BaseModel{
    private String cpf;
}
