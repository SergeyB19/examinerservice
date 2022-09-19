package pro.sky.java.course2.examinerservice.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.examinerservice.exception.QuestionAlreadyExistsException;
import pro.sky.java.course2.examinerservice.exception.QuestionNotFoundException;
import pro.sky.java.course2.examinerservice.model.Question;
import pro.sky.java.course2.examinerservice.service.impl.JavaQuestionService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    private final QuestionService questionService = new JavaQuestionService();

    @AfterEach
    public void afterEach() {
        questionService.getAll().forEach(questionService::remove);
    }

    @Test
    public void addTest() {
        int size = questionService.getAll().size();
        assertThat(size).isGreaterThan(0);

        Question expected1 = new Question("Q1", "A1");
        Question expected2 = new Question("Q2", "A2");
        questionService.add(expected1);
        questionService.add(expected2.getQuestion(), expected2.getAnswer());

        assertThat(questionService.getAll()).hasSize(size + 2);
        assertThat(questionService.getAll()).contains(expected1, expected2);
    }

    @Test
    public void addNegativeTest() {
        assertThat(questionService.getAll()).isEmpty();

        Question expected = addOneQuestion();

        assertThatExceptionOfType(QuestionAlreadyExistsException.class)
                .isThrownBy(() -> questionService.add(expected));

        assertThatExceptionOfType(QuestionAlreadyExistsException.class)
                .isThrownBy(() -> questionService.add(expected.getQuestion(), expected.getAnswer()));

    }


    @Test
    public void removeTest() {
        assertThat(questionService.getAll()).isEmpty();

        Question expected = addOneQuestion();

        assertThatExceptionOfType(QuestionNotFoundException.class)
                .isThrownBy(() -> questionService.remove(new Question("Q2", "A2")));

        questionService.remove(expected);
        assertThat(questionService.getAll()).isEmpty();
    }

    private Question addOneQuestion() {
        Question expected = new Question("Q1", "A1");
        questionService.add(expected);

        assertThat(questionService.getAll()).hasSize(1);
        assertThat(questionService.getAll()).contains(expected);

        return expected;
    }

}