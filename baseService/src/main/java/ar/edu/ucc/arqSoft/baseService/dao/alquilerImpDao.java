package ar.edu.ucc.arqSoft.baseService.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Alquiler;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;


@Repository

public class alquilerImpDao extends GenericDaoImp<Alquiler, Long> implements alquilerDao{

}
