package com.example.springbootassingment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAssignmentApplication {

    public static void main(String[] args) {SpringApplication.run(SpringBootAssignmentApplication.class, args);
    }

    @GetMapping("foundationCourses")
    public String getCourses(@RequestParam(value = "foundation", defaultValue = "Computer literacy for science,elementary computer programming) String courses) {
        return new String("foundation,courses");
    }


    @GetMapping("undergraduateCourses")
    public String getUndergraduateCourses(@RequestParam(value = "undergraduate", defaultValue = "Advanced Programming,Computer Architecture and Organisation,Database Management Design,Data structures and algorithm") String courses) {
        return new String("undergraduate,courses");
    }

    @GetMapping("honoursCourses")
    public String getHonoursCourses(@RequestParam(value = "honours", defaultValue = "Distribution and Parllel Computing,Advanced Java,Intellijent Systems,Computer Grapgics") String courses) {
        return new String("honours,courses");
    }
}
