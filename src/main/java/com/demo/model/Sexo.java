package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Sexo {

    @Getter @Setter
    private Integer id_sexo;

    @Getter @Setter
    private String descripcion_sexo;

    @Getter @Setter
    private String fl_estado;
}

