package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	
	Pilha p = new Pilha();
	
	public FatController() {
		super();
	}
	
	public int fatorial(int valor) throws Exception {
		if (valor == 0) {
			p.push(1);
		} else {
			p.push(valor * fatorial(valor - 1));
		}
		
		int fatorial = p.top();
		return fatorial;
	}

}
