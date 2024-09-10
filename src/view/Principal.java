package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor = -1;
		
		do {
			System.out.println("Insira um valor de 0 a 10:");
			valor = sc.nextInt();
		}
		while (valor < 0 || valor > 10);
		
		FatController fatController = new FatController();
		
		try {
			int fatorial = fatController.fatorial(valor);
			System.out.println(String.format("%d! = %d", valor, fatorial));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
