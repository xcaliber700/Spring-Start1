package com.example.springspring2.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
