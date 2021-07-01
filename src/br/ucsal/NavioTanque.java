package br.ucsal;


import java.util.Scanner;

public class NavioTanque extends Embarcacao {

	public NavioTanque(Jogador jogador) {
		super(jogador,"navio tanque", 4);
		
	}
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public int getTamanho() {
		// TODO Auto-generated method stub
		return super.getTamanho();
	}

	@Override
	public boolean escolherPosicaoDaEmbarcacao(Scanner scanner) {
		// TODO Auto-generated method stub
		return super.escolherPosicaoDaEmbarcacao(scanner);
	}


}