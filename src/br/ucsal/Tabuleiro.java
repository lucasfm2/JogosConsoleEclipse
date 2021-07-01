package br.ucsal;

import java.util.Arrays;

public class Tabuleiro {
	
	private int[][] linhas; 
	private int[][] copiaLinhas; 
	
	
	
	
	public int[][] getLinhas() {
		return linhas;
	}
	public int getLinhasLength() {
		return linhas.length;
	}


	public Tabuleiro() {
		this.linhas = new int[10][10];
		this.copiaLinhas = new int[10][10];
	}
	
	public void imprimirTabuleiro() {
		pularLinha();
		int nVertical = 0;
					
		linhaNumericaHorizontal();
	
		pularLinha();
		
		for (int i = 0; i < linhas.length; i++) {
			System.out.print(nVertical);
			++nVertical;
			for (int j = 0; j < linhas[i].length; j++) {
				//System.out.print(linhas[i][j] +" ");
				
				if(linhas[i][j] == 1) {
					System.out.print(" | x | ");
				}else {
					System.out.print(" |   | ");
				}
				
			}
			pularLinha();
			criarsuporteLinhaHorizontal();
			pularLinha();
			
		}
		pularLinha();
	}
	
	private void linhaNumericaHorizontal() {
		for (int i = 0; i <= 9; i++) {
			if (i == 0) {
				System.out.print("  ");
			}
			System.out.print("  "+i+"    ");
		}
	}

	private void pularLinha() {
		System.out.println("");
	}
	
	private void criarsuporteLinhaHorizontal() {
		for (int i = 0; i <= 9; i++) {
			if(i==0) {
				System.out.print(" ");
			}
			System.out.print(" ----- ");		
		}
	}
	
	public boolean escolherHorizontal(int linha,int coluna,int tamanho) {
		try {
			copiarVetores(linhas,copiaLinhas);
			int ultimaMarcao = coluna+tamanho;
			boolean oParametroLinhaEColunaNaoUltrapassaOLimiteDoTabuleiro = (linha>=0 && linha<=9 && coluna>=0 && coluna<=9)&&(ultimaMarcao>=0 && ultimaMarcao<=9);
			if(oParametroLinhaEColunaNaoUltrapassaOLimiteDoTabuleiro) {
				
				
				for (int i = 0; i < tamanho; i++) {
					if (i!=0) {
						coluna+=1;
					}
					
					
					if (linhas[linha][coluna]==1) {
						System.out.println("Essa Posi��o j� foi escolhida,por favor tente novamente");
						copiarVetores(copiaLinhas,linhas);
						return true;
					}else {				
						linhas[linha][coluna]=1;
					}
					
				}
				return false;	
			}else {
				throw new ArrayIndexOutOfBoundsException();
			}
						
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("parece que seu barco esta em uma posi��o invalida,"
					+ "pode ser que sua embarca��o ultrapasou o limite do tabuleiro ");
			System.out.println("n�mero necessario de quadrados para embara��o � "+tamanho);
			copiarVetores(copiaLinhas,linhas);
			return true;
		}
				
	}
	
	public boolean escolherVertical(int linha,int coluna,int tamanho) {
		copiarVetores(linhas,copiaLinhas);
		int ultimaMarcao = linha+tamanho;
		try {
			boolean oParametroLinhaEColunaNaoUltrapassaOLimiteDoTabuleiro = (linha>=0 && linha<=9 && coluna>=0 && coluna<=9)&&(ultimaMarcao>=0 && ultimaMarcao<=9);
			if (oParametroLinhaEColunaNaoUltrapassaOLimiteDoTabuleiro) {
				
			
				for (int i = 0; i < tamanho; i++) {
					if (i!=0) {
						linha+=1;
					}
					
										
					if (linhas[linha][coluna]==1) {
						System.out.println("oi");
						System.out.println("Essa Posi��o j� foi escolhida,por favor tente novamente \n\n");
						copiarVetores(copiaLinhas,linhas);
						return true;
					}else {
						linhas[linha][coluna]=1;
					}					
				}
				return false;
			}else {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			
		} catch (Exception e) {
			System.out.println("parace que seu barco esta em uma posi��o invalida,"
					+ "pode ser que sua embarca��o ultrapasou o limite do tabuleiro");
			System.out.println("n�mero necessario de quadrados para embara��o � "+tamanho);
			copiarVetores(copiaLinhas,linhas);
			return true;
		}
		
		
			
	}
	
	
	
	
	private void copiarVetores(int[][]vaiSerCopiado,int[][]copia) {
		int valor=0;
		for (int i = 0; i < vaiSerCopiado.length; i++) {	
			
			for (int j = 0; j < vaiSerCopiado.length; j++) {
				valor=vaiSerCopiado[i][j];
						copia[i][j]=valor;
			}
				
		}
	}
	
	

}