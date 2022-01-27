package technoserve.c2tc.b5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import technoserve.c2tc.b5.entities.Item;

import technoserve.c2tc.b5.service.ItemService;

@RestController
public class Controller {
	@Autowired
	ItemService is;
	@PostMapping("/addItem")
	public void  addItem(@RequestBody Item item)
	{
		is.addItem(item);
	}
	
	@PutMapping("/updateItem")
	public void updateItem(@RequestBody Item item) {
		is.updateItem(item);
		
	}
	@GetMapping("/getItem/{id}")
	public Item getItem(@PathVariable int id) {
		return is.getItem(id);
		
	}
	@DeleteMapping("/deleteItem/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return is.deleteItem(id);
		
	}
}