package one.digitalinovation.listaencadeada;

public class ListaEncadeada<T> {

	No<T> refInput;

	public ListaEncadeada() {
		this.refInput = null;
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
