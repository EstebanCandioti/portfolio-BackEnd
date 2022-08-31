package com.portfolio.estebancandioti.model;

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
@Table(name="experiencias")
public class Experiencia {
        //Atributos
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idTrabajos")
    private Long id;
    
    @Column(name="nombre_trabajo", length=45)
    private String nombreTrabajo;
    
    @Column (name="posicion_laboral", length=45)
    private String posicionLaboral;
    
    @Column (name="descripcion_laboral", length=200)
    private String descripcionLaboral;
    
    @Column (name="fecha_inicio", length=45)
    private String inicioTrabajo;
    
    @Column (name="fecha_finalizacion", length=45)
    private String finalizacionTrabajo;
    
    @Column (name="foto_trabajo", length=100)
    private String fotoTrabajo;
    
    @Column (name="id_persona")
    private Long idPersona;
    
    //constructioes

    public Experiencia( Long id, String nombreTrabajo, String posicionLaboral, String descripcionLaboral, String inicioTrabajo, String finalizacionTrabajo, String fotoTrabajo, Long persona) {
        this.id = id;
        this.nombreTrabajo = nombreTrabajo;
        this.posicionLaboral = posicionLaboral;
        this.descripcionLaboral = descripcionLaboral;
        this.inicioTrabajo = inicioTrabajo;
        this.finalizacionTrabajo = finalizacionTrabajo;
        this.fotoTrabajo = fotoTrabajo;
        this.idPersona = persona;
    }

    public Experiencia() {
    }
    
}
