package com.yangjie.controller;

import com.yangjie.entity.Student;
import com.yangjie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/show")
    public String hello() {
        Student s = new Student();
        s.setName("yj");
        studentService.insert(s);
        return studentService.show();
    }
}
