package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Item;

public class ItemDaoImplementation implements Itemdao {
	EntityManager em;
	

	public ItemDaoImplementation() {
		em=Configuration.createEntityManager();
	}

	@Override
	public void addItem(Item item) {
		em.persist(item);
	}

	@Override
	public void updateItem(Item item) {
		em.merge(item);
		
	}

	@Override
	public void deleteItem(int uid) {
		Item item =SearchItem(uid);
		em.remove( item);
		
	}

	@Override
	public Item SearchItem(int uid) {
		Item item=em.find(Item.class,uid);
		return item;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void EndTransaction() {
		em.getTransaction().commit();
	}
	

}
