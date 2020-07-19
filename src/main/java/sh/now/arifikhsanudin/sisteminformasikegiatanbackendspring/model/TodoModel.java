package sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.model;

import javax.persistence.*;

@Entity
public class TodoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean done = false;

    public TodoModel() {}

    public TodoModel(String name) {
        this.name = name;
    }

    public TodoModel(String name, Boolean done) {
        this.name = name;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
