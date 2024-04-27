package pe.edu.cibertec.APIRESTEC2Grupo11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.APIRESTEC2Grupo11.model.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo11.service.FarmacoService;

import java.util.List;

@RestController
@RequestMapping("/api/farmacos")
public class FarmacoController {
    private final FarmacoService farmacoService;

    @Autowired
    public FarmacoController(FarmacoService farmacoService) {
        this.farmacoService = farmacoService;
    }

    @GetMapping
    public ResponseEntity<List<Farmaco>> getAllFarmacos() {
        List<Farmaco> farmacos = farmacoService.getAllFarmacos();
        return ResponseEntity.ok(farmacos);
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<Farmaco> getFarmacoById(@PathVariable Integer id) {
        Farmaco farmaco = farmacoService.getFarmacoById(id);
        if (farmaco != null) {
            return ResponseEntity.ok(farmaco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @PostMapping
    public ResponseEntity<Farmaco> createFarmaco(@RequestBody Farmaco farmaco) {
        Farmaco createdFarmaco = farmacoService.createFarmaco(farmaco);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFarmaco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmaco> updateFarmaco(@PathVariable Integer id, @RequestBody Farmaco farmaco) {
        Farmaco updatedFarmaco = farmacoService.updateFarmaco(id, farmaco);
        if (updatedFarmaco != null) {
            return ResponseEntity.ok(updatedFarmaco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFarmaco(@PathVariable Integer id) {
        farmacoService.deleteFarmaco(id);
        return ResponseEntity.noContent().build();
    }
}
