
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
    public String getCourses(@RequestParam(value = "foundation", defaultValue = "csc111f,csc121f,csc113f,csc123f") String courses) {
        return new String("foundation,courses");
    }


    @GetMapping("undergraduateCourses")
    public String getUndergraduateCourses(@RequestParam(value = "undergraduate", defaultValue = "csc211,csc212,csc223,csc224") String courses) {
        return new String("undergraduate,courses");
    }

    @GetMapping("honoursCourses")
    public String getHonoursCourses(@RequestParam(value = "honours", defaultValue = "csc541,csc532,csc544,csc535") String courses) {
        return new String("honours,courses");
    }
}