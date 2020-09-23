package com.codetree.service;

import com.codetree.domain.Student;

import java.util.List;

public interface IStuService {
    //业务层查询所有学生信息接口
    List<Student> findAllStu();
}
