package com.amina.Parfum.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Parfum.class })
public interface ParfumProjection {
	public String getNomParfum();

}
