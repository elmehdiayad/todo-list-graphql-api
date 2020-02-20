package ay.elmehdi.todoapp.model;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Todo implements Serializable {


    @Id
    @GeneratedValue
    private int id;


    @NotNull(message = "todo title is required.")
    @Basic(optional = false)
    private String title;

    private boolean completed;

    public Todo(@NotNull(message = "todo title is required.") String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public Todo(){}

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
