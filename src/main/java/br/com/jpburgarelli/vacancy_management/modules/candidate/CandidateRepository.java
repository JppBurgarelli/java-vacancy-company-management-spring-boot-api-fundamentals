package br.com.jpburgarelli.vacancy_management.modules.candidate;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

  
} 