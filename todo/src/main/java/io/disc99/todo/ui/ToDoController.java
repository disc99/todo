package io.disc99.todo.ui;

import io.disc99.todo.application.Add;
import io.disc99.todo.application.Do;
import io.disc99.todo.application.Modify;
import io.disc99.todo.application.TodoService;
import io.disc99.todo.domain.Doing;
import io.disc99.todo.domain.TodoId;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TodoController {

    TodoService todoService;

    @PostMapping("/add")
    void add(@RequestBody AddRequest request) {
        todoService.add(new Add(new Doing(request.getDoing())));
    }

    @PutMapping("/modify")
    void modify(String id, String doing) {
        todoService.modify(new Modify(new TodoId(id), new Doing(doing)));
    }

    @PostMapping("/do")
    void done(String id) {
        todoService.doit(new Do(new TodoId(id)));
    }

}
