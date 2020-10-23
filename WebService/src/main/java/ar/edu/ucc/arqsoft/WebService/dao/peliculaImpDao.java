package ar.edu.ucc.arqsoft.WebService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqsoft.WebService.model.Pelicula;


@Repository
public class peliculaImpDao extends GenericDaoImp<Pelicula, Long> implements peliculaDao {

	@Override
	public List<Pelicula> findByName(String titulo) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pelicula> criteria = builder.createQuery(Pelicula.class);
        Root<Pelicula> entity = criteria.from(Pelicula.class);

        criteria.select(entity).where(builder.equal(entity.get("titulo"),titulo));
        return em.createQuery(criteria).getResultList();
	}
}
