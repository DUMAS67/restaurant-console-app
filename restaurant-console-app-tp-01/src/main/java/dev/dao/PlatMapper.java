package dev.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dev.entite.Plat;

public class PlatMapper implements RowMapper<Plat> {

	@Override
	public Plat mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Plat p = new Plat();
		p.setId(rs.getInt("ID"));
		p.setNom(rs.getString("NOM"));
		p.setPrixEnCentimesEuros(rs.getInt("PRIXENCENTIMESEUROS"));
		return p;
	}
	
	
	

}
