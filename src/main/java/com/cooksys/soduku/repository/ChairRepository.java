package com.cooksys.soduku.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.soduku.entity.Chair;

@Repository
public class ChairRepository {

	EntityManager em;
	
	public ChairRepository(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void updateChair(Chair chair) {
		em.merge(chair);
	}
	
	@Transactional
	public void addChair(Chair chair) {
		em.persist(chair);
		System.out.println("Saved Chair, assigned ID[" + chair.getId() + "]");
	}
	
	public Chair getById(int id) {
		return em.createQuery("FROM Chair WHERE id = " + id, Chair.class).getSingleResult();
	}

	public List<Chair> getAll() {
		return em.createQuery("FROM Chair", Chair.class).getResultList();
	}
	
	public List<Chair> getByLegs(int minLegs) {
		return em.createQuery("FROM Chair WHERE numberOfLegs > " + minLegs, Chair.class).getResultList();
	}
}
