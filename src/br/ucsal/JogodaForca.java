package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class JogodaForca {

	public static void main(String[] args) {
		

		// LISTA DE PALAVRAS
		Random random  = new Random();
		String [] palavras  = 	{"ESTADO", "MAQUETE", "ALFA", "CULINARIA", "CEBOLA","ALGORITIMO"
				,"SAPATO", "BISCOITO","DADO"};	
		
		int quantPalavras = palavras.length;
	
		int indiceSorteado = random.nextInt(quantPalavras);
		String sorteada = palavras[indiceSorteado];
						
	
		
		Scanner in = new Scanner(System.in);
		
		char acertos [] = new char[sorteada.length()];				
		char letra;
		boolean ganhou = false;
		int vida = 0;
		

		for (int i = 0; i < sorteada.length(); i++) {
			if (i == 0) {
				imprimir("A palavra contém " + sorteada.length() +" letras.");
			}
			imprimir2(" _ ");
		}
		imprimir("\n");
		while(!ganhou && vida < 6) {
		
			
			
		imprimir("\n" + boneco(vida) + "\nQual letra você deseja tentar?" + "\n");
		
		letra = in.next().toUpperCase().charAt(0);
		
		boolean perdeVidas = true;
		for (int i = 0; i < sorteada.length(); i++) {
			if(letra == sorteada.charAt(i)) {
				
				acertos[i] = 1;
				perdeVidas = false;
			}
			
		}
		
		
		if (perdeVidas) 
			vida++;
		
		ganhou = true;
		
		for (int i = 0; i < sorteada.length() ; i++) {
			
			if(acertos[i] == 0) {
				imprimir2(" _ ");
				ganhou = false;
			}
			else {
				imprimir2(" " + sorteada.charAt(i) + " ");
				
			}
			
			if(i == sorteada.length() - 1) {
				imprimir("\n");
			}			
		
	}
		}
	

		imprimir("Fim de Jogo!");
		in.close();
	}

	public static int boneco(int parameter) {

	switch(parameter) {
	case 0: 
		imprimir("    _________  ");
		imprimir("   |         | ");
		imprimir("   |           ");
		imprimir("   |           ");
		imprimir("   |           ");
		imprimir("   |           ");
		imprimir(" __|__         ");
	break;
	case 1: 
		imprimir("    _________   ");
		imprimir("   |         |  ");
		imprimir("   |         O  ");
		imprimir("   |            ");
		imprimir("   |            ");
		imprimir("   |            ");
		imprimir(" __|__          ");	
	break;
	case 2:
		imprimir("    _________   ");
		imprimir("   |         |  ");
		imprimir("   |         O  ");
		imprimir("   |         |  ");
		imprimir("   |            ");
		imprimir("   |            ");
		imprimir(" __|__          ");
	break;	
	case 3: 
		imprimir("    _________   ");
		imprimir("   |         |  ");
		imprimir("   |         O  ");
		imprimir("   |        -|  ");
		imprimir("   |            ");
		imprimir("   |            ");
		imprimir(" __|__          ");
	break;
	case 4:
	
		imprimir("    _________   ");
		imprimir("   |         |  ");
		imprimir("   |         O  ");
		imprimir("   |        -|- ");
		imprimir("   |            ");
		imprimir("   |            ");
		imprimir(" __|__          ");
	break;
	case 5: 
		imprimir("    _________   ");
		imprimir("   |         |  ");
		imprimir("   |         O  ");
		imprimir("   |        -|- ");
		imprimir("   |         M  ");
		imprimir("   |            ");
		imprimir(" __|__          ");
		break;
		
	default: 
		imprimir("Tentativas esgotadas!");
	break;
	
	}

	return parameter;

	}

	public static void imprimir(String txt) {
		
		System.out.println(txt);
	
	}
	public static void imprimir2(String txt) {
		System.out.print(txt);
	}
	
	}