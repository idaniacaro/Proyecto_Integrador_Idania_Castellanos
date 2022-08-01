/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Idania.Repositorio;

import com.portfolio.Idania.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author icastellanos
 */
@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Integer>{
    
}
