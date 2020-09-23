package com.codetree.service.impl;

import com.codetree.dao.IStudentDao;
import com.codetree.domain.Student;
import com.codetree.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuService")
public class StuServiceImpl implements IStuService{
    @Autowired
    private IStudentDao studentDao;
    @Override
    public List<Student> findAllStu() {
        System.out.println("业务层：查询所有学生信息");
        List<Student> allStu = studentDao.findAllStu();
        return allStu;
    }
}
