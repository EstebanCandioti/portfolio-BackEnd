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

    @Column(name = "nombre", length = 45, nullable=false)
    private String nombre;

    @Column(name = "descripcionPersona", length = 200, nullable=false)
    private String descripcion;

    @Column (name="titulos", length= 200)
    private String titulos;

    @Column(name = "email", length = 45, nullable=false)
    private String email;

    @Column(name = "ubicacion", length = 75, nullable=false)
    private String ubicacion;

    @Column(name = "contrasenia", length = 20, nullable=false)
    private String contrasenia;
    
    @Column(name="url_foto_perfil", length=100, nullable=false )
    private String fotoPerfil;
    
    @Column(name="url_foto_banner", length=100, nullable=false )
    private String fotoBanner;
    
    @Column(name="instagram", length=30)
    private String instagram;
    
    @Column(name="numeroTelefono", length=13)
    private String numero;
    
    @Column(name="linkedin", length=30)
    private String linkedin;
    
    
    
    //Constructores
    public Persona() {
    }
}
