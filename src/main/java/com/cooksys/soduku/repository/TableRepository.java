package com.cooksys.soduku.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cooksys.soduku.entity.Table;

@Repository
public class TableRepository {

	private EntityManager em;

	public TableRepository(EntityManager em) {
		this.em = em;
	}
	
	public List<Table> getAll() {
		return em.createQuery("FROM soduku_table", Table.class).getResultList();
	}

	public Table get(Integer id) {
		return em.createQuery("FROM soduku_table WHERE id=" + id, Table.class).getSingleResult();
	}

	@Transactional
	public void add(Table table) {
		em.persist(table);
	}

}
