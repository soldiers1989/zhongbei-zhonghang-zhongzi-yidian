package com.waben.stock.collector.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * 策略发布人 Test
 * 
 * @author luomengan
 *
 */
public class PublisherControllerTest extends BaseControllerTest {

	@Test
	public void fetchById() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/publisher/{id}", 1).accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk()).andExpect(jsonPath("$.result.id").value("1"));
	}

	@Test
	public void addition() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/publisher/")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void modification() throws Exception {
		mvc.perform(MockMvcRequestBuilders.put("/publisher/")
				.param("id", "10")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result.id").value(10));
	}
	
	@Test
	public void delete() throws Exception {
		mvc.perform(MockMvcRequestBuilders.delete("/publisher/{id}", 10)
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result").value(10));
	}
	
	@Test
	public void publishers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/publisher/page")
				.param("page", "0")
				.param("limit", "10")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result.size").isNumber());
	}
	
}