package com.jak.display.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jak.display.core.entity.Display;
import com.jak.display.core.repository.DisplayRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class DisplayRepositoryTest {

	@Autowired 
	private DisplayRepository displayRepository;
	
	
	@Test
	public void test() {
		System.out.println(displayRepository);
		
		displayRepository.save(new Display("asd"));
		
		displayRepository.findAll().forEach( p -> {
			System.out.println(p.getName()+" / " + p.getId());
		});
	}
	
}
