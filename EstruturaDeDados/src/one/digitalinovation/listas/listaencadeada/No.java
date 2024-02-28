package one.digitalinovation.listaencadeada;

public class No<T> {
	private T content;
	private No<T> nextNo;
	
	
	public No() {	
		this.nextNo = null;
	}
	public No(T content) {
		this.nextNo = null;
		this.content = content;
	}
	public No(T content, No<T> nextNo) {
		
		this.content = content;
		this.nextNo = nextNo;
	}
	
	@Override
	public String toString() {
		return "No [content=" + content + "]";
	}
	
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public No<T> getNextNo() {
		return nextNo;
	}
	public void setNextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}
	
	public String toStringEncadeado() {
		String str = "No [content=" + content + "]";
		
		if(nextNo != null) {
			str += "->" + nextNo.toString();
		}else {
			str += "-> null";
		}
		return str;
	}
	
	
	
}
