package begin.lsi.ufcg.edu.br.begin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    private String id;
    @Column
    private String title;
    @Column
    private Boolean completed;
    @Column(name = "order_id")
    private Integer order;

    public Task() {
    }

    public Task(TaskInfo TaskInfo) {
        this.title = TaskInfo.getTitle();
        this.completed = TaskInfo.isCompleted();
        this.order = TaskInfo.getOrder();
    }

    public Task(String title) {
        this.title = title;
    }

    public Task(String id, String title, Boolean completed, Integer order) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return nonNull(completed, false);
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getOrder() {
        return nonNull(order, 0);
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Task merge(Task newTask) {
        return new Task(id,
                nonNull(newTask.title, title),
                nonNull(newTask.completed, completed),
                nonNull(newTask.order, order));
    }


    private <T> T nonNull(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                ", order=" + order +
                '}';
    }
}
