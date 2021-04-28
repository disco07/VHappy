package com.example.VHappy.api;

import com.example.VHappy.dao.IReservation;
import com.example.VHappy.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/reservations")
public class ReservationApi {
    @Autowired
    private IReservation reservationRepository;

    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(reservationRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findServicesBysId(@PathVariable(name = "id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("Cannot retrieve user with null ID");
        }
        Reservation service = reservationRepository.getOne(id);
        if (service == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(service);
    }

    @PostMapping("/createReservation")
    public ResponseEntity createServices(@RequestBody Reservation reservation) {
        Reservation createService = reservationRepository.save(reservation);
        return ResponseEntity.ok(createService);
    }

    @DeleteMapping("/{id}")
    public boolean deleteService(@PathVariable(name = "id") Long id) {
        reservationRepository.deleteById(id);
        return true;
    }
}
