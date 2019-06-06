package com.example.training62.controller;

import com.example.training62.entity.bmiEntity;
import com.example.training62.service.bmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@CrossOrigin
@RestController
@RequestMapping
public class bmiController {

    @Autowired
    bmiService BmiService;

    @PostMapping(path = "/bmi")
    public Object onSaveAdvisor(@RequestBody @Valid bmiEntity bmi, Principal principal) {
        return BmiService.addNewBmi(bmi);
    }

    @GetMapping(path = "/bmi")
    public Object getAllAdvisor(Principal principal) {
        return BmiService.findAllBmi();
    }

}
