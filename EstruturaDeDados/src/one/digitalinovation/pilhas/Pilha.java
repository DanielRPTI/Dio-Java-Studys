package one.digitalinovation.pilhas;

public class Pilha {
	private No refNoEntradaPilha;

	// iniciando a variavel refNoentradaPilha no projeto
	public Pilha() {
		this.refNoEntradaPilha = null;
	}

	// Neste metodo ele irá retornar o ultimo valor adicionado a pilha pois ele é o
	// seu topo
	public No top() {
		return refNoEntradaPilha;
	}

	/*
	 * Já no metodo push ele irá ser responsavel por fazer a inserção ,Para isso
	 * criamos uma variavel auxiliar do tipo No para receber o valor ref de entrada
	 * Esse valor ref seguindo a logica irá receber o novoNo que será setado a
	 * referencia a variavel refAuxiliar no setReNos
	 */

	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setReNo(refAuxiliar);
	}

	/*
	 * Neste metodo primeiro verificamos se nosso No está vazio se não estiver
	 * realizamos o pop Criamos uma variavel "noPoped" para recebermos o primeiro
	 * valor da lista buscamos a referencia do ultimo no adicionado no exemplo no 6
	 * ref 5 , assim a lista irá retornar noPoped que tem o valor ref de 5
	 */
	public No pop() {
		if (!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getReNo();
			return noPoped;
		}
		return null;
	}

//Como o proprio metodo dis "isEmpty" verifica se está vazio , usamos o ternario pois é simples a verificação
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false;
	}

//Adição de um ToString formatado para vermos nossa Pilha de uma forma dinamica
	@Override
	public String toString() {

		String stringReturnString = "--------------\n";
		stringReturnString += "   Pilha\n";
		stringReturnString += "--------------\n";
		
		/*
		 * aqui criamos um noAuxiliar para pegarmos o valor ref do insert
		 */
		No noAuxiliar = refNoEntradaPilha;

		/*
		 * Depois iniciamos nosso laço de repetição para preenchermos a pilha
		 * a logica é enquanto o noAuxiliar não for null a string retorna o resultado formatado
		 * se for null o no de referencia ele quebra o laço e retornado a formatação
		 */
		while (true) {
			if (noAuxiliar != null) {
				stringReturnString += "[No{dado =" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getReNo();
				;
			} else {
				break;
			}
		}
		stringReturnString += "-------End-------\n";
		return stringReturnString;

	}
}
