package com.projeto.no;

public class Main {

	public static void main(String[] args) {
		
		No<String> no1 = new No<>("Content no1");
		
		No<String> no2 = new No<>("Content no2");
		no1.setnextNo(no2);
		
		No<String> no3 = new No<>("Content no3");
		no2.setnextNo(no3);
		
		No<String> no4 = new No<>("Content no4");
		no3.setnextNo(no4);
		
		System.out.println(no1.getnextNo());
		System.out.println(no2);
		
		//Conceito sobre no , sempre estara ligado ao proxima apenas o ultimo nó que aponta para null
		//por nao seguir adiante 
		System.out.println("----------");
		System.out.println(no1);
		System.out.println(no1.getnextNo());
		System.out.println(no1.getnextNo().getnextNo());
		System.out.println(no1.getnextNo().getnextNo().getnextNo().getnextNo());
	}

}
