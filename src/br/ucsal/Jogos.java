package br.ucsal;

import java.util.Scanner;

public class Jogos {

	public static void main(String[] args) {
		imprimir(obterAutenticacao(obterLogin(), obterSenhas()));
	}

	/* OBJETIVO: criar e retorna um array unidimensional com 03 
	 * logins definidos diretamente no vetor. */
	public static String[] obterLogin() {
		String[] logins = {"lucas","ian","fabricio"};
		return logins;
	}
	
	/* OBJETIVO: criar e retorna um array unidimensional com 03 
	 * senhas (inteiros - positivos) definidas diretamente no 
	 * vetor */
	public static int[] obterSenhas() {
		int[] senhas = {123,456,789};
		return senhas;
	}
	
	
	/* OBJETIVO: o usuario informa um login e uma senha e o m�todo 
	 * verifica se essas informa��es existem e se est�o 
	 * correlacionadas a partir dos �ndices dos vetores. Se sim 
	 * retorna que o login � v�lido, se n�o retorna que o login � 
	 * inv�lido. */
	public static String obterAutenticacao(String[] logins, int[] senhas) {
		Scanner Scanner = new Scanner(System.in);
		String resultado = "login inv�lido";
		imprimir("Informe o login");
		String login = Scanner.next();
		imprimir("Informe a senha");
		int senha = Scanner.nextInt();
		for (int i = 0; i < logins.length; i++) {
			while(login.equals(logins[i]) && senha == senhas[i]) {
					imprimir("------------------- MENU INICIAL ------------------");
					imprimir("Digite Batalha NAVAL (1), Campo minado (2), Jogo da Forca(3) ou para Sair (4)");
					String resp = Scanner.nextLine();
					if(!resp.equals("1")&&!resp.equals("2")&&!resp.equals("3")&&!resp.equals("4")){
						System.out.println("Voc� digitou uma op��o inv�lida. Digite denovo.");
					} if (resp.equals("1")) {
						 CampoMinado CampoMinado = new CampoMinado();
					} if (resp.equals("2")) {
						BatalhaNaval BatalhaNaval = new BatalhaNaval();
					} if (resp.equals("3")) {
						JogodaForca  JogodaForca  = new JogodaForca();
					} if (resp.equals("4")) {
						System.exit(0);
					}
					
					}
			
		}
		return resultado;
	}
	
	
	/* OBJETIVO: criar os metodos de impress�o correspondentes */
	public static void imprimir(String txt) {
		System.out.println(txt);
	}
	
	public static void imprimir(int vlr) {
		System.out.println(vlr);
	}
	
	public static void imprimir(String[] txts) {
		for (int i = 0; i < txts.length; i++) {
			System.out.print(txts[i] + " ");
		}
	}

	public static void imprimir(int[] vlrs) {
		for (int i = 0; i < vlrs.length; i++) {
			System.out.print(vlrs[i] + " ");
		}
	}
}