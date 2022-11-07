package com.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Parentesco {

    private Integer id_parentesco;
    private String no_parentesco;
    private String il_activo;
}
