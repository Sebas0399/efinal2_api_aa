package com.example.demo.controller;

import com.example.demo.service.EstudianteTO;
import com.example.demo.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestFul {
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EstudianteTO> getAll(){
        return  this.estudianteService.readAll();
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody EstudianteTO estudiante){
        this.estudianteService.create(estudiante);
    }
}
