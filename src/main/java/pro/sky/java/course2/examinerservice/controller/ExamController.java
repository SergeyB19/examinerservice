package pro.sky.java.course2.examinerservice.controller;

import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.examinerservice.service.ExaminerService;

@RestController
public class ExamController  {
    ExaminerService examinerService;


    void getQuestions(int amount) {
    }
}
