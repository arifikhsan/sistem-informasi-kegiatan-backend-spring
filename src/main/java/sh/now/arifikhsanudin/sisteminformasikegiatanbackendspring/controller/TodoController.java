package sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.model.TodoModel;
import sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.repository.TodoRepository;
import sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.view.MessageView;

@Controller
@RequestMapping(path = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<TodoModel> all() {
        return todoRepository.findAll();
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public TodoModel add(@RequestBody TodoModel todoModel) {
        return todoRepository.save(new TodoModel(todoModel.getName()));
    }

    @GetMapping(path = "/one/{id}")
    @ResponseBody
    public TodoModel one(@PathVariable Long id) {
        return todoRepository.findById(id).orElse(new TodoModel());
    }

    @PutMapping(path = "/update/{id}")
    @ResponseBody
    public TodoModel update(@PathVariable Long id, @RequestBody TodoModel newTodoModel) {
        todoRepository.findById(id).map(todoModel -> {
            todoModel.setName(newTodoModel.getName());
            todoModel.setDone(newTodoModel.getDone());
            return todoRepository.save(todoModel);
        });
        return todoRepository.findById(id).orElse(new TodoModel());
    }

    @DeleteMapping(path = "/destroy/{id}")
    @ResponseBody
    public ResponseEntity<MessageView> destroy(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return ResponseEntity.ok(new MessageView("Deleted"));
    }

}
