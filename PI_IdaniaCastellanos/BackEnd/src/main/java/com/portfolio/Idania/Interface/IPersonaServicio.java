/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Idania.Interface;

import com.portfolio.Idania.Entidad.Persona;

import java.util.List;

/**
 *
 * @author icastellanos
 */
public interface IPersonaServicio {

    /*Traer lista de Persona*/

    /**
     *
     * @return
     */

    public List<Persona> getPersona();
    
    /*Guardamos un objeto de tipo persona*/
    public void savePersona(Persona persona);
    
    /*Eliminamos un usuario por ID*/
    public void deletePersona(Integer id);
    
    /*Buscar una persona por ID*/
    public Persona findPersona(Integer id);

}
