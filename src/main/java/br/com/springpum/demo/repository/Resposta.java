package br.com.springpum.demo.repository;


import br.com.springpum.demo.model.RespostaQuestao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface Resposta extends CrudRepository<RespostaQuestao,Long> {

        @Query(value = "select * from resposta_questao r where r.aluno_id = :id", nativeQuery = true)
        Optional<List<RespostaQuestao>> respostaAlunoId(Long id);


}
