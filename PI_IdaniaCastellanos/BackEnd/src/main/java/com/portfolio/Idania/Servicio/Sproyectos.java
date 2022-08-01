/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Idania.Servicio;

import com.portfolio.Idania.Entidad.Proyectos;
import com.portfolio.Idania.Repositorio.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author icastellanos
 */
@Service
@Transactional
public class Sproyectos {
    
    @Autowired
     RProyectos rProyectos;
    
public List<Proyectos> list(){
         return rProyectos.findAll();
     }
     
     public Optional<Proyectos> getOne(int id){
         return rProyectos.findById(id);
     }
     
     public Optional<Proyectos> getByNombreP(String nombreP){
         return rProyectos.findByNombreP(nombreP);
     }
     
     public void save(Proyectos expe){
         rProyectos.save(expe);
     }
     
     public void delete(int id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByNombreP(String nombreP){
         return rProyectos.existsByNombreP(nombreP);
     }
}
