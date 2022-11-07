package com.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Ubigeo {

    private String codigo_ubigeo;
    private String descripcion_departamento;
    private String descripcion_provincia;
    private String descripcion_distrito;
    private String fl_estado;
    private String codigo_departamento;
    private String codigo_provincia;
    private String codigo_distrito;
}
