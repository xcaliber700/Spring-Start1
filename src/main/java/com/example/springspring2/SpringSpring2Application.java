package com.example.springspring2;

import com.example.springspring2.conf.AppConfig;
import com.example.springspring2.conf.StudentConfig;
import com.example.springspring2.model.Game;
import com.example.springspring2.model.Student;
import com.example.springspring2.model.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.example.springspring2")
public class SpringSpring2Application {
    private Student student;

    public SpringSpring2Application(Student student) {
        this.student = student;
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.springspring2");
        Game game =context.getBean(Game.class);
        System.out.println(game.playGame());
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.example.springspring2.conf");  //(AppConfig.class, StudentConfig.class);
////        Game game = context.getBean("game", Game.class);
////        Team raptors = context.getBean("raptors", Team.class);
////        System.out.println("context.getBean(Student.class) = " + context.getBean(Student.class));
////        System.out.println(raptors);
////        System.out.println("game = " + game.playGame(raptors));
//
//        Student student = context.getBean(Student.class);
//        Team team = context.getBean("home",Team.class);
//        System.out.println(team);
//        System.out.println(student);
//
//        context.registerShutdownHook(); // to call destroy method

    }

}
