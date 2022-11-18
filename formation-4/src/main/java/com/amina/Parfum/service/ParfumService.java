package com.amina.Parfum.service;

import java.util.List;

import com.amina.Parfum.entities.Marque;
import com.amina.Parfum.entities.Parfum;

public interface ParfumService {
	Parfum saveParfum(Parfum  p);
	Parfum  updateParfum(Parfum  p);
	void deleteParfum(Parfum  p);
	void deleteParfumById(Long id);
	Parfum getParfum(Long id);
	List<Parfum > getAllParfums();
	List<Parfum> findByNomParfum(String nom);
	List<Parfum> findByNomParfumContains(String nom);
	List<Parfum> findByNomPrix (String nom, Double prix);
	List<Parfum> findByMarque (Marque marque);
	List<Parfum> findByMarqueIdCat(Long id);
	List<Parfum> findByOrderByNomParfumAsc();
	List<Parfum> trierParfumsNomsPrix();

}
