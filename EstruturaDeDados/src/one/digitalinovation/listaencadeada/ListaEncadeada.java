package one.digitalinovation.listaencadeada;

public class ListaEncadeada<T> {

	No<T> refInput;

	public ListaEncadeada() {
		this.refInput = null;
	}

	public void add(T contet) {
		No<T> newNo = new No<>(contet);
		if(this.isEmpty()) {
			refInput = newNo;
			return;
		}
		
		No<T> noAuxiliar = refInput;
		for(int i = 0; i < this.size()-1; i++) {
			noAuxiliar = noAuxiliar.getNextNo();
		}
		noAuxiliar.setNextNo(newNo);
		
	}
	
	public int size() {
		int sizeList = 0;
		No<T> refAuxiliar = refInput;

		while (true) {
			if (refAuxiliar != null) {
				sizeList++;
				if (refAuxiliar.getNextNo() != null) {
					refAuxiliar = refAuxiliar.getNextNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return sizeList;
	}

	public boolean isEmpty() {
		return refInput == null ? true : false;
	}

}
