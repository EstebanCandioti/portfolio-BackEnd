/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.estebancandioti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//getters y setters
@Getter
@Setter
//mapeo de la entidad y la tabla
@Entity
@Table(name = "habilidades_fuertes")
public class HabilidadFuerte {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "habilidad", length = 45)
    private String habilidad;

    @Column(name = "valor", length = 3)
    private int valor;
    
    @Column (name="id_persona")
    private Long idPersona;

    //Constuctores
    public HabilidadFuerte() {
    }

    public HabilidadFuerte(Long id, String habilidad, int valor, Long idPersona) {
        this.id = id;
        this.habilidad = habilidad;
        this.valor = valor;
        this.idPersona = idPersona;
    }


}
