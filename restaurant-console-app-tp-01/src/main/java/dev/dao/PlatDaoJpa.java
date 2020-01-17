package dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.entite.Plat;

@Repository
public class PlatDaoJpa implements IPlatDao {

	// injecter une instance d'EntityManager  
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public List<Plat> listerPlats() {

		String sql = "SELECT p FROM Plat p";

		// exécution de la requête et récupération du résultat  

		TypedQuery<Plat> query = em.createQuery(sql, Plat.class);
		List<Plat> plats = query.getResultList();
		return plats;
	}

	@Transactional
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		// TODO Auto-generated method stub

		em.persist(new Plat(nomPlat, prixPlat));

	}

}
