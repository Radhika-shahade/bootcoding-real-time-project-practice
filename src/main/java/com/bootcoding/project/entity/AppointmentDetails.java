package com.bootcoding.project.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;
@Builder
@Data
public class AppointmentDetails {
    int id;
    String PatientId;
    String doctorId;
    Date appointmentDate;
    LocalTime scheduleTime;
}
