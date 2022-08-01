/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Idania.Servicio;

import com.portfolio.Idania.Entidad.HardSoftSkills;
import com.portfolio.Idania.Repositorio.RHardSoftSkills;
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
public class Shardsoftskills {
    
@Autowired
     RHardSoftSkills rHardSoftSkills;
     
     public List<HardSoftSkills> list(){
         return rHardSoftSkills.findAll();
     }
     
     public Optional<HardSoftSkills> getOne(int id){
         return rHardSoftSkills.findById(id);
     }
     
     public Optional<HardSoftSkills> getByNombreH(String nombreH){
         return rHardSoftSkills.findByNombreH(nombreH);
     }
     
     public void save(HardSoftSkills hard){
         rHardSoftSkills.save(hard);
     }
     
     public void delete(int id){
         rHardSoftSkills.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rHardSoftSkills.existsById(id);
     }
     
     public boolean existsByNombreH(String nombreH){
         return rHardSoftSkills.existsByNombreH(nombreH);
     }
}

