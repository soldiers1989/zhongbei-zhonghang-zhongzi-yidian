package com.waben.stock.collector.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * 支付订单 Test
 * 
 * @author luomengan
 *
 */
public class PaymentOrderControllerTest extends BaseControllerTest {

	@Test
	public void fetchById() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/paymentOrder/{id}", 1).accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk()).andExpect(jsonPath("$.result.id").value("1"));
	}

	@Test
	public void addition() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/paymentOrder/")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void modification() throws Exception {
		mvc.perform(MockMvcRequestBuilders.put("/paymentOrder/")
				.param("id", "10")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result.id").value(10));
	}
	
	@Test
	public void delete() throws Exception {
		mvc.perform(MockMvcRequestBuilders.delete("/paymentOrder/{id}", 10)
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result").value(10));
	}
	
	@Test
	public void paymentOrders() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/paymentOrder/page")
				.param("page", "0")
				.param("limit", "10")
				.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.result.size").isNumber());
	}
	
}