package sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.repository;

import org.springframework.data.repository.CrudRepository;
import sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.model.TodoModel;

public interface TodoRepository extends CrudRepository<TodoModel, Long> {

}
