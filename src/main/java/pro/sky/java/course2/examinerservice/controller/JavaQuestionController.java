package pro.sky.java.course2.examinerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.examinerservice.domain.Question;
import pro.sky.java.course2.examinerservice.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }


    @GetMapping("add?question=QuestionText&answer=QuestionAnswer”")
    public Question addQuestion(String question, String answer) {
        return null;
    }

    Collection<Question> getQuestions() {
        return null;
    }

    @GetMapping("remove?question=QuestionText&answer=QuestionAnswer”")
    Question removeQuestion(String question, String answer) {
        return null;
    }
}
