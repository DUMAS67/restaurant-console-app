package dev.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.entite.Plat;

@Repository

public class PlatDaoJdbc implements IPlatDao {

	  // outil JdbcTemplate fourni par Spring JDBC 
	private JdbcTemplate jdbcTemplate;
	// injection de la source de données     
	public PlatDaoJdbc(DataSource datasource) {
	this.jdbcTemplate = new JdbcTemplate(datasource);
			
	}

	
	
	@Override
	public List<Plat> listerPlats() {
		// TODO Auto-generated method stub
		  String sql = "SELECT * FROM plat";
		  // exécution de la requête et récupération du résultat    
		  
		  List<Plat> plats = this.jdbcTemplate.query(sql, new PlatMapper());

		  return plats;
	}

	@Override
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		
		
		String sql = "INSERT INTO PLAT (NOM, PRIXENCENTIMESEUROS) VALUES(?,?)"; 
		jdbcTemplate.update(sql, nomPlat, prixPlat);

		// TODO Auto-generated method stub

	}

}
