package com.bootcoding.project.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Builder
@Data
public class Doctor {
   private int id;
    private String doctorId;
    private String name;
    private String specialization;
    private String doctorHours;
    private boolean isAvailable;
}
