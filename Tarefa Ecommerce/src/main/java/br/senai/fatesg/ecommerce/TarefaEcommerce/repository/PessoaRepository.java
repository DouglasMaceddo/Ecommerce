package br.senai.fatesg.ecommerce.TarefaEcommerce.repository;

import br.senai.fatesg.ecommerce.TarefaEcommerce.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Integer> {
}
