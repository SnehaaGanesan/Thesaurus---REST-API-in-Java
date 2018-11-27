package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SynonymsController {

	@Autowired
	private SynonymsFinder synonyms;
	private ArrayList<HashSet<String>> synonymsDict;

	@PostConstruct
	public void synonymsdictionary() throws Exception {
		synonymsDict = synonyms.synonymsdict();
	}

	@ResponseBody
	@RequestMapping(value = "/words/{letters}", produces = "application/json")
	public ArrayList<String> getWords(@PathVariable("letters") String letters) throws Exception {
		ArrayList<String> words = SynonymsFinder.getWords(letters.toLowerCase(), synonymsDict);
		return words;
	}
}
