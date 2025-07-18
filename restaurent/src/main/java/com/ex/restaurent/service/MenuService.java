package com.ex.restaurent.service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.ex.restaurent.entity.Menu;
import com.ex.restaurent.repository.MenuRepository;
	@Service
	public class MenuService {
	    @Autowired private MenuRepository repo;
	    public List<Menu> getAll() { return repo.findAll(); }
	    public void save(Menu menu) { repo.save(menu); }
	    public void delete(Long id) { repo.deleteById(id); }
	}
