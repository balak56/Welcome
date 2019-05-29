package org.lan;

public class EnglishLanguage extends TamilLanguage {

	@Override
	void chennai() {
		// TODO Auto-generated method stub
		System.out.println("Chennai");
	}

	@Override
	void salem() {
		// TODO Auto-generated method stub
	System.out.println("Salem");	
	}

	@Override
	void erode() {
		// TODO Auto-generated method stub
		System.out.println("Erode");
	}

	public static void main(String[] args) {
		
		EnglishLanguage el=new EnglishLanguage();
		el.chennai();
		el.salem();
		el.erode();
		el.covai();
	}
	
}
