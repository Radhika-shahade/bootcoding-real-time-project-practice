package com.bootcoding.project.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class Patient {
   private int id;
    private String patientId;
   private String name;
   private long contactNo;
   private String gender;
    private Date DOB;
   private String Status;
}
