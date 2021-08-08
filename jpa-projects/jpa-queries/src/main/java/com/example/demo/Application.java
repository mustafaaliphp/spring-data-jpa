package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    	 return args -> {
             Student mustafa = new Student(
                     "Mustafa",
                     "Ali",
                     "mustafa.ali@gsu.edu",
                     30
             );

             Student lolo = new Student(
                     "Lolo",
                     "Ali",
                     "lolo.lolo@gsu.edu",
                     7
             );

            Student toto = new Student(
                    "Toto",
                    "Ali",
                    "toto.ali@gsu.edu",
                    18
            );

            studentRepository.saveAll(List.of(mustafa, lolo, toto));

            studentRepository
                    .findStudentByEmail("toto.ali@gsu.edu")
                    .ifPresentOrElse(
                            System.out::println,
                            () -> System.out.println("Student with email toto.ali@gsu.edu not found"));

            studentRepository.selectStudentWhereFirstNameAndAgeGreaterOrEqual(
                    "Mustafa",
                    30
            ).forEach(System.out::println);

            studentRepository.selectStudentWhereFirstNameAndAgeGreaterOrEqualNative(
                    "Mustafa",
                    30
            ).forEach(System.out::println);

            System.out.println("Deleting toto");
            System.out.println(studentRepository.deleteStudentById(3L));
        };
    }

}
