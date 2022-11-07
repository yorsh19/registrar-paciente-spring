package com.demo.controller;

import com.demo.mapper.GeneralMapper;
import com.demo.model.Parentesco;
import com.demo.model.Sexo;
import com.demo.model.TipoDocumento;
import com.demo.model.Ubigeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/general")
@CrossOrigin
public class GeneralController {

    @Autowired
    GeneralMapper generalMapper;

    @RequestMapping("/listOfSexo")
    public List<Sexo> showListOfSexo(){
        return generalMapper.getAllSexo();
    }

    @RequestMapping("/listOfParentesco")
    public List<Parentesco> showListOfParentesco(){
        return generalMapper.getAllParentesco();
    }

    @RequestMapping("/listOfTipoDocumento")
    public List<TipoDocumento> showListOfTipoDocumento(){
        return generalMapper.getAllTipoDocumento();
    }

    @RequestMapping("/listOfUbigeo")
    public List<Ubigeo> showListOfUbigeo(){
        return generalMapper.getAllUbigeo();
    }

}
