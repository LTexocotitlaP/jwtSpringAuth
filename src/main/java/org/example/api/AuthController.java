package org.example.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "sabado")
    public String sabado() {
        return "logic from processing jwt token";
    }

    @PostMapping(value = "vierneeeeees")
    public String vierneeeeees() {
        return "logic from processing jwt token";
    }

}
