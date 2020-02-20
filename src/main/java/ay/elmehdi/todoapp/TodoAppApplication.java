package ay.elmehdi.todoapp;

import ay.elmehdi.todoapp.model.Todo;
import ay.elmehdi.todoapp.service.TodoService;
import ay.elmehdi.todoapp.service.TodoServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(TodoServiceImpl todoService) {
        return args -> {
            todoService.save(new Todo("test1", true));
            todoService.save(new Todo("test2", true));
            todoService.save(new Todo("test3", false));
        };
    }
}
