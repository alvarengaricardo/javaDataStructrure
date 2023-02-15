package com.alvarenga.datastructure.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	// não é eficiente:
	/*
	 * public void adiciona(String elemento) {
	 * 
	 * for (int i = 0; i < this.elementos.length; i++) { if (this.elementos[i] ==
	 * null) { this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception { if(this.tamanho <
	 * this.elementos.length) { this.elementos[this.tamanho] = elemento;
	 * this.tamanho = this.tamanho ++; } else { throw new Exception("Vetor cheio.");
	 * } }
	 */
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho = this.tamanho++;
			return true;
		}
		return false;
	}

}