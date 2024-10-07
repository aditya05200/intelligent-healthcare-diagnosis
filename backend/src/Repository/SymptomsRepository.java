package com.health.care.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.model.Symptoms;

public interface SymptomsRepository extends JpaRepository<Symptoms, Long> {
}
