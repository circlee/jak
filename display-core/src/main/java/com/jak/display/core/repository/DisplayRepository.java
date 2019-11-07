package com.jak.display.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jak.display.core.entity.Display;

@Repository
public interface DisplayRepository extends CrudRepository<Display, Long> {

	
	
}
