package com.codetree.dao;

import com.codetree.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {
    //持久层查询所有学生信息
    @Select("select * from student")
    List<Student> findAllStu();
}
