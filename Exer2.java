package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

/** 
 *
 *@author Joyce.silva
 */

public class Exer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//Faça um programa que peça um número e então mostre a mensagem
		//O número informado foi [número].
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número:");
		numero = input.nextInt();
		
		System.out.println("O número informado foi: " +numero);
		
		
	}

}
