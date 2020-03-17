package com.clickhealth.ClickHealth.controller;

import com.clickhealth.ClickHealth.model.Doctor;
import com.clickhealth.ClickHealth.model.Patient;
import com.clickhealth.ClickHealth.repository.DoctorRepository;
import com.clickhealth.ClickHealth.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api/click-health"})
public class controller
{
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping({"/add-doctor"})
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        return doctorRepository.save(doctor);
    }

    @PostMapping({"/add-patient"})
    @ResponseStatus(HttpStatus.CREATED)
    public Patient addPatient(@RequestBody Patient patient)
    {
        return patientRepository.save(patient);
    }

}
