package com.example.demo.service;

import com.example.demo.repository.model.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void create(EstudianteTO estudianteTO);
    public List<EstudianteTO> readAll();
}
