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
@Getter
@Setter
//mapeo de la entidad y la tabla
@Entity
@Table(name = "personas")
public class Persona {
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "descripcionPersona", length = 200)
    private String descripcion;

    @Column (name="titulos", length= 150)
    private String titulos;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "ubicacion", length = 75)
    private String ubicacion;

    @Column(name = "contrasenia", length = 20)
    private String contrasenia;

    //Constructores
    public Persona() {
    }
}
