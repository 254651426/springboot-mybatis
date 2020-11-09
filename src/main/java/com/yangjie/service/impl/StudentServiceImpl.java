package com.yangjie.service.impl;

import com.yangjie.dao.StudentDao;
import com.yangjie.entity.Student;
import com.yangjie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public String show() {
        return "ni hao";
    }
}
