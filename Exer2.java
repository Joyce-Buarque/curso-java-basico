package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

/** 
 *
 *@author Joyce.silva
 */

public class Exer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem
		//O n�mero informado foi [n�mero].
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero:");
		numero = input.nextInt();
		
		System.out.println("O n�mero informado foi: " +numero);
		
		
	}

}
