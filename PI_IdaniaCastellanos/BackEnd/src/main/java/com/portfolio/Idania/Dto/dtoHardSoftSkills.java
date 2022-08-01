/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Idania.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author icastellanos
 */
public class dtoHardSoftSkills {
    
    @NotBlank
    private String nombreH;
    @NotBlank
    private String porcentajeH;

    public dtoHardSoftSkills() {
    }

    public dtoHardSoftSkills(String nombreH, String porcentajeH) {
        this.nombreH = nombreH;
        this.porcentajeH = porcentajeH;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(String porcentajeH) {
        this.porcentajeH = porcentajeH;
    }
    
    
    
}
