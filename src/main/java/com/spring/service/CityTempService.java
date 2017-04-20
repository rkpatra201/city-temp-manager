package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.command.CityTemp;
import com.spring.exceptions.DataNotFoundException;
import com.spring.repository.CityTempDao;

@Service
public class CityTempService {

	@Autowired
	CityTempDao dao;

	public List<CityTemp> loadAll(String prefix) {
		List<CityTemp> list = dao.loadAll(prefix);
		if (list.size() == 0) {
			throw new DataNotFoundException("Temperature Not Found");
		}
		return list;
	}

}
