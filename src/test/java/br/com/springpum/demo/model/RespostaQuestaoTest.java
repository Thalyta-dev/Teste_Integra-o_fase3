package br.com.springpum.demo.model;

import br.com.springpum.demo.repository.Resposta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class RespostaQuestaoTest {


    @Autowired
    private Resposta resposta;


    @Test
    public void deveRetornarAluno(){
      List<RespostaQuestao> respostaQuestaoList =  resposta.respostaAlunoId(1L);
        Assertions.assertEquals(respostaQuestaoList.size(), 1);

    }

    @Test
    public void  deveRetornarListaDeRespostaVazia(){

        List<RespostaQuestao> respostaQuestaoList=  resposta.respostaAlunoId(10L);
        Assertions.assertEquals(respostaQuestaoList.size(), 0);
    }

    @Test
    public void deveRetornarListaMaiorQueUm(){

        List<RespostaQuestao> respostaQuestaoList=  resposta.respostaAlunoId(2L);
        Assertions.assertTrue(respostaQuestaoList.size() > 1);

    }

}