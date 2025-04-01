package org.example.backend.repository;

import org.example.backend.domain.EmailDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEmailDomainRepository extends JpaRepository<EmailDomain, Integer> {
    Optional<EmailDomain> findByDomain(String domain);
}