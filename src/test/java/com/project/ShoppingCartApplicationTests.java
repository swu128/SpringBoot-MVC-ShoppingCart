package com.project;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.project.controllers.PriceController;
import com.project.entities.Item;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartApplicationTests {

	private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new PriceController()).build();

	@Test
	public void itemTestCreateTldNotNull() {
		Item item = new Item();
		item.setTLD(".com");
		assertNotNull(item.getTLD());
	}

	@Test
	public void itemTestCreateComUpdatedPriceSet() {
		Item item2 = new Item();
		item2.setComUpdatedPrice(19.99);
		assertTrue(item2.getComUpdatedPrice()==(19.99));
	}

	@Test
	public void testPriceMvcController() throws Exception {
	       mockMvc.perform(get("/FAKEDOMAIN"))
	                   .andExpect(status().is(404));
	}
}

