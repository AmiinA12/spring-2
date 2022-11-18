package com.amina.Parfum;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amina.Parfum.entities.Marque;
import com.amina.Parfum.entities.Parfum;
import com.amina.Parfum.repos.ParfumRepository;

@SpringBootTest
class Formation4ApplicationTests {
	@Autowired
	private ParfumRepository parfumRepository;

	@Test
	public void testCreateParfum() {
		Parfum parf = new Parfum("olampia",2200.500,new Date());
		 parfumRepository .save(parf);
		}
	@Test
	public void testFindParfum()
	{
	Parfum p = parfumRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateParfum()
	{
	Parfum p = parfumRepository.findById(1L).get();
	p.setPrixParfum(1000.0);
	parfumRepository.save(p);
	}
	@Test
	public void testDeleteParfum()
	{
	parfumRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousParfums()
	{
	List<Parfum> prods = parfumRepository.findAll();
	for (Parfum p : prods)
	{
	System.out.println(p);
	}}
	@Test
	public void testFindParfumByNom()
	{
	List<Parfum> prods = parfumRepository.findByNomParfum("channel");
	for (Parfum p : prods)
	{
	System.out.println(p);
	}}
	@Test
	public void testFindParfumByNomContains()
	{
	List<Parfum> prf = parfumRepository.findByNomParfumContains("c");
	for (Parfum p : prf)
	{
	System.out.println(p);
	}}
	@Test
	public void testfindByNomPrix()
	{
	List<Parfum> prf = parfumRepository.findByNomPrix("dior", 2200.5);
	for (Parfum p : prf)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByMarque()
	{
	Marque mrq = new Marque();
	mrq.setIdMrq(1L);
	List<Parfum> prods = parfumRepository.findByMarque(mrq);
	for (Parfum p : prods)
	{
	System.out.println(p);
	}}
	
	@Test
	public void findByMarqueIdMrq()
	{
	List<Parfum> prods = parfumRepository.findByMarqueIdMrq(1L);
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomParfumAsc()
	{
	List<Parfum> prods =
	parfumRepository.findByOrderByNomParfumAsc();
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierParfumsNomsPrix()
	{
	List<Parfum> prods = parfumRepository.trierParfumsNomsPrix();
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}

}
