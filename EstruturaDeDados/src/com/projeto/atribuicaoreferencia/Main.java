package com.projeto.atribuicaoreferencia;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		System.out.println("Int a = "+a+ " Int b = "+ b);
		a = 2;
		System.out.println("Int a = "+a+ " Int b = "+ b);
		
		MeuObj objA = new MeuObj(10);
		MeuObj objB = objA;
		System.out.println("Int a = "+objA+ " Int b = "+ objB);	
		objA.setNum(2);
		System.out.println("Int a = "+objA+ " Int b = "+ objB);	
	}
	

}
