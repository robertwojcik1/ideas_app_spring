package pl.robertwojcik.ideas_app.question.service;

import org.springframework.stereotype.Service;
import pl.robertwojcik.ideas_app.IdeasConfiguration;
import pl.robertwojcik.ideas_app.question.model.Question;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionService {

    public List<Question> getQuestions() {
        return Arrays.asList(new Question("Question 1"), new Question("Question 2"));
    }

    public Question getQuestion(UUID id) {
        return  new Question("Question" + id);
    }

    public Question createQuestion(Question question) {
        question.setId(UUID.randomUUID());

        return question;
    }
    public Question updateQuestion(UUID id, Question question) {
        return question;
    }

    public Question deleteQuestion(UUID id) {
        return null;
    }
}
