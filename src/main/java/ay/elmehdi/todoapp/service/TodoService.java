package ay.elmehdi.todoapp.service;

import ay.elmehdi.todoapp.model.Todo;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
public interface TodoService {


    @NotNull Iterable<Todo> getAllTodos();

    Optional<Todo> getTodo(@Min(value = 1L, message = "Invalid todo ID.") int id);

    Todo save(Todo todo);
}
