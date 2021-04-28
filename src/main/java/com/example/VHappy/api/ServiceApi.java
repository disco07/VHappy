package com.example.VHappy.api;

import com.example.VHappy.dao.IServices;
import com.example.VHappy.entities.Services;
import com.example.VHappy.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/services")
public class ServiceApi {
    @Autowired
    private IServices serviceRepository;

    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(serviceRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findServicesBysId(@PathVariable(name = "id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("Cannot retrieve user with null ID");
        }
        Services service = serviceRepository.getOne(id);
        if (service == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(service);
    }

    @PostMapping("/createService")
    public ResponseEntity createServices(@RequestBody Services service) {
        Services createService = serviceRepository.save(service);
        return ResponseEntity.ok(createService);
    }

    @DeleteMapping("/{id}")
    public boolean deleteService(@PathVariable(name = "id") Long id) {
        serviceRepository.deleteById(id);
        return true;
    }
}
