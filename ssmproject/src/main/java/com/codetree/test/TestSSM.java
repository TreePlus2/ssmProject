package com.codetree.test;

import com.codetree.dao.IStudentDao;
import com.codetree.domain.Student;
import com.codetree.service.IStuService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestSSM {

    @Test
    public void testSpring(){
        //加载配置文件，创建IoC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取Bean
        IStuService stuService = (IStuService) applicationContext.getBean("stuService");
        //调用方法
        stuService.findAllStu();
    }

    @Test
    public void testMybatis() throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        IStudentDao dao = sqlSession.getMapper(IStudentDao.class);
        List<Student> allStu = dao.findAllStu();
        for (Student student : allStu) {
            System.out.println(student);
        }
        sqlSession.close();
        in.close();
    }
}
