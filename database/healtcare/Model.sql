# Doctor table 
CREATE TABLE doctors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);


# Patient table
CREATE TABLE patients (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    age INT NOT NULL
);
drop table patients;

# Diagnose Table
CREATE TABLE diagnoses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    diagnosis_name VARCHAR(255) NOT NULL,
    patient_id BIGINT,
    FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE
);

# symptoms table
CREATE TABLE symptoms (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    symptom_name VARCHAR(255) NOT NULL,
    patient_id BIGINT,
    FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE
);

# user

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50)
);

# medical history 

CREATE TABLE medical_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    history_description TEXT NOT NULL,
    patient_id BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE
);

# appointment
CREATE TABLE appointments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    appointment_date TIMESTAMP NOT NULL,
    patient_id BIGINT,
    doctor_id BIGINT,
    FOREIGN KEY (patient_id) REFERENCES patients(id) ON DELETE CASCADE,
    FOREIGN KEY (doctor_id) REFERENCES doctors(id) ON DELETE SET NULL
);
ALTER TABLE doctors MODIFY experience INT DEFAULT NULL;




