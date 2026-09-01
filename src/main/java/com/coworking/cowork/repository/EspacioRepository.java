package com.coworking.cowork.repository;

import com.coworking.cowork.model.Espacio;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EspacioRepository {
    // base de datos temporal
 private final List<Espacio> espacios = new ArrayList<>();

 private long siguienteId = 1;

 // se obtienen todos los espacios

 public List<Espacio> findAll() {
     return espacios;

 }

 // se busca el espacio por id

 public Optional<Espacio> findById(long id) {
     return espacios.stream()
             .filter(espacio -> espacio.getId() == id)
             .findFirst();
 }

 // se guarda un espacio nuevo

 public Espacio save(Espacio espacio) {
     espacio.setId(siguienteId);
     siguienteId++;
     espacios.add(espacio);
     return espacio;
 }

 // se actualiza un espacio

    public Optional<Espacio> update(long id, Espacio espacioActualizado) {
        Optional<Espacio> espacioEncontrado = findById(id);
        if (espacioEncontrado.isPresent()) {
            Espacio espacio = espacioEncontrado.get();
            espacio.setNombre(espacioActualizado.getNombre());
            espacio.setCapacidad(espacioActualizado.getCapacidad());
            espacio.setPrecioHora(espacioActualizado.getPrecioHora());
            espacio.setDescripcion(espacioActualizado.getDescripcion());
            espacio.setNombreCategoria(espacioActualizado.getNombreCategoria());
            espacio.setNombreSede(espacioActualizado.getNombreSede());

            return Optional.of(espacio);
        }

        return Optional.empty();
    }

    // se elimina un espacio

    public boolean deleteById(long id) {
        Optional<Espacio> espacio = findById(id);
        if (espacio.isPresent()) {
            espacios.remove(espacio.get());
            return true;
        }

        return false;
    }

}
