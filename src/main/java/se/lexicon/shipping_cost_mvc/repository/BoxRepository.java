package se.lexicon.shipping_cost_mvc.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.shipping_cost_mvc.entity.Box;

public interface BoxRepository extends CrudRepository<Box,String> {
}
