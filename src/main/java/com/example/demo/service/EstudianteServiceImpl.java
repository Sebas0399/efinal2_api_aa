package com.example.demo.service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    public void create(EstudianteTO estudianteTO) {
        this.estudianteRepository.create(convertir(estudianteTO));
    }

    @Override
    public List<EstudianteTO> readAll() {

        return this.estudianteRepository.readAll().stream().map(x->convertir(x)).toList();
    }
    public Estudiante convertir(EstudianteTO estudianteTO){
        Estudiante estudiante=new Estudiante();
        estudiante.setApellido(estudianteTO.getApellido());
        estudiante.setCedula(estudianteTO.getCedula());
        estudiante.setNombre(estudianteTO.getNombre());
        estudiante.setId(estudianteTO.getId());
        return estudiante;
    };
    public EstudianteTO convertir(Estudiante estudianteTO){
        EstudianteTO estudiante=new EstudianteTO();
        estudiante.setApellido(estudianteTO.getApellido());
        estudiante.setCedula(estudianteTO.getCedula());
        estudiante.setNombre(estudianteTO.getNombre());
        estudiante.setId(estudianteTO.getId());
        return estudiante;
    };
}
