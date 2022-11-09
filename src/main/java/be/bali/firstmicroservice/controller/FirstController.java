package be.bali.firstmicroservice.controller;

import be.bali.firstmicroservice.service.FirstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class FirstController {

    private final FirstService firstService;

    @GetMapping
    public String getApplicationName(){
        return firstService.getName();
    }
}
