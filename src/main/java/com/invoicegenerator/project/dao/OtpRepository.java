package com.invoicegenerator.project.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoicegenerator.project.entity.OtpEntity;

@Repository
public interface OtpRepository extends JpaRepository<OtpEntity, Integer> {
    Optional<OtpEntity> findTopByEmailOrderByCreatedAtDesc(String email);
}