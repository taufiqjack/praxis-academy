package com.taufiqjack.sisteminformasicatering.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("/wande/test/user")
    @PreAuthorize("hashRole('USER') OR hashRole('ADMIN')")
    public String userAcces(){
        return ">>> user Contents!";
    }
    @GetMapping("/wande/test/pm")
    @PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
    public String projectManagementAccess(){
        return ">>> Board Management Project";
    }
    @GetMapping("/wande/test/admin")
    @PreAuthorize("hashRole('ADMIN')")
    public String adminAccess(){
        return ">>> Admin Contetnts!";
    }
}
