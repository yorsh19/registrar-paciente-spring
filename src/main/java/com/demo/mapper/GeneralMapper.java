package com.demo.mapper;

import com.demo.model.Parentesco;
import com.demo.model.Sexo;
import com.demo.model.TipoDocumento;
import com.demo.model.Ubigeo;
import com.demo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GeneralMapper {

    public List<Sexo> getSexo(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Sexo> sexoList = session.selectList("getSexo");
        session.commit();
        session.close();
        return sexoList;
    }

    public List<TipoDocumento> getTipoDocumento(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<TipoDocumento> tipoDocumentoList = session.selectList("getTipoDocumento");
        session.commit();
        session.close();
        return tipoDocumentoList;
    }

    public List<Ubigeo> getUbigeo(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Ubigeo> ubigeoList = session.selectList("getUbigeo");
        session.commit();
        session.close();
        return ubigeoList;
    }

    public List<Parentesco> getAllParentesco(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Parentesco> parentescoList = session.selectList("getAllParentesco");
        session.commit();
        session.close();
        return parentescoList;
    }

    public List<Sexo> getAllSexo(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Sexo> sexoList = session.selectList("getAllSexo");
        session.commit();
        session.close();
        return sexoList;
    }

    public List<TipoDocumento> getAllTipoDocumento(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<TipoDocumento> tipoDocumentoList = session.selectList("getAllTipoDocumento");
        session.commit();
        session.close();
        return tipoDocumentoList;
    }

    public List<Ubigeo> getAllUbigeo(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Ubigeo> ubigeoList = session.selectList("getAllUbigeo");
        session.commit();
        session.close();
        return ubigeoList;
    }

}
