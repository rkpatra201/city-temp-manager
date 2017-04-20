package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.command.CityTemp;
import com.spring.repository.CityTempDao;

@Service
public class CityTempService {

	@Autowired
	CityTempDao dao;
	
	public List<CityTemp> loadAll(String prefix) {
		return dao.loadAll(prefix);
	}

}
