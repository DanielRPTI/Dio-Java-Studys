package one.digitalinovation.listaencadeada;

public class ListaEncadeada<T> {

	No<T> refInput;

	public ListaEncadeada() {
		this.refInput = null;
	}

	public void add(T contet) {
		No<T> newNo = new No<>(contet);
		if (this.isEmpty()) {
			refInput = newNo;
			return;
		}

		No<T> noAuxiliar = refInput;
		for (int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getNextNo();
		}
		noAuxiliar.setNextNo(newNo);

	}

	private No<T> getNo(int index) {

		validatedIndex(index);
		No<T> noAuxiliar = refInput;
		No<T> noReturn = null;
		for (int i = 0; i < this.size() - 1; i++) {
			noReturn = noAuxiliar;
			noAuxiliar = noAuxiliar.getNextNo();
		}
		return noReturn;
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

	private void validatedIndex(int index) {
		if (index >= size()) {
			int lastIndex = size() - 1;
			throw new IndexOutOfBoundsException("Doesnt exist content in index" + index
					+ "  this list. This list only go to index" + lastIndex + ".");
		}
	}

	public boolean isEmpty() {
		return refInput == null ? true : false;
	}

}
