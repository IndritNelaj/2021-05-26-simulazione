package it.polito.tdp.yelp.model;

import java.time.Year;
import java.util.List;

import it.polito.tdp.yelp.db.YelpDao;

public class Model {
	
	public List<String> getAllCities() {
	YelpDao dao = new YelpDao() ;
	return dao.getAllCities();
	}
	
	
}
