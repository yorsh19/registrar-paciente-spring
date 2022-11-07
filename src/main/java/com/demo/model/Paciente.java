package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Getter @Setter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Paciente {

    private Integer id_paciente;
    private TipoDocumento id_tipo_docide;
    private String no_docide;
    private String no_apepat;
    private String no_apemat;
    private String no_nombres;
    private Sexo id_sexo;
    private Date fe_nacimiento;
    private String no_lugar_nacimiento;
    private String no_direccion;
    private Ubigeo co_ubigeo;
}
