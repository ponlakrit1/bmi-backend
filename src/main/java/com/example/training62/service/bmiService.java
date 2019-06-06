package com.example.training62.service;

import com.example.training62.entity.bmiEntity;
import com.example.training62.repos.bmiRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bmiService {

    @Autowired
    bmiRepos bmiRepo;

    public bmiEntity addNewBmi(bmiEntity advisor){
        return bmiRepo.save(advisor);
    }

    public List<bmiEntity> findAllBmi(){
        return (List<bmiEntity>) bmiRepo.findAll();
    }

}
