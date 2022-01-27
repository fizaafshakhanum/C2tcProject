package technoserve.c2tc.b5.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import technoserve.c2tc.b5.entities.Item;

public interface ItemRepo extends JpaRepository<Item,Integer> {
	

}
