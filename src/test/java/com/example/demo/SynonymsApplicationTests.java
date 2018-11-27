package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SynonymsApplicationTests {
	@Autowired
	private SynonymsFinder synonyms;

	@Test
	public void ThesaurusLoads() throws Exception {
		ArrayList<HashSet<String>> synonymsDict = synonyms.synonymsdict();
		Assert.assertNotNull(synonymsDict);
		Assert.assertEquals(synonymsDict.size(), 104);
		Assert.assertEquals(synonymsDict.get(69).contains("stout"), true);
	}

	@Test
	public void checkOutput() throws Exception {
		String[] expected = {"area","set","dwelling","space","site","plot","spot","station","location","place","position","state","region","residence","situation","status"};
		ArrayList<HashSet<String>> synonymsDict = synonyms.synonymsdict();
		ArrayList<String> result = SynonymsFinder.getWords("status", synonymsDict);
		Assert.assertNotNull(result);
		Assert.assertEquals(expected.length, result.size());
	}
}
