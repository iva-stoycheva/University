package com.java.medical_record_project.data.dto;

import com.java.medical_record_project.data.entity.Diagnose;
import com.java.medical_record_project.data.entity.Doctor;
import com.java.medical_record_project.data.entity.Patient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateAppointmentDTO {
    private long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private Diagnose diagnose;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate start_date;
    private int sick_leave_days;
    private String medicament;
    private Doctor doctor;
    private Patient patient;
    private int deleted;
}
