package one.digitalinovation.listaencadeada;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<String> myList = new ListaEncadeada<String>();
		
		myList.add("Test1");
		myList.add("Test2");
		myList.add("Test3");
		myList.add("Test4");
		
		System.out.println(myList.get(0));
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		System.out.println(myList.get(3));
		
		System.out.println(myList);
		
		System.out.println(myList.remove(3));
		System.out.println(myList);
	}

}
