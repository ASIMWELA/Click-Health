package com.clickhealth.ClickHealth.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="patient_id", nullable = false)
    private int patientId;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="age", nullable = false)
    private int age;

    @Column(name="gender", nullable = false)
    private char gender;

    @Column(name="address", nullable = false)
    private String address;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name="user_name", nullable = false)
    private String userName;

    @Column(name="weight", nullable = false)
    private double weight;

    @Column(name="disease", nullable = false)
    private String disease;

    @ManyToMany(mappedBy = "patientList")
    private List<Doctor> doctorList;

    public Patient()
    {

    }

    public Patient(int patientId,
                   String firstName,
                   String lastName,
                   int age,
                   char gender,
                   String address,
                   String password,
                   String email,
                   String userName,
                   double weight,
                   String disease,
                   List<Doctor> doctorList) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.weight = weight;
        this.disease = disease;
        this.doctorList = doctorList;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public void setPatientId(int patientId)
    {
        this.patientId = patientId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getDisease()
    {
        return disease;
    }

    public void setDisease(String disease)
    {
        this.disease = disease;
    }

    public List<Doctor> getDoctorList()
    {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList)
    {
        this.doctorList = doctorList;
    }
}
