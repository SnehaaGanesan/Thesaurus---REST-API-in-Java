package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class SynonymsFinder {

	public ArrayList<HashSet<String>> synonymsdict() throws Exception {
		ArrayList<HashSet<String>> thesaurus = new ArrayList<HashSet<String>>();
		File file = new File("thes.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] hostarr;
		while ((line = br.readLine()) != null) {
			HashSet<String> syns = new HashSet<String>();
			hostarr = line.trim().split("\\s*,\\s*");
			for (int i = 0; i < hostarr.length; i++) {
				syns.add(hostarr[i].toLowerCase());
			}
			thesaurus.add(syns);
		}

		br.close();
		return thesaurus;
	}

	public static ArrayList<String> getWords(String letters, ArrayList<HashSet<String>> synonymsDict) throws Exception {
		if (Pattern.compile("[0-9]").matcher(letters).find() == true
				|| Pattern.compile("[!@#$%^&*|_+]").matcher(letters).find() == true) {
			return new ArrayList<String>();
		}
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < synonymsDict.size(); i++) {
			HashSet<String> temp = synonymsDict.get(i);
			if (temp.contains(letters)) {
				result.addAll(temp);
				return result;
			}
		}
		return result;
	}
}
