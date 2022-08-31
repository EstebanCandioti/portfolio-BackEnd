/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estebancandioti.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//getters y setters
@Getter @Setter
//Mapeo de la Entidad
@Entity
@Table(name="tecnologias")
public class Tecnologia {
    
    //Atributos
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idTecnologias")
    private Long id;
    
    @Column(name="nombre_tecnologia", length=45)
    private String nombre;
    
    @Column (name="descripcion_tecnologias", length=200)
    private String descripcion;
    
    @Column (name="tecnologia_imagen", length=100)
    private String tecnologiaImg;
    
    @Column (name="id_persona")
    private Long idPersona;

    //Constructores
    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, String descripcion, String urlFoto, Long id_persona) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tecnologiaImg = urlFoto;
        this.idPersona = id_persona;
    }

}
