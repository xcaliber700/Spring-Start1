package com.example.springspring2.conf;

import com.example.springspring2.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
public class StudentConfig {


//    @Bean
//    public Student student(@Value("${student.name:'Baban'}")String stuName){
//        return new Student(stuName);
//    }
}
