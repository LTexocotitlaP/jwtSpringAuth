package org.example.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/validation")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "validation")
    public String validation() {
        return "Validation from secure endpoint";
    }

}
