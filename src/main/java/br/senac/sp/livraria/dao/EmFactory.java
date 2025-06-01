package br.senac.sp.livraria.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

// "equivale" ao ConnectionFactory
public class EmFactory {
	private static final EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("senac");
	
	// "equivale" a pegar uma conexão com o banco
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
