package com.example.demo;

import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setName("hhh");
        System.out.println(student);
    }

}
