package com.decksy.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.TypedQuery;


@Entity
@Table(name = "DeckList")
public class DeckList {

	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("decksy");
	private static Card card;
	
	private static void main(String[] args) {
	ENTITY_MANAGER_FACTORY.close();
	}
	
	/* Adds cards to the card list */
	public static void addCard (long id, String cardName, String notes){
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et= em.getTransaction();
			et.begin();
			Card card= new Card();
			card.setCardName(cardName);
			card.setNotes(notes);
			em.persist(card);
			et.commit();
		}
		catch(Exception ex) {
			if(et != null) {
				et.rollback();
			}
		ex.printStackTrace();
		}
		finally {
			em.close();
		}		  
	  }
	
	/* removes cards from card list */
	public static void deleteCard (long id){
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et= em.getTransaction();
			et.begin();
			Card card = em.find(Card.class, id);
			em.remove(card);

		}
		catch(Exception ex) {
			if(et != null) {
				et.rollback();
			}
		ex.printStackTrace();
		}
		finally {
			em.close();
		}		  
	  }
	
	public static void getCard(long id) {
		EntityManager em= ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT from c FROM CardList c WHERE c.id = : cardID";
		
		TypedQuery<Card> tq = em.createQuery(query, Card.class);
		tq.setParameter("cardID", id);
		Card card = null;
		try {
			card = tq.getSingleResult();
			System.out.println(card.getCardName() + " ");		
		}
		catch (NoResultException ex) {
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
	}
	
	public static List<Card> getDeckList() {
		EntityManager em= ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery = "SELECT from c FROM CardList c WHERE c.id IS NOT NULL";
		
		TypedQuery<Card> tq = em.createQuery(strQuery, Card.class);
		List<Card> cards = null;
		
		try {
			cards = tq.getResultList();
			return cards;	
		}
		catch (NoResultException ex) {
			ex.printStackTrace();
			
		}
		finally {
			em.close();
		}
		return cards;
	}
		
}
