package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class TipoDocumento {

    private Integer id_tipo_documento_identidad;
    private String descripcion_tipo_documento_identidad;
    private String codigo_ieds;
    private String fl_estado;

}
