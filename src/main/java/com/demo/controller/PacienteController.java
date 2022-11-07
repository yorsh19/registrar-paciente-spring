package com.demo.controller;

import com.demo.mapper.PacienteMapper;
import com.demo.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
@CrossOrigin
public class PacienteController {

    @Autowired
    PacienteMapper pacienteMapper;

    private static final String PACIENTE = "Paciente";
    private static final String PACIENTELIST = "ListPaciente";

    @GetMapping("/allPacientes")
    public List<Paciente> getPaciente() {
        return pacienteMapper.getAllPacientes();
    }

    @GetMapping("/{id}")
    public Paciente getPacientebyId(@PathVariable(value="id") Integer id){
        return pacienteMapper.findById(id);
    }

    @RequestMapping(value = "/insertar", method = {RequestMethod.POST },produces="application/json")
    @ResponseBody
    public ResponseEntity insertPaciente(@RequestBody Paciente paciente){
        System.out.println(paciente.toString());
        pacienteMapper.savePaciente(paciente);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping(value="/update", method = {RequestMethod.PUT },produces="application/json")
    public String updatePaciente(@RequestBody Paciente paciente){
        try {
            pacienteMapper.updatePaciente(paciente);
            System.out.println(paciente.toString());
            return "ACTUALIZADO CON EXITO";
        } catch (Exception e){
            return e.toString();
        }
    }

    @DeleteMapping("/paciente/{id}")
    public void deletePacientebyId(@PathVariable(value="id") Integer id){
        pacienteMapper.deletePaciente(id);
    }

}
