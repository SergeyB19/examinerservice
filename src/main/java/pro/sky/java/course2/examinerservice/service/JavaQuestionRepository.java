package pro.sky.java.course2.examinerservice.service;

import org.springframework.stereotype.Repository;
import pro.sky.java.course2.examinerservice.domain.Question;

import java.util.Collection;
import java.util.Set;

@Repository
public interface JavaQuestionRepository {
    Set<Question> questions = null;


    JavaQuestionRepository();

    void init();

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

}
