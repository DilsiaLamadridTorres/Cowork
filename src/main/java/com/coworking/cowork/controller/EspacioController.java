package com.coworking.cowork.controller;

import com.coworking.cowork.model.Espacio;
import com.coworking.cowork.service.EspacioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/espacios")

public class EspacioController {
private final EspacioService espacioService;

public EspacioController(EspacioService espacioService) {
this.espacioService = espacioService;
}
@GetMapping
public ResponseEntity<List<Espacio>> findAll() {
return ResponseEntity.ok(espacioService.findall()) ;

}
@GetMapping("/{id}")
public ResponseEntity<Espacio> findById(@PathVariable long id) {
return espacioService.findById(id)
        .map(ResponseEntity::ok)
    .orElse(ResponseEntity.notFound().build());

}
@PostMapping
public ResponseEntity<Espacio> create(@RequestBody Espacio espacio)  {
Espacio nuevoEspacio = espacioService.save(espacio);
return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(nuevoEspacio);

}
@PutMapping("/{id}")
    public ResponseEntity<Espacio> update(
      @PathVariable long id,
      @RequestBody Espacio espacio) {
    return espacioService.update(id, espacio)
            .map(ResponseEntity::ok)
    .orElse(ResponseEntity.notFound().build());


}
@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteById(@PathVariable long id) {
boolean eliminado = espacioService.deleteById(id);
if (eliminado) {
    return ResponseEntity.noContent().build();
}
 return ResponseEntity.notFound().build();


}


}
