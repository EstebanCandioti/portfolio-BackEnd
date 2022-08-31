package com.portfolio.estebancandioti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//Getters y Setters
@Getter
@Setter
//Mapeo de entidad
@Entity
//Mapeo con el nombre de la tabla en la base de datos
@Table(name = "educacion")
public class Educacion {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idEstudios")
    private Long id;

    @Column(name = "nombre_instituciones", length = 100)
    private String institucion;

    @Column(name = "titulos", length = 45)
    private String titulo;

    @Column(name="fotoInstitucion", length=100)
    private String fotoInstitucion;
    
    @Column(name = "fecha_inicio", length = 45)
    private String inicioEducacion;

    @Column(name = "fecha_finalizacion", length = 45)
    private String finalizacionEducacion;

    @Column (name="idPersona")
    private Long idPersona;

    //Constructores
    public Educacion(Long id, String institucion, String titulo, String fotoInstitucion, String inicioEducacion, String finalizacionEducacion, Long id_persona) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fotoInstitucion = fotoInstitucion;
        this.inicioEducacion = inicioEducacion;
        this.finalizacionEducacion = finalizacionEducacion;
        this.idPersona = id_persona;
    }

    public Educacion() {
    }

}
