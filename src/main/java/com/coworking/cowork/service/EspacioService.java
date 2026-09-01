package com.coworking.cowork.service;

import com.coworking.cowork.model.Espacio;
import com.coworking.cowork.repository.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioService {
    private final EspacioRepository espacioRepository;

    // aquí se realiza la inyección de dependencias

    public EspacioService(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }

    public List<Espacio> findall() {
        return espacioRepository.findAll();
    }

    public Optional<Espacio> findById(long id) {
        return espacioRepository.findById(id);
    }

    public Espacio save(Espacio espacio) {
        return espacioRepository.save(espacio);
    }

    public Optional<Espacio> update(long id, Espacio espacio) {
        return espacioRepository.update(id, espacio);
    }

    public boolean deleteById(long id) {
        return espacioRepository.deleteById(id);
    }


}
