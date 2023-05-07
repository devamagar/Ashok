package com.esto;

import java.io.Serializable;


public class Estoe {
@Entity
@table(name="product")
	public class product implements Serializable{
		private static final long serialversionuid=1L;
		@id
		@generatedvalue(strategy=generationtype.auto)
		@column(name="id")
		private Integer id;
		
		private Integer productid;
		
	}
}
