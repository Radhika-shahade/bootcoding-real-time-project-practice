package com.bootcoding.project.Repository;

import com.bootcoding.project.common.Response;
import com.bootcoding.project.entity.Doctor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DoctorRepository {
    private final JdbcTemplate jdbcTemplate;

    public DoctorRepository( JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public Response saveDoctorDetails(Doctor doctor){
        Response doctorResponse = Response.builder().build();
      try{
          String query = "insert into doctor_info(doctor_name,specialization,doctor_hours,is_available)" +
                  " values('"+ doctor.getName()+ "','"+ doctor.getSpecialization()+"','"+ doctor.getDoctorHours()+"','"+
          doctor.isAvailable()+"')";
          jdbcTemplate.update(query);
          doctorResponse.setMessage("saved doctor information successfully");
      }
      catch (Exception ex){
          doctorResponse.setMessage("Failed while creating assignments. Cause - " + ex.getMessage());
      }
      return doctorResponse;
    }
}


