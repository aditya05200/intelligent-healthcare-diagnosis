package com.health.care.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.model.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
}
