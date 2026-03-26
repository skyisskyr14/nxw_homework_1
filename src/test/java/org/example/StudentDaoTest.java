package org.example;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDaoTest {

    @Test
    void testPrintStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = context.getBean("student", Student.class);
        student.setSname("张三");
        student.setSno("2026001");
        student.setSgender("男");
        student.setCname("计算机学院");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // 确认DI注入的就是当前已初始化的student对象
        ((StudentDaoImpl) studentDao).setStudent(student);

        studentDao.myPrintln("这段参数会被实现类忽略");
    }
}
