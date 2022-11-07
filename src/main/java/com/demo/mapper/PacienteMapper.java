package com.demo.mapper;

import com.demo.model.Paciente;
import com.demo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacienteMapper {

    public List<Paciente> getAllPacientes(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Paciente> pacienteList = session.selectList("getAllPacientes");
        session.commit();
        session.close();
        return pacienteList;
    }

    public Paciente savePaciente(Paciente paciente){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.insert("insertPaciente", paciente);
        session.commit();
        session.close();
        return paciente;
    }

    public void updatePaciente(Paciente paciente){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.update("updatePaciente", paciente);
        session.commit();
        session.close();
    }

    public void deletePaciente(int id_paciente){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.delete("deletePaciente", id_paciente);
        session.commit();
        session.close();
    }
    public Paciente findById(int id_paciente){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Paciente paciente = (Paciente) session.selectOne("findById", id_paciente);
        session.commit();
        session.close();
        return paciente;
    }
}
