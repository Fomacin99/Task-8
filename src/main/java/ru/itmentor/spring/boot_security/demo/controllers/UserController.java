package ru.itmentor.spring.boot_security.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itmentor.spring.boot_security.demo.models.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<User> show(Model model, @AuthenticationPrincipal User user) {
        return ResponseEntity.ok(user);
    }
}