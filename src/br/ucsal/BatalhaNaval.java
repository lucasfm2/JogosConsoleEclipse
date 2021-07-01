package br.ucsal;

import java.util.Scanner;

public class BatalhaNaval {

		Jogador jogador1;
		Jogador jogador2;
		
		
		public BatalhaNaval() {

			this.jogador1 = new Jogador(1);
			this.jogador2 = new Jogador(2);
		}
		
		public void iniciarJogo() {
			iniciarJogador(this.jogador1);
			iniciarJogador(this.jogador2);
		}
		
		private void iniciarJogador(Jogador jogador) {
			Scanner scanner = new Scanner(System.in);
			boolean escolhaSubMarinoEstaComProblema = true;
			while(escolhaSubMarinoEstaComProblema) {
					escolhaSubMarinoEstaComProblema=jogador.getSubmarino().escolherPosicaoDaEmbarcacao(scanner);		
				}
			jogador.getTabuleiro().imprimirTabuleiro();
			
			boolean escolhaPortaAvioesEstaComProblema = true;
			while(escolhaPortaAvioesEstaComProblema) {
				escolhaPortaAvioesEstaComProblema=jogador.getPortaAvioes().escolherPosicaoDaEmbarcacao(scanner);		
				}
			jogador.getTabuleiro().imprimirTabuleiro();
			
			boolean escolhaNavioTanqueEstaComProblema = true;
			while(escolhaNavioTanqueEstaComProblema) {
				escolhaNavioTanqueEstaComProblema=jogador.getNavioTanque().escolherPosicaoDaEmbarcacao(scanner);		
				}
			jogador.getTabuleiro().imprimirTabuleiro();
			
			boolean escolhaTorpedeiroEstaComProblema = true;
			while(escolhaTorpedeiroEstaComProblema) {
				escolhaTorpedeiroEstaComProblema=jogador.getContraTorpedeiro().escolherPosicaoDaEmbarcacao(scanner);		
				}
			jogador.getTabuleiro().imprimirTabuleiro();
			
			}
		
		}
