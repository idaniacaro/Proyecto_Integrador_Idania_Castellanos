/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Idania.Servicio;

import com.portfolio.Idania.Entidad.Persona;
import com.portfolio.Idania.Interface.IPersonaServicio;
import com.portfolio.Idania.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author icastellanos
 */
@Service
public class ImpPersonaServicio implements IPersonaServicio{
    @Autowired IPersonaRepositorio ipersonaRepositorio;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositorio.save(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Integer id) {
        Persona persona =ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    }
    
    
    
}
