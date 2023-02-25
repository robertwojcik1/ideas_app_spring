package pl.robertwojcik.ideas_app.question.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Question {

    private String name;
    private UUID id;

    public Question() {
    }

    public Question(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }
}
