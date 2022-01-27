package technoserve.c2tc.b5.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import technoserve.c2tc.b5.entities.Item;
import technoserve.c2tc.b5.repo.ItemRepo;

@Service
public class ItemServiceImplementation implements ItemService {
        ItemRepo ir;
  

	@Override
	@RequestMapping
	public void addItem(Item item)
	{
		ir.save(item);
	}


	@Override
	public void updateItem(Item item)
	{
		
		ir.save(item);
	}


	@Override
	public Item getItem(int id)
	{
		return ir.findById(id).get();
	}


	@Override
	public String deleteItem(int id) {
		Item item = ir.findById(id).get();
		ir.delete(item);
		return " The Item with id=" + id + " is successfully deleted";
	}

}
