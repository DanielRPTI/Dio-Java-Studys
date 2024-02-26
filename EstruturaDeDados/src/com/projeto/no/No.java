package com.projeto.no;

public class No<T> {

	private T content;
	private No<T> nextNo;
	
	public No(T content) {
		this.nextNo = null;
		this.content = content;
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

	public No<T> getnextNo() {
		return nextNo;
	}

	public void setnextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}


}
