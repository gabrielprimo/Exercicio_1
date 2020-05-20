package br.unisantos.fehidro.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManager {
	private static EntityManagerFactory emf = null;
	   private static final String PU_NAME = "fehidroPU";

	   public static EntityManager getEntityManager() {
	      if (emf == null) {
	         emf = Persistence.
	              createEntityManagerFactory(PU_NAME);
	      }
	      return emf.createEntityManager();
	   }
}
