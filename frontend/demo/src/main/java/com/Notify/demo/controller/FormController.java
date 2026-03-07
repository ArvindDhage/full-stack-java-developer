package com.Notify.demo.controller;


import com.Notify.demo.entity.Form;
import com.Notify.demo.repo.FormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class FormController {

    @Autowired
    private FormRepo formRepo;

    @PostMapping("/form")
    public ResponseEntity<Form> sendForm(@RequestBody Form form){
        Form savedForm = formRepo.save(form);
        return ResponseEntity.ok(savedForm);
    }
}
