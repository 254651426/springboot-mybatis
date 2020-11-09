package com.yangjie;

import com.yangjie.entity.Student;
import com.yangjie.service.StudentService;
import com.yangjie.springbootmybatis.SpringbootMybatisApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class Test1 {

    @Autowired
    private StudentService studentService;

    @org.junit.Test
    public void contextLoads() {
        Student s = new Student();
        s.setName("yyjj");
        studentService.insert(s);
    }
}
