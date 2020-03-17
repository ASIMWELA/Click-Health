package com.clickhealth.ClickHealth.repository;

import com.clickhealth.ClickHealth.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Integer>
{
}
