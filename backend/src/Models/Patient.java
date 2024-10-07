package com.health.care.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    @Column(name = "age", nullable = false)
    @Min(0)
    @Max(120)
    private int age;

    @Column(name = "gender", nullable = false)
    @NotNull
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    @Pattern(regexp = "\\d{10}")
    private String phoneNumber;

    @Column(name = "email")
    @Email
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "medical_history")
    private String medicalHistory;

    @Column(name = "symptoms")
    private String symptoms;  // Add this field for symptoms

    // Example of a relationship with another entity (e.g., Doctor)
    /*
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    */

    // Additional methods if needed
}
