package br.senai.fatesg.ecommerce.TarefaEcommerce.repository;

import br.senai.fatesg.ecommerce.TarefaEcommerce.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
}
