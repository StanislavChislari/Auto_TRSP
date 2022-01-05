package com.example.transportapp.service;

import java.util.List;

import com.example.transportapp.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transportapp.domain.Transport;

@Service
public class TransportService {

    @Autowired
    private TransportRepository repo;

    public List<Transport> listAll() {
        return repo.findAll();
    }

    public void save(Transport transport) {
        repo.save(transport);
    }

    public Transport get(long id) {
        return repo.findById(id).get();
    }
}
