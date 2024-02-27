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
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setReNo(refAuxiliar);
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

	@Override
	public String toString() {

		String stringReturnString = "--------------\n";
		stringReturnString += "   Pilha\n";
		stringReturnString += "--------------\n";

		No noAxuiliar = refNoEntradaPilha;

		while (true) {
			if (noAxuiliar != null) {
				stringReturnString += "[No{dado =" + noAxuiliar.getDado() +"}]\n";
				noAxuiliar = noAxuiliar.getReNo();
;			} else {
				break;
			}
		}
		stringReturnString += "-------End-------\n";
		return stringReturnString;

	}
}
