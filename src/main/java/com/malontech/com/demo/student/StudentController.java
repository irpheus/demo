package com.malontech.com.demo.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,"Edgar",
                        "work.edgarafundi@gmail.com",
                        LocalDate.of(1985, 2, 12),
                        21

                ));
    }
}
