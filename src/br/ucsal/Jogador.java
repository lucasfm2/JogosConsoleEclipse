package br.ucsal;

import java.util.Scanner;

public class Jogador {
	
	private Tabuleiro tabuleiro;
	private PortaAvioes portaAvioes;
	private NavioTanque navioTanque;
	private ContraTorpedeiro contraTorpedeiro;
	private Submarino submarino;
	int linha;
	int coluna;
	

	
	final int NUMERODOJOGADOR;
	
	
	public Jogador(int numeroDoJogador) {
		this.tabuleiro = new Tabuleiro();	
		this.NUMERODOJOGADOR = numeroDoJogador;
		this.portaAvioes = new PortaAvioes(this);
		this.navioTanque = new NavioTanque(this);
		this.contraTorpedeiro = new ContraTorpedeiro(this);
		this.submarino = new Submarino(this);
	}
	
	public PortaAvioes getPortaAvioes() {
		return portaAvioes;
	}

	public void setPortaAvioes(PortaAvioes portaAvioes) {
		this.portaAvioes = portaAvioes;
	}

	public NavioTanque getNavioTanque() {
		return navioTanque;
	}

	public ContraTorpedeiro getContraTorpedeiro() {
		return contraTorpedeiro;
	}

	public Submarino getSubmarino() {
		return submarino;
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	

	@Override
	public String toString() {
		
		return "Jogador-"+this.NUMERODOJOGADOR;
	}

	
	
	
	
}