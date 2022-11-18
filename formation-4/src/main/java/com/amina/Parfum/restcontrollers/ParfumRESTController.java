package com.amina.Parfum.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amina.Parfum.entities.Parfum;
import com.amina.Parfum.service.ParfumService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ParfumRESTController {
	@Autowired
	ParfumService parfumService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Parfum> getAllParfums() {
		return parfumService.getAllParfums();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Parfum getParfumById(@PathVariable("id") Long id) {
	return parfumService.getParfum(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Parfum createParfum(@RequestBody Parfum parfum) {
	return parfumService.saveParfum(parfum);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Parfum updateParfum(@RequestBody Parfum parfum) {
	return parfumService.updateParfum(parfum);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteParfum(@PathVariable("id") Long id)
	{
	parfumService.deleteParfumById(id);
	}
	@RequestMapping(value="/prfumsmrq/{idMrq}",method = RequestMethod.GET)
	public List<Parfum> getParfumsByMrqId(@PathVariable("idMrq") Long idMrq) {
	return parfumService.findByMarqueIdCat(idMrq);
	}
	@RequestMapping(value="/prfsByName/{nom}",method = RequestMethod.GET)
	public List<Parfum> findByNomParfumtContains(@PathVariable("nom") String nom) {
	return parfumService.findByNomParfumContains(nom);
	}
	
	}


