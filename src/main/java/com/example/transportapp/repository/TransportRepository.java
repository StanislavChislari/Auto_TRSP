package com.example.transportapp.repository;

import com.example.transportapp.domain.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}
