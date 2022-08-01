/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Idania.Controlador;

import com.portfolio.Idania.Dto.dtoHardSoftSkills;
import com.portfolio.Idania.Entidad.HardSoftSkills;
import com.portfolio.Idania.Security.Controller.Mensaje;
import com.portfolio.Idania.Servicio.Shardsoftskills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author icastellanos
 */

@RestController
@RequestMapping("/hard")
@CrossOrigin(origins = "http://localhost:4200")
public class CHardSoftSkills {
    @Autowired
    Shardsoftskills sHardSoftSkills;
    
    @GetMapping("/lista")
    public ResponseEntity<List<HardSoftSkills>> list(){
        List<HardSoftSkills> list = sHardSoftSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<HardSoftSkills> getById(@PathVariable("id")int id){
        if(!sHardSoftSkills.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        HardSoftSkills hardsoftskills = sHardSoftSkills.getOne(id).get();
        return new ResponseEntity(hardsoftskills, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sHardSoftSkills.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sHardSoftSkills.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHardSoftSkills dtohardsoftskills){
        if(StringUtils.isBlank(dtohardsoftskills.getNombreH())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sHardSoftSkills.existsByNombreH(dtohardsoftskills.getNombreH())){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        HardSoftSkills hardsoftskills = new HardSoftSkills(
                dtohardsoftskills.getNombreH(), dtohardsoftskills.getPorcentajeH()
            );
        sHardSoftSkills.save(hardsoftskills);
        return new ResponseEntity(new Mensaje("Skill creado"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHardSoftSkills dtohardsoftskills){
        if(!sHardSoftSkills.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sHardSoftSkills.existsByNombreH(dtohardsoftskills.getNombreH()) && sHardSoftSkills.getByNombreH(dtohardsoftskills.getNombreH()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtohardsoftskills.getNombreH())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        HardSoftSkills hardsoftskills = sHardSoftSkills.getOne(id).get();
        
        hardsoftskills.setNombreH(dtohardsoftskills.getNombreH());
        hardsoftskills.setPorcentajeH(dtohardsoftskills.getPorcentajeH());
        
        sHardSoftSkills.save(hardsoftskills);
        
        return new ResponseEntity(new Mensaje("Skill actualizado"), HttpStatus.OK);
    }
}

