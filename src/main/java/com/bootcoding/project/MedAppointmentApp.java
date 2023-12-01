package com.bootcoding.project;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class MedAppointmentApp implements CommandLineRunner {
    public static void main(String[] args) {

        SpringApplication.run(MedAppointmentApp.class, args);
    }



    @Override
    public void run(String... args) throws Exception {

        log.info("application is running");
    }
}
