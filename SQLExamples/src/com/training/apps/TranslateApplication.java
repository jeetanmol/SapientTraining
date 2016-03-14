package com.training.apps;

import java.util.Scanner;

import com.training.maps.TranslateService;

public class TranslateApplication {

	public static void main(String[] args) {
		
		String hindiWord;
		
		TranslateService translateService = new TranslateService();
		
		System.out.println("Enter the Hindi word you need to find : ");
		
		Scanner scn = new Scanner(System.in);
		
		hindiWord = scn.next();
		
		System.out.println(translateService.findEnglishWord(hindiWord));
		
		translateService.printWords();
		scn.close();
		
	}
}
