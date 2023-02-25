package pl.robertwojcik.ideas_app.question.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.robertwojcik.ideas_app.question.service.QuestionService;
import pl.robertwojcik.ideas_app.question.model.Question;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("questions")
public class QuestionController {

    private final QuestionService questionsService;

    public QuestionController(QuestionService questionsService) {
        this.questionsService = questionsService;
    }

    @GetMapping
    List<Question> getQuestions() {
        return questionsService.getQuestions();
    }

    @GetMapping("{id}")
    Question getQuestion(@PathVariable UUID id) {
        return questionsService.getQuestion(id);
    }
    @PostMapping
    Question createQuestion(@RequestBody Question question) {
        return questionsService.createQuestion(question);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("{id}")
    Question updateQuestion(@RequestParam UUID id, @RequestBody Question question) {
        return questionsService.updateQuestion(id, question);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    Question deleteQuestion(@RequestParam UUID id) {
        return questionsService.deleteQuestion(id);
    }
}
