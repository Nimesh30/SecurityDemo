package com.Spring.SecurityDemo.Controller;

import com.Spring.SecurityDemo.Entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Nimesh",60),
            new Student(2,"Vishal",80)));
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("students")
    public Student addStudents(@RequestBody  Student student){
        students.add(student);
        return student;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
