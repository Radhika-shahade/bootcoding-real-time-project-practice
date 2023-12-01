package com.bootcoding.project.controller;

import com.bootcoding.project.common.Response;
import com.bootcoding.project.entity.Doctor;
import com.bootcoding.project.service.DoctorService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
   private final DoctorService doctorService;
   public DoctorController(DoctorService doctorService){
       this.doctorService = doctorService;
   }
   @PostMapping("/detail")
   public ResponseEntity<Response> saveDoctorDetails(@RequestBody Doctor doctor){
    Response response= doctorService.saveDoctorDetails(doctor);
    return new ResponseEntity<>(response, HttpStatus.OK);
   }

}
