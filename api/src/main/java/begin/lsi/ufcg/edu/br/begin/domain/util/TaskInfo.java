package begin.lsi.ufcg.edu.br.begin.domain.util;

import org.omg.PortableInterceptor.INACTIVE;

public class TaskInfo {


    private String title;
    private boolean completed;
    private Integer order;

    public TaskInfo(String title, boolean completed, Integer order) {
        this.title = title;
        this.completed = completed;
        this.order = order;
    }


    public String getTitle() {
        return title;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public Integer getOrder() {
        return order;
    }
}
