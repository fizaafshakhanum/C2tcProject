package technoserve.c2tc.b5.service;


import technoserve.c2tc.b5.entities.Item;

public interface ItemService {
	public void addItem(Item item);
	public void updateItem(Item item);
	public Item getItem(int id);
	public String deleteItem(int id);

}
