package com.bootcoding.project.service;

import com.bootcoding.project.Repository.DoctorRepository;
import com.bootcoding.project.common.Response;
import com.bootcoding.project.entity.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    private void preProcessing(Doctor doctor) {
        doctor.setDoctorId(UUID.randomUUID().toString());
    }

    public Response saveDoctorDetails(Doctor doctor) {
        preProcessing(doctor);
        return doctorRepository.saveDoctorDetails(doctor);

    }
}
