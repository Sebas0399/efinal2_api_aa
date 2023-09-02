package com.example.demo.repository;

import com.example.demo.repository.model.Estudiante;

import java.util.List;

public interface IEstudianteRepository {
    public void create(Estudiante estudiante);
    public List<Estudiante> readAll();
}
