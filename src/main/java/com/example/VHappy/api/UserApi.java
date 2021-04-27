package com.example.VHappy.api;

import com.example.VHappy.dao.IUser;
import com.example.VHappy.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/users")
public class UserApi {
    @Autowired
    private IUser userRepository;

    @GetMapping("/")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findUserBysId(@PathVariable(name = "id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("Cannot retrieve user with null ID");
        }
        User user = userRepository.getOne(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/register")
    public ResponseEntity createUser(@RequestBody User user) {
        User createdUser = userRepository.save(user);
        return ResponseEntity.ok(createdUser);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestParam(name = "mail") String mail, @RequestParam(name = "mdp") String mdp) {
        if (StringUtils.isEmpty(mail) || StringUtils.isEmpty(mdp)) {
            return ResponseEntity.badRequest().body("Erreur sur le mail ou le mot de passe");
        }
        User authenticatedUser = userRepository.findByMailAndMdp(mail, mdp);
        if (authenticatedUser == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(authenticatedUser);
    }
}
