package com.erguncan.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
             Student nana = new Student(
                     "Nana",LocalDate.of(2000, Month.JANUARY,5),"21"
             );
             Student alex = new Student(
                    "Alex",LocalDate.of(1999, Month.JANUARY,5),"alex.gmail.com");
             repository.saveAll(
                    List.of(alex,nana)
            );

        };
    }
}
