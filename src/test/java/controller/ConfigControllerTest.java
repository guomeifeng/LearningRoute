package controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc

public class ConfigControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getTest() throws Exception {
		System.out.print(mvc);
		mvc.perform(MockMvcRequestBuilders.get("/string"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello")));
	}
	
	@Nested
	@SpringBootTest
	@AutoConfigureMockMvc
	@AutoConfigureRestDocs
	class NestedTests {
		@Test
		public void sampleNested() throws Exception {
			mvc.perform(MockMvcRequestBuilders.get("/string"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello")));
		}
	}
}