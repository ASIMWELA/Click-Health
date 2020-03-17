package com.clickhealth.ClickHealth.repository;

import com.clickhealth.ClickHealth.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>
{
}
