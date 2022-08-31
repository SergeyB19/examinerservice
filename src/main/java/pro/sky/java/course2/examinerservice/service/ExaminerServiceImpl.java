package pro.sky.java.course2.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.examinerservice.domain.Question;
import java.util.Collection;
import java.util.Random;


@Service
public class ExaminerServiceImpl implements ExaminerService {
    Random random;

    QuestionService questionService;

    ExaminerServiceImpl(QuestionService questionService) {
    }

    public Collection<Question> getQuestions(int amount) {

        return null;
    }


}
/*Его задача: создать коллекцию и заполнить её с помощью вызова getRandomQuestion у QuestionService случайными вопросами. */
