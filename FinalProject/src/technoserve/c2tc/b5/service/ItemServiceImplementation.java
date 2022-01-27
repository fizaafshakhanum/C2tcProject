package technoserve.c2tc.b5.service;

import technoserve.c2tc.b5.dao.ItemDaoImplementation;
import technoserve.c2tc.b5.dao.Itemdao;
import technoserve.c2tc.b5.entities.Item;

public class ItemServiceImplementation implements ItemService {
	Itemdao itd;
	
	

	public ItemServiceImplementation() {
		itd=new ItemDaoImplementation();
	}

	@Override
	public void addItem(Item item) {
		itd.startTransaction();
		itd.addItem(item);
		itd.EndTransaction();
		
	}

	@Override
	public void updateItem(Item item) {
		itd.startTransaction();
		itd.updateItem(item);
		itd.EndTransaction();
		
	}
	@Override
	public void deleteItem(int uid) {
		itd.startTransaction();
		itd.deleteItem(uid);
		itd.EndTransaction();
	}

	@Override
	public Item SearchItem(int uid) {
		Item item=itd.SearchItem(uid);
		return item;
		
	}

}
