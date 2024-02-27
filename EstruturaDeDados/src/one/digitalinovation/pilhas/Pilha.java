package one.digitalinovation.pilhas;

public class Pilha {
	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}

	public No top() {
	 return refNoEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refAuxiliarNo = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setReNo(refAuxiliarNo);
	}
	
	public No pop() {
		if (!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getReNo();
			return noPoped;
		}
		return null;
	}

	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false;
	}
}
