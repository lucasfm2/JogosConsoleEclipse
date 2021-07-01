package br.ucsal;

import java.util.Scanner;

public abstract class Embarcacao {

	protected Jogador jogador;
	private String nome;
	private int tamanho;
	
	public Embarcacao(Jogador jogador,String nome, int tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.jogador = jogador;
		
	}

	
	public String getNome() {
		return nome;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	
	public boolean escolherPosicaoDaEmbarcacao(Scanner scanner) {
		
		int linha =0;
		int coluna =0;
		
		
		System.out.println("----------------------------");
		System.out.println("Jogador - "+jogador.NUMERODOJOGADOR);
		System.out.println("Embarcação:"+this.getNome() );
		System.out.println("Escolha o exixo" );
		System.out.println("1 - horizontal");
		System.out.println("2 - vertical \n");
		System.out.print("digite o eixo: ");
		int escolhaEixo=scanner.nextInt();
		
	
		if (escolhaEixo==1) {
			System.out.println("Escolheu horizontal \n");
			System.out.print("digite a coluna: ");
			coluna =scanner.nextInt();
			System.out.print("digite a linha: ");
			linha=scanner.nextInt();	
			return jogador.getTabuleiro().escolherHorizontal(linha, coluna, this.getTamanho());
			
		} else if(escolhaEixo==2) {
			System.out.println("Escolheu vertical \n");
			System.out.print("digite a coluna: ");
			coluna =scanner.nextInt();
			System.out.print("digite a linha: ");
			linha=scanner.nextInt();
			return jogador.getTabuleiro().escolherVertical(linha, coluna, this.getTamanho());
			
		}else {
			System.out.println("Ops escolha invalida... \n\n");
			return true;
		}
	}
		
}