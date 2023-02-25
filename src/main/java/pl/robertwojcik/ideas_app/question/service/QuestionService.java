package pl.robertwojcik.ideas_app.question.service;

import org.springframework.stereotype.Service;
import pl.robertwojcik.ideas_app.IdeasConfiguration;
import pl.robertwojcik.ideas_app.question.model.Question;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionService {

    private final IdeasConfiguration ideasConfiguration;

    public QuestionService(IdeasConfiguration ideasConfiguration) {
        this.ideasConfiguration = ideasConfiguration;
    }

    public List<Question> getQuestions() {
        return Arrays.asList(new Question("Question 1"), new Question("Question 2"));
    }

    public String test(String value) {
        return String.format("Hello %s %s", ideasConfiguration.getName(), value);
    }

    public Question getQuestion(UUID id) {
        return  null;
    }

    public Question createQuestion(Question question) {
        return null;
    }
    public Question updateQuestion(UUID id, Question question) {
        return null;
    }

    public Question deleteQuestion(UUID id) {
        return null;
    }
}
