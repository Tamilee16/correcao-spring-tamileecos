package tamileecosta.repositories;

import org.springframework.data.repository.CrudRepository;
import tamileecosta.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
}