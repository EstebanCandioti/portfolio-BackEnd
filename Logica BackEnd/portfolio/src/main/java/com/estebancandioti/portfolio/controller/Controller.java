package com.estebancandioti.portfolio.controller;

import com.estebancandioti.portfolio.model.Educacion;
import com.estebancandioti.portfolio.model.Experiencia;
import com.estebancandioti.portfolio.model.HabilidadDebil;
import com.estebancandioti.portfolio.model.HabilidadFuerte;
import com.estebancandioti.portfolio.model.Persona;
import com.estebancandioti.portfolio.model.Proyecto;
import com.estebancandioti.portfolio.model.Tecnologia;
import com.estebancandioti.portfolio.service.IEducacionService;
import com.estebancandioti.portfolio.service.IExperienciaService;
import com.estebancandioti.portfolio.service.IHabilidadDebilService;
import com.estebancandioti.portfolio.service.IHabilidadFuerteService;
import com.estebancandioti.portfolio.service.IPersonaService;
import com.estebancandioti.portfolio.service.IProyectoService;
import com.estebancandioti.portfolio.service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {
        //Injeccion de los servicios
    @Autowired
    private IExperienciaService expSer;
    @Autowired
    private IEducacionService eduSer;
    @Autowired 
    private IHabilidadDebilService habDebSer;
    @Autowired
    private IHabilidadFuerteService habFueSer;
    @Autowired
    private IProyectoService proSer;
    @Autowired
    private ITecnologiaService tecSer;
    @Autowired
    private IPersonaService perSer;
    
    //-----------------------Controladores para experiencia---------------------
    @PostMapping("experiencia/crear")
    public void crearExperiencia(@RequestBody Experiencia exp){
        expSer.crearExperiencia(exp);
    }
    
    @PostMapping("experiencia/editar")
    public Experiencia editarExperiencia(@RequestBody Experiencia exp){
        expSer.editarExperiencia(exp);
        return exp;
    }
    
    @GetMapping("experiencia/traer")
    @ResponseBody
    public List<Experiencia> TraerExperiencias(){
        return expSer.traerExperiencia();
    }
    
    @GetMapping("experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia BuscarExperiencias(@PathVariable Long id){
        return expSer.buscarExperiencia(id);
    }
    
    @DeleteMapping("experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expSer.borrarExperiencia(id);
    }
    @GetMapping("persona/{id}/experiencia")
    @ResponseBody
    public List<Experiencia> traerExperienciaPersona(@PathVariable Long id){
        return expSer.traerExperienciaPersona(id);
    }
    
    //--------------------Controladores para educacion---------------------
    @PostMapping("educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu){
        eduSer.crearEducacion(edu);
    }
    
    @PostMapping("educacion/editar")
    public Educacion editarEducacion(@RequestBody Educacion edu){
        eduSer.crearEducacion(edu);
        return edu;
    }
    
    @GetMapping("/api/educacion/traer")
    @ResponseBody
    public List<Educacion> TraerEducacion(){
        return eduSer.traerEducacion();
    }
    
    @GetMapping("educacion/buscar/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id){
        return eduSer.buscarEducacion(id);
    }
    
    @DeleteMapping("educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduSer.borrarEducacion(id);
    }
    
    @GetMapping ("persona/{id}/educacion")
    @ResponseBody
    public List<Educacion> traerEducacionPersona(@PathVariable Long id){
        return eduSer.getEducacionPersona(id);
    }
    //-------------------Controladores para habilidad debil---------------------
    @PostMapping("habilidad-debil/crear")
    public void crearHabilidadDebil(@RequestBody HabilidadDebil hab){
        habDebSer.crearHabilidadDebil(hab);
    }
    
    @PostMapping("habilidad-debil/editar")
    public HabilidadDebil editarHabilidadDebil(@RequestBody HabilidadDebil hab){
        habDebSer.editarHabilidadDebil(hab);
        return hab;
    }
    
    @GetMapping("habilidad-debil/traer")
    @ResponseBody
    public List<HabilidadDebil> TraerHabilidadesDebiles(){
        return habDebSer.traerHabilidadesDebiles();
    }
    
    @GetMapping("habilidad-debil/buscar/{id}")
    @ResponseBody
    public HabilidadDebil BuscarHabilidadesDebiles(@PathVariable Long id){
        return habDebSer.buscarHabilidadDebil(id);
    }
    
    @DeleteMapping("habilidad-debil/borrar/{id}")
    public void borrarHabilidadDebil(@PathVariable Long id){
        habDebSer.borrarHabilidadDebil(id);
    }
    
    @GetMapping("persona/{id}/habilidad-debil")
    @ResponseBody
    public List<HabilidadDebil> traerHabilidadesDebilesPersona(@PathVariable Long id){
        return habDebSer.traerHabilidadesDebilesPersona(id);
    }
    
    //-------------------Controladores para habilidad fuerte-------------------
    @PostMapping("habilidad-fuerte/crear")
    public void crearHabilidadFuerte(@RequestBody HabilidadFuerte hab){
        habFueSer.crearHabilidadFuerte(hab);
    }
    
    @PostMapping("habilidad-fuerte/editar")
    public void editarHabilidadFuerte(@RequestBody HabilidadFuerte hab){
        habFueSer.editarHabilidadFuerte(hab);
    }
    
    @GetMapping("habilidad-fuerte/traer")
    @ResponseBody
    public List<HabilidadFuerte> TraerHabilidadesFuertes(){
        return habFueSer.traerHabilidadesFuertes();
    }
    
    @GetMapping("habilidad-fuerte/buscar/{id}")
    @ResponseBody
    public HabilidadFuerte BuscarHabilidadFuerte(@PathVariable Long id){
        return habFueSer.buscarHabilidadFuerte(id);
    }
    
    @DeleteMapping("habilidad-fuerte/borrar/{id}")
    public void borrarHabilidadFuerte(@PathVariable Long id){
        habFueSer.borrarHabilidadFuerte(id);
    }
    
    @GetMapping("persona/{id}/habilidad-fuerte")
    @ResponseBody
    public List<HabilidadFuerte> traerHabilidadesFuertesPersona(@PathVariable Long id){
        return habFueSer.traerHabilidadesFuertesPersona(id);
    }
    
    //-------------------Controladores para proyecto---------------------
    @PostMapping("proyecto/crear")
    public void crearProyecto(@RequestBody Proyecto pro){
        proSer.crearProyecto(pro);
    }
    
    @PostMapping("proyecto/editar")
    public void editarProyecto(@RequestBody Proyecto pro){
        proSer.editarProyecto(pro);
    }
    
    @GetMapping("proyecto/traer")
    @ResponseBody
    public List<Proyecto> TraerProyecto(){
        return proSer.traerProyectos();
    }
    
    @GetMapping("proyecto/buscar/{id}")
    @ResponseBody
    public Proyecto BuscarProyecto(@PathVariable Long id){
        return proSer.buscarProyecto(id);
    }
    
    @DeleteMapping("proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proSer.borrarProyecto(id);
    }
    
    @GetMapping("persona/{id}/proyecto")
    @ResponseBody
    public List<Proyecto> traerProyectoPersona(@PathVariable Long id){
        return proSer.traerProyectoPersona(id);
    }
    
    //-------------------Controladores para tecnologia---------------------
    @PostMapping("tecnologia/crear")
    public void crearTecnologia(@RequestBody Tecnologia pro){
        tecSer.crearTecnologia(pro);
    }
    
    @PostMapping("tecnologia/editar")
    public void editarTecnologia(@RequestBody Tecnologia pro){
        tecSer.editarTecnologia(pro);
    }
    
    @GetMapping("tecnologia/traer")
    @ResponseBody
    public List<Tecnologia> TraerTecnologia(){
        return tecSer.traerTecnologias();
    }
    
    @GetMapping("tecnologia/buscar/{id}")
    @ResponseBody
    public Tecnologia BuscarTecnologia(@PathVariable Long id){
        return tecSer.buscarTecnologia(id);
    }
    
    @DeleteMapping("tecnologia/borrar/{id}")
    public void borrarTecnologia(@PathVariable Long id){
        tecSer.borrarTecnologia(id);
    }
    
    @GetMapping("persona/{id}/tecnologia")
    @ResponseBody
    public List<Tecnologia> traerTecnologiaPersona(@PathVariable Long id){
        return tecSer.traerTecnologiaPersona(id);
    }
    
    //-------------------Controladores para persona---------------------
    @PostMapping("persona/crear")
    public void crearPersona(@RequestBody Persona pro){
        perSer.crearPersona(pro);
    }
    
    @PostMapping("persona/editar")
    public void editarPersona(@RequestBody Persona pro){
        perSer.editarPersona(pro);
    }
    
    @GetMapping("persona/buscar/{id}")
    @ResponseBody
    public Persona BuscarPersona(@PathVariable Long id){
        return perSer.buscarPersona(id);
    }
    
    @DeleteMapping("persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        perSer.borrarPersona(id);
    }

    
}
