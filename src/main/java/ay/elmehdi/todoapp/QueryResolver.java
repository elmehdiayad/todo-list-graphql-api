package ay.elmehdi.todoapp;

import ay.elmehdi.todoapp.model.Todo;
import ay.elmehdi.todoapp.service.TodoServiceImpl;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private TodoServiceImpl todoService;
    public List<Todo> getTodos() {
        return this.todoService.getAllTodos();
    }
    public Optional<Todo> getTodo(int id) {
        return this.todoService.getTodo(id);
    }
}