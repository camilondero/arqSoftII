package ar.edu.ucc.arqsoft.WebService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqsoft.WebService.model.Socio;

@Repository
public class socioImpDao extends GenericDaoImp<Socio, Long> implements socioDao{
	
	@Override
	public List<Socio> findByName(String nombre) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Socio> criteria = builder.createQuery(Socio.class);
        Root<Socio> entity = criteria.from(Socio.class);

        criteria.select(entity).where(builder.equal(entity.get("nombre"), nombre));
        return em.createQuery(criteria).getResultList();
	}

}
