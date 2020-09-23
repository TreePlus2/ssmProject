package com.codetree.controller;

import com.codetree.domain.Student;
import com.codetree.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/findAllStu")
    public String findAllStu(Model model){
        System.out.println("控制层：查询所有账户");
        //调用业务层
        List<Student> allStu = stuService.findAllStu();
        for (Student student : allStu) {
            System.out.println(student);
        }
        model.addAttribute("allStu",allStu);
        return "success";
    }
}
