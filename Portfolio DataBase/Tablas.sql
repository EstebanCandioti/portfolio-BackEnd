CREATE SCHEMA `Portfolio` DEFAULT CHARACTER SET utf8 ;
USE `Portfolio` ;

-- -----------------------------------------------------
-- Table `Portfolio`.`Persona`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Persona` (
  `idPersona` INT NOT NULL,
  `nombre_persona` VARCHAR(45) NOT NULL,
  `apellido_persona` VARCHAR(45) NOT NULL,
  `edad` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idPersona`))


-- -----------------------------------------------------
-- Table `Portfolio`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `nombre_usuario` VARCHAR(45) NOT NULL,
  `contrasenia` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idUsuario`, `Persona_idPersona`),
  INDEX `fk_Usuario_Persona_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Persona`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)



-- -----------------------------------------------------
-- Table `Portfolio`.`Estudios`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Estudios` (
  `idEstudios` INT NOT NULL,
  `nombre_institucion` VARCHAR(45) NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `fecha_inicio` DATE NOT NULL,
  ` fecha_finalizacion` DATE NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idEstudios`, `Persona_idPersona`),
  INDEX `fk_Estudios_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Estudios_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)



-- -----------------------------------------------------
-- Table `Portfolio`.`Fotos_estudios`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Fotos_estudios` (
  `idFotos_estudios` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `carpeta` VARCHAR(100) NOT NULL,
  `fecha` DATE NOT NULL,
  `Estudios_idEstudios` INT NOT NULL,
  `Estudios_Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idFotos_estudios`, `Estudios_idEstudios`, `Estudios_Persona_idPersona`),
  INDEX `fk_Fotos_estudios_Estudios1_idx` (`Estudios_idEstudios` ASC, `Estudios_Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Fotos_estudios_Estudios1`
    FOREIGN KEY (`Estudios_idEstudios` , `Estudios_Persona_idPersona`)
    REFERENCES `Portfolio`.`Estudios` (`idEstudios` , `Persona_idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Trabajos`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Trabajos` (
  `idTrabajos` INT NOT NULL,
  `nombre_trabajo` VARCHAR(45) NOT NULL,
  `posicio_laboral` VARCHAR(45) NOT NULL,
  `descripcion_laboral` VARCHAR(200) NOT NULL,
  ` fecha_inicio` VARCHAR(45) NOT NULL,
  `fecha_finalizacion` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idTrabajos`, `Persona_idPersona`),
  INDEX `fk_Trabajos_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Trabajos_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Fotos_trabajos`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Fotos_trabajos` (
  `idFotos_trabajos` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `carpeta` VARCHAR(100) NOT NULL,
  `fecha` DATE NOT NULL,
  `Trabajos_idTrabajos` INT NOT NULL,
  `Trabajos_Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idFotos_trabajos`, `Trabajos_idTrabajos`, `Trabajos_Persona_idPersona`),
  INDEX `fk_Fotos_trabajos_Trabajos1_idx` (`Trabajos_idTrabajos` ASC, `Trabajos_Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Fotos_trabajos_Trabajos1`
    FOREIGN KEY (`Trabajos_idTrabajos` , `Trabajos_Persona_idPersona`)
    REFERENCES `Portfolio`.`Trabajos` (`idTrabajos` , `Persona_idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Provincia`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Provincia` (
  `idProvincia` INT NOT NULL,
  `nombre_provincia` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProvincia`))

-- -----------------------------------------------------
-- Table `Portfolio`.`Ciudad`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Ciudad` (
  `idCiudad` INT NOT NULL,
  `nombre_ciudad` VARCHAR(45) NOT NULL,
  `Provincia_idProvincia` INT NOT NULL,
  PRIMARY KEY (`idCiudad`, `Provincia_idProvincia`),
  INDEX `fk_Ciudad_Provincia1_idx` (`Provincia_idProvincia` ASC) VISIBLE,
  CONSTRAINT `fk_Ciudad_Provincia1`
    FOREIGN KEY (`Provincia_idProvincia`)
    REFERENCES `Portfolio`.`Provincia` (`idProvincia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Domicilio`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Domicilio` (
  `idDomicilio` INT NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  `Ciudad_idCiudad` INT NOT NULL,
  PRIMARY KEY (`idDomicilio`, `Persona_idPersona`, `Ciudad_idCiudad`),
  INDEX `fk_Domicilio_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  INDEX `fk_Domicilio_Ciudad1_idx` (`Ciudad_idCiudad` ASC) VISIBLE,
  CONSTRAINT `fk_Domicilio_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Domicilio_Ciudad1`
    FOREIGN KEY (`Ciudad_idCiudad`)
    REFERENCES `Portfolio`.`Ciudad` (`idCiudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Tecnologias`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Tecnologias` (
  `idTecnologias` INT NOT NULL,
  `nombre_tecnologias` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idTecnologias`, `Persona_idPersona`),
  INDEX `fk_Tecnologias_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Tecnologias_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table `Portfolio`.`Habilidades_fuertes`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Habilidades_fuertes` (
  `idHabilidades_fuertes` INT NOT NULL,
  `habilidades` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idHabilidades_fuertes`, `Persona_idPersona`),
  INDEX `fk_Habilidades_fuertes_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Habilidades_fuertes_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

-- -----------------------------------------------------
-- Table `Portfolio`.`Habilidades_debiles`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Habilidades_debiles` (
  `idHabilidades_debiles` INT NOT NULL,
  `habilidades` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idHabilidades_debiles`, `Persona_idPersona`),
  INDEX `fk_Habilidades_debiles_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Habilidades_debiles_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

-- -----------------------------------------------------
-- Table `Portfolio`.`Proyectos`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Proyectos` (
  `idProyectos` INT NOT NULL,
  `nombre_proyecto` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `links` VARCHAR(100) NOT NULL,
  `fecha_iniciacion` DATE NOT NULL,
  `fecha_finalizacion` DATE NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idProyectos`, `Persona_idPersona`),
  INDEX `fk_Proyectos_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Proyectos_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `Portfolio`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

-- -----------------------------------------------------
-- Table `Portfolio`.`Fotos_proyectos`
-- -----------------------------------------------------
CREATE TABLE `Portfolio`.`Fotos_proyectos` (
  `idFotos_proyectos` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `carpeta` VARCHAR(100) NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`idFotos_proyectos`))