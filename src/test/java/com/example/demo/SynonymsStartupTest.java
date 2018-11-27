package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class SynonymsStartupTest {

	@RunWith(SpringRunner.class)
	@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	public class ScrabbleServiceIT {

		@Autowired
		private SynonymsFinder synonyms;

		@Test
		public void testApplicationStartsUp() {
			Assert.assertNotNull(synonyms);
		}
	}
}
