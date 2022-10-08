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

//getteres y setters
@Getter
@Setter
//mapeo de la entidad y la tabla
@Entity
@Table(name = "proyectos")

public class Proyecto {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_proyectos")
    private Long id;

    @Column(name = "nombre_proyectos", length = 45, nullable = false)
    private String nombre;

    @Column(name = "descripcion_proyectos", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "fecha_inicio", length = 45, nullable = false)
    private String inicioProyecto;

    @Column(name = "fecha_finalizacion", length = 45, nullable = false)
    private String finalizacionProyecto;

    @Column(name = "fotos_proyectos", length = 100)
    private String fotoProyecto;

    @Column(name = "link1", length = 100, nullable = false)
    private String link1;

    @Column(name = "descripcion_link1", length = 100)
    private String descripcionLink1;

    @Column(name = "link2", length = 100)
    private String link2;

    @Column(name = "descripcion_link2", length = 100)
    private String descripcionLink2;

    @Column(name = "link3", length = 100)
    private String link3;

    @Column(name = "descripcion_link3", length = 100)
    private String descripcionLink3;

    @Column(name = "id_persona", nullable = false)
    private Long idPersona;

    @Column(name = "posicionLista")
    private int posicion;

    //Constructores
    public Proyecto(Long id, String nombre, String descripcion, String inicioProyecto, String finalizacionProyecto, String fotoProyecto, String link1, String descripcionLink1, String link2, String descripcionLink2, String link3, String descripcionLink3, Long idPersona, int posicion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicioProyecto = inicioProyecto;
        this.finalizacionProyecto = finalizacionProyecto;
        this.fotoProyecto = fotoProyecto;
        this.link1 = link1;
        this.descripcionLink1 = descripcionLink1;
        this.link2 = link2;
        this.descripcionLink2 = descripcionLink2;
        this.link3 = link3;
        this.descripcionLink3 = descripcionLink3;
        this.idPersona = idPersona;
        this.posicion = posicion;
    }

    public Proyecto() {
    }

}
