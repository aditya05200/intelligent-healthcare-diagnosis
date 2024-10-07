package com.health.care.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.care.model.Disease;

public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}
