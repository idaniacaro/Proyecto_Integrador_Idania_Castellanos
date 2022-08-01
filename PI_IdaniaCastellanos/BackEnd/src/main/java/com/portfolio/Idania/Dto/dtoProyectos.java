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
public class dtoProyectos {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String imageP;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String imageP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imageP = imageP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImageP() {
        return imageP;
    }

    public void setImageP(String imageP) {
        this.imageP = imageP;
    }
    
    
    
}
