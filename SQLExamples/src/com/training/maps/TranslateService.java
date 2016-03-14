package com.training.maps;

import java.util.*;
public class TranslateService {

	
	private HashMap<String, String> hindiToEnglish ;
	
	public TranslateService(){
		hindiToEnglish = new HashMap<String,String>();
		init();
		
	
	}
	
	public void init(){
		
		hindiToEnglish.put("haan", "yes");
		hindiToEnglish.put("nhi", "no");
		hindiToEnglish.put("ek", "one");
		hindiToEnglish.put("hum", "we");
		hindiToEnglish.put("daal", "lentils");
		
		
	}
	
	public String findEnglishWord(String hindiWord){
		
		return hindiToEnglish.get(hindiWord);
		
		
	}
	
	public void printWords(){
		
		Set<Map.Entry<String, String>> list = 
				hindiToEnglish.entrySet();
		
		System.out.println("Hindi-English Words are");
		for(Map.Entry<String, String> words : list)
		{
			System.out.println(words.getKey() + " := " + words.getValue());
		}
		
		
	}
	
}
