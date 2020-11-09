package com.yangjie.dao;

import com.yangjie.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface StudentDao {

    public int insert(Student student);


}
