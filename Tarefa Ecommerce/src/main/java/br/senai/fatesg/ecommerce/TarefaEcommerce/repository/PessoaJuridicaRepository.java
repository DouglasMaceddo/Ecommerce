package br.senai.fatesg.ecommerce.TarefaEcommerce.repository;

import br.senai.fatesg.ecommerce.TarefaEcommerce.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository  extends JpaRepository<PessoaJuridica, Integer> {
}
