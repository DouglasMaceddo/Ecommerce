package br.senai.fatesg.ecommerce.TarefaEcommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica extends BaseModel {
    private String cnpj;
}