/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Idania.Repositorio;

import com.portfolio.Idania.Entidad.HardSoftSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author icastellanos
 */
@Repository
public interface RHardSoftSkills extends JpaRepository<HardSoftSkills, Integer>{
    public Optional<HardSoftSkills> findByNombreH(String nombreH);
    public boolean existsByNombreH(String nombreH);
}
