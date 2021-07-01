package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
	static int[][] tabuleiro = new int[16][16]; 
	public static int NUMERO_IDENTIFICADOR_MARCADA = 40;
	public static int NUMERO_IDENTIFICADOR_EXPLOSAO = 2; 
	public static int NUMERO_IDENTIFICADOR_VAZIO = 100;


	public static void main(String[] args) {
	
		System.out.println("Bem vindo ao campo minado!");
		System.out.println("Para jogar é simples, temos 16 blocos,");
		System.out.println("objetivo do jogo é não ser destruido pelas minas!");
		Tabuleiro();
	}
		
		
	
private static int[][] Tabuleiro() {

Scanner scanner = new Scanner(System.in);
Random bombaleatoria = new Random();
int bomba1; int bomba2; int bomba3; int bomba4;int bomba5;int bomba6;int bomba7;int bomba8;int bomba9; int bomba10; int bomba11; int bomba12;int bomba13;int bomba14;int bomba15;int bomba16;int bomba17; int bomba18; int bomba19; int bomba20;int bomba21;int bomba22;int bomba23;int bomba24;int bomba25; int bomba26; int bomba27; int bomba28;int bomba29;int bomba30;int bomba31;int bomba32;
int bomba33; int bomba34; int bomba35; int bomba36;int bomba37;int bomba38;int bomba39;int bomba40;int bomba41; int bomba42; int bomba43; int bomba44;int bomba45;int bomba46;int bomba47;int bomba48;int bomba49; int bomba50; int bomba51; int bomba52;int bomba53;int bomba54;int bomba55;int bomba56;int bomba57; int bomba58; int bomba59; int bomba60;int bomba61;int bomba62;int bomba63;int bomba64;
int bomba65; int bomba66; int bomba67; int bomba68;int bomba69;int bomba70;int bomba71;int bomba72;int bomba73; int bomba74; int bomba75; int bomba76;int bomba77;int bomba78;int bomba79;int bomba80;int bomba81;int bomba82;int bomba83;int bomba84; int bomba85; int bomba86; int bomba87;int bomba88;int bomba89;int bomba90;int bomba91;int bomba92; int bomba93; int bomba94; int bomba95;int bomba96;int bomba97;int bomba98;int bomba99;int bomba100;
int bomba101; int bomba102; int bomba103; int bomba104;int bomba105;int bomba106;int bomba107;int bomba108;int bomba109; int bomba110; int bomba111; int bomba112;int bomba113;int bomba114;int bomba115;int bomba116;int bomba117;int bomba118;int bomba119;int bomba120; int bomba121; int bomba122; int bomba123;int bomba124;int bomba125;int bomba126;int bomba127;int bomba128; int bomba129; int bomba130; int bomba131;int bomba132;int bomba133;int bomba134;int bomba135;int bomba136;
int bomba137; int bomba138; int bomba139; int bomba140;int bomba141;int bomba142;int bomba143;int bomba144;int bomba145; int bomba146; int bomba147; int bomba148;int bomba149;int bomba150;int bomba151;int bomba152;int bomba153;int bomba154;int bomba155;int bomba156; int bomba157; int bomba158; int bomba159;int bomba160;int bomba161;int bomba162;int bomba163;int bomba164; int bomba165; int bomba166; int bomba167;int bomba168;int bomba169;int bomba170;int bomba171;int bomba172;
int bomba173; int bomba174; int bomba175; int bomba176;int bomba177;int bomba178;int bomba179;int bomba180;int bomba181; int bomba182; int bomba183; int bomba184;int bomba185;int bomba186;int bomba187;int bomba188;int bomba189;int bomba190;int bomba191;int bomba192; int bomba193; int bomba194; int bomba195;int bomba196;int bomba197;int bomba198;int bomba199;int bomba200; int bomba201; int bomba202; int bomba203;int bomba204;int bomba205;int bomba206;int bomba207;int bomba208;
int bomba209; int bomba210; int bomba211; int bomba212;int bomba213;int bomba214;int bomba215;int bomba216;int bomba217; int bomba218; int bomba219; int bomba220;int bomba221;int bomba222;int bomba223;int bomba224;int bomba225;int bomba226;int bomba227;int bomba228; int bomba229; int bomba230; int bomba231;int bomba232;int bomba233;int bomba234;int bomba235;int bomba236; int bomba237; int bomba238; int bomba239;int bomba240;

int jogador = 50;
int perdeu = 50;
int coluna;
int linha;
bomba1 = bombaleatoria.nextInt(10);bomba2 = bombaleatoria.nextInt(10);bomba3 = bombaleatoria.nextInt(10);bomba4 = bombaleatoria.nextInt(10);bomba5 = bombaleatoria.nextInt(10);bomba6 = bombaleatoria.nextInt(10);bomba7 = bombaleatoria.nextInt(10);bomba8 = bombaleatoria.nextInt(10);bomba9 = bombaleatoria.nextInt(10);bomba10 = bombaleatoria.nextInt(10);bomba11 = bombaleatoria.nextInt(10);bomba12 = bombaleatoria.nextInt(10);bomba13 = bombaleatoria.nextInt(10);bomba14 = bombaleatoria.nextInt(10);
bomba15 = bombaleatoria.nextInt(10);bomba16 = bombaleatoria.nextInt(10);bomba17 = bombaleatoria.nextInt(10);bomba18 = bombaleatoria.nextInt(10);bomba19 = bombaleatoria.nextInt(10);bomba20 = bombaleatoria.nextInt(10);bomba21 = bombaleatoria.nextInt(10);bomba22 = bombaleatoria.nextInt(10);bomba23 = bombaleatoria.nextInt(10);bomba24 = bombaleatoria.nextInt(10);bomba25 = bombaleatoria.nextInt(10);bomba26 = bombaleatoria.nextInt(10);bomba27 = bombaleatoria.nextInt(10);bomba28 = bombaleatoria.nextInt(10);
bomba29 = bombaleatoria.nextInt(10);bomba30 = bombaleatoria.nextInt(10);bomba31 = bombaleatoria.nextInt(10);bomba32 = bombaleatoria.nextInt(10);bomba33 = bombaleatoria.nextInt(10);bomba34 = bombaleatoria.nextInt(10);bomba35 = bombaleatoria.nextInt(10);bomba36 = bombaleatoria.nextInt(10);bomba37 = bombaleatoria.nextInt(10);bomba38 = bombaleatoria.nextInt(10);bomba39 = bombaleatoria.nextInt(10);bomba40 = bombaleatoria.nextInt(10);bomba41 = bombaleatoria.nextInt(10);bomba42 = bombaleatoria.nextInt(10);
bomba43 = bombaleatoria.nextInt(10);bomba44 = bombaleatoria.nextInt(10);bomba45 = bombaleatoria.nextInt(10);bomba46 = bombaleatoria.nextInt(10);bomba47 = bombaleatoria.nextInt(10);bomba48 = bombaleatoria.nextInt(10);bomba49 = bombaleatoria.nextInt(10);bomba50 = bombaleatoria.nextInt(10);bomba51 = bombaleatoria.nextInt(10);bomba52 = bombaleatoria.nextInt(10);bomba53 = bombaleatoria.nextInt(10);bomba54 = bombaleatoria.nextInt(10);bomba55 = bombaleatoria.nextInt(10);bomba56 = bombaleatoria.nextInt(10);
bomba57 = bombaleatoria.nextInt(10);bomba58 = bombaleatoria.nextInt(10);bomba59 = bombaleatoria.nextInt(10);bomba60 = bombaleatoria.nextInt(10);bomba61 = bombaleatoria.nextInt(10);bomba62 = bombaleatoria.nextInt(10);bomba63 = bombaleatoria.nextInt(10);bomba64 = bombaleatoria.nextInt(10);bomba65 = bombaleatoria.nextInt(10);bomba66 = bombaleatoria.nextInt(10);bomba67 = bombaleatoria.nextInt(10);bomba68 = bombaleatoria.nextInt(10);bomba69 = bombaleatoria.nextInt(10);bomba70 = bombaleatoria.nextInt(10);
bomba71 = bombaleatoria.nextInt(10);bomba72 = bombaleatoria.nextInt(10);bomba73 = bombaleatoria.nextInt(10);bomba74 = bombaleatoria.nextInt(10);bomba75 = bombaleatoria.nextInt(10);bomba76 = bombaleatoria.nextInt(10);bomba77 = bombaleatoria.nextInt(10);bomba78 = bombaleatoria.nextInt(10);bomba79 = bombaleatoria.nextInt(10);bomba80 = bombaleatoria.nextInt(10);bomba81 = bombaleatoria.nextInt(10);bomba82 = bombaleatoria.nextInt(10);bomba83 = bombaleatoria.nextInt(10);bomba84 = bombaleatoria.nextInt(10);
bomba85 = bombaleatoria.nextInt(10);bomba86 = bombaleatoria.nextInt(10);bomba87 = bombaleatoria.nextInt(10);bomba88 = bombaleatoria.nextInt(10);bomba88 = bombaleatoria.nextInt(10);bomba89 = bombaleatoria.nextInt(10);bomba90 = bombaleatoria.nextInt(10);bomba91 = bombaleatoria.nextInt(10);bomba92 = bombaleatoria.nextInt(10);bomba93 = bombaleatoria.nextInt(10);bomba94 = bombaleatoria.nextInt(10);bomba95 = bombaleatoria.nextInt(10);bomba96 = bombaleatoria.nextInt(10);bomba97 = bombaleatoria.nextInt(10);
bomba98 = bombaleatoria.nextInt(10);bomba99 = bombaleatoria.nextInt(10);bomba100 = bombaleatoria.nextInt(10);bomba101 = bombaleatoria.nextInt(10);bomba102 = bombaleatoria.nextInt(10);bomba103 = bombaleatoria.nextInt(10);bomba104 = bombaleatoria.nextInt(10);bomba105 = bombaleatoria.nextInt(10);bomba106 = bombaleatoria.nextInt(10);bomba107 = bombaleatoria.nextInt(10);bomba108 = bombaleatoria.nextInt(10);bomba109 = bombaleatoria.nextInt(10);bomba110 = bombaleatoria.nextInt(10);bomba111 = bombaleatoria.nextInt(10);
bomba112 = bombaleatoria.nextInt(10);bomba113 = bombaleatoria.nextInt(10);bomba114 = bombaleatoria.nextInt(10);bomba115 = bombaleatoria.nextInt(10);bomba116 = bombaleatoria.nextInt(10);bomba117 = bombaleatoria.nextInt(10);bomba118 = bombaleatoria.nextInt(10);bomba119 = bombaleatoria.nextInt(10);bomba120 = bombaleatoria.nextInt(10);bomba121 = bombaleatoria.nextInt(10);bomba122 = bombaleatoria.nextInt(10);bomba123 = bombaleatoria.nextInt(10);bomba124 = bombaleatoria.nextInt(10);bomba125 = bombaleatoria.nextInt(10);
bomba126 = bombaleatoria.nextInt(10);bomba127 = bombaleatoria.nextInt(10);bomba128 = bombaleatoria.nextInt(10);bomba129 = bombaleatoria.nextInt(10);bomba130 = bombaleatoria.nextInt(10);bomba131 = bombaleatoria.nextInt(10);bomba132 = bombaleatoria.nextInt(10);bomba133 = bombaleatoria.nextInt(10);bomba134 = bombaleatoria.nextInt(10);bomba135 = bombaleatoria.nextInt(10);bomba136 = bombaleatoria.nextInt(10);bomba137 = bombaleatoria.nextInt(10);bomba138 = bombaleatoria.nextInt(10);bomba139 = bombaleatoria.nextInt(10);
bomba140 = bombaleatoria.nextInt(10);bomba141 = bombaleatoria.nextInt(10);bomba142 = bombaleatoria.nextInt(10);bomba143 = bombaleatoria.nextInt(10);bomba144 = bombaleatoria.nextInt(10);bomba145 = bombaleatoria.nextInt(10);bomba146 = bombaleatoria.nextInt(10);bomba147 = bombaleatoria.nextInt(10);bomba148 = bombaleatoria.nextInt(10);bomba149 = bombaleatoria.nextInt(10);bomba150 = bombaleatoria.nextInt(10);bomba151 = bombaleatoria.nextInt(10);bomba152 = bombaleatoria.nextInt(10);bomba153 = bombaleatoria.nextInt(10);
bomba154 = bombaleatoria.nextInt(10);bomba155 = bombaleatoria.nextInt(10);bomba156 = bombaleatoria.nextInt(10);bomba157 = bombaleatoria.nextInt(10);bomba158 = bombaleatoria.nextInt(10);bomba159 = bombaleatoria.nextInt(10);bomba160 = bombaleatoria.nextInt(10);bomba161 = bombaleatoria.nextInt(10);bomba162 = bombaleatoria.nextInt(10);bomba163 = bombaleatoria.nextInt(10);bomba164 = bombaleatoria.nextInt(10);bomba165 = bombaleatoria.nextInt(10);bomba166 = bombaleatoria.nextInt(10);bomba167 = bombaleatoria.nextInt(10);
bomba168 = bombaleatoria.nextInt(10);bomba169 = bombaleatoria.nextInt(10);bomba170 = bombaleatoria.nextInt(10);bomba171 = bombaleatoria.nextInt(10);bomba172 = bombaleatoria.nextInt(10);bomba173 = bombaleatoria.nextInt(10);bomba174 = bombaleatoria.nextInt(10);bomba175 = bombaleatoria.nextInt(10);bomba176 = bombaleatoria.nextInt(10);bomba177 = bombaleatoria.nextInt(10);bomba178 = bombaleatoria.nextInt(10);bomba179 = bombaleatoria.nextInt(10);bomba180 = bombaleatoria.nextInt(10);bomba181 = bombaleatoria.nextInt(10);
bomba182 = bombaleatoria.nextInt(10);bomba183 = bombaleatoria.nextInt(10);bomba184 = bombaleatoria.nextInt(10);bomba185 = bombaleatoria.nextInt(10);bomba186 = bombaleatoria.nextInt(10);bomba187 = bombaleatoria.nextInt(10);bomba188 = bombaleatoria.nextInt(10);bomba189 = bombaleatoria.nextInt(10);bomba190 = bombaleatoria.nextInt(10);bomba191 = bombaleatoria.nextInt(10);bomba192 = bombaleatoria.nextInt(10);bomba193 = bombaleatoria.nextInt(10);bomba194 = bombaleatoria.nextInt(10);bomba195 = bombaleatoria.nextInt(10);
bomba196 = bombaleatoria.nextInt(10);bomba197 = bombaleatoria.nextInt(10);bomba198 = bombaleatoria.nextInt(10);bomba199 = bombaleatoria.nextInt(10);bomba200 = bombaleatoria.nextInt(10);bomba201 = bombaleatoria.nextInt(10);bomba202 = bombaleatoria.nextInt(10);bomba203 = bombaleatoria.nextInt(10);bomba204 = bombaleatoria.nextInt(10);bomba205 = bombaleatoria.nextInt(10);bomba206 = bombaleatoria.nextInt(10);bomba207 = bombaleatoria.nextInt(10);bomba208 = bombaleatoria.nextInt(10);bomba209 = bombaleatoria.nextInt(10);
bomba210 = bombaleatoria.nextInt(10);bomba211 = bombaleatoria.nextInt(10);bomba212 = bombaleatoria.nextInt(10);bomba213 = bombaleatoria.nextInt(10);bomba214 = bombaleatoria.nextInt(10);bomba215 = bombaleatoria.nextInt(10);bomba216 = bombaleatoria.nextInt(10);bomba217 = bombaleatoria.nextInt(10);bomba218 = bombaleatoria.nextInt(10);bomba219 = bombaleatoria.nextInt(10);bomba220 = bombaleatoria.nextInt(10);bomba221 = bombaleatoria.nextInt(10);bomba222 = bombaleatoria.nextInt(10);bomba223 = bombaleatoria.nextInt(10);
bomba224 = bombaleatoria.nextInt(10);bomba225 = bombaleatoria.nextInt(10);bomba226 = bombaleatoria.nextInt(10);bomba227 = bombaleatoria.nextInt(10);bomba228 = bombaleatoria.nextInt(10);bomba229 = bombaleatoria.nextInt(10);bomba230 = bombaleatoria.nextInt(10);bomba231 = bombaleatoria.nextInt(10);bomba232 = bombaleatoria.nextInt(10);bomba233 = bombaleatoria.nextInt(10);bomba234 = bombaleatoria.nextInt(10);bomba235 = bombaleatoria.nextInt(10);bomba236 = bombaleatoria.nextInt(10);bomba237 = bombaleatoria.nextInt(10);
bomba238 = bombaleatoria.nextInt(10);bomba239 = bombaleatoria.nextInt(10);bomba240 = bombaleatoria.nextInt(10);



tabuleiro[0][0] = bomba1;tabuleiro[0][1] = bomba17;tabuleiro[0][2] = bomba33;tabuleiro[0][3] = bomba49;tabuleiro[0][4] = bomba65;tabuleiro[0][5] = bomba81;tabuleiro[0][6] = bomba97;tabuleiro[0][7] = bomba113;tabuleiro[0][8] = bomba129;tabuleiro[0][9] = bomba145;tabuleiro[0][10] = bomba161;tabuleiro[0][11] = bomba177;tabuleiro[0][12] = bomba193;tabuleiro[0][13] = bomba209;tabuleiro[0][14] = bomba225;
tabuleiro[1][1] = bomba2;tabuleiro[1][2] = bomba18;tabuleiro[1][3] = bomba34;tabuleiro[1][4] = bomba50;tabuleiro[1][5] = bomba66;tabuleiro[1][6] = bomba82;tabuleiro[1][7] = bomba98;tabuleiro[1][8] = bomba114;tabuleiro[1][9] = bomba130;tabuleiro[1][10] = bomba146;tabuleiro[1][11] = bomba162;tabuleiro[1][12] = bomba178;tabuleiro[1][13] = bomba194;tabuleiro[1][14] = bomba210;tabuleiro[1][15] = bomba226;
tabuleiro[2][1] = bomba3;tabuleiro[2][2] = bomba19;tabuleiro[2][3] = bomba35;tabuleiro[2][4] = bomba51;tabuleiro[2][5] = bomba67;tabuleiro[2][6] = bomba83;tabuleiro[2][7] = bomba99;tabuleiro[2][8] = bomba115;tabuleiro[2][9] = bomba131;tabuleiro[2][10] = bomba147;tabuleiro[2][11] = bomba163;tabuleiro[2][12] = bomba179;tabuleiro[2][13] = bomba195;tabuleiro[2][14] = bomba211;tabuleiro[2][15] = bomba227;
tabuleiro[3][1] = bomba4;tabuleiro[3][2] = bomba20;tabuleiro[3][3] = bomba36;tabuleiro[3][4] = bomba52;tabuleiro[3][5] = bomba68;tabuleiro[3][6] = bomba84;tabuleiro[3][7] = bomba100;tabuleiro[3][8] = bomba116;tabuleiro[3][9] = bomba132;tabuleiro[3][10] = bomba148;tabuleiro[3][11] = bomba164;tabuleiro[3][12] = bomba180;tabuleiro[3][13] = bomba196;tabuleiro[3][14] = bomba212;tabuleiro[3][15] = bomba228;
tabuleiro[4][1] = bomba5;tabuleiro[4][2] = bomba21;tabuleiro[4][3] = bomba37;tabuleiro[4][4] = bomba53;tabuleiro[4][5] = bomba69;tabuleiro[4][6] = bomba85;tabuleiro[4][7] = bomba101;tabuleiro[4][8] = bomba117;tabuleiro[4][9] = bomba133;tabuleiro[4][10] = bomba149;tabuleiro[4][11] = bomba165;tabuleiro[4][12] = bomba181;tabuleiro[4][13] = bomba197;tabuleiro[4][14] = bomba213;tabuleiro[4][15] = bomba229;
tabuleiro[5][1] = bomba6;tabuleiro[5][2] = bomba22;tabuleiro[5][3] = bomba38;tabuleiro[5][4] = bomba54;tabuleiro[5][5] = bomba70;tabuleiro[5][6] = bomba86;tabuleiro[5][7] = bomba102;tabuleiro[5][8] = bomba118;tabuleiro[5][9] = bomba134;tabuleiro[5][10] = bomba150;tabuleiro[5][11] = bomba166;tabuleiro[5][12] = bomba182;tabuleiro[5][13] = bomba198;tabuleiro[5][14] = bomba214;tabuleiro[5][15] = bomba230;
tabuleiro[6][1] = bomba7;tabuleiro[6][2] = bomba23;tabuleiro[6][3] = bomba39;tabuleiro[6][4] = bomba55;tabuleiro[6][5] = bomba71;tabuleiro[6][6] = bomba87;tabuleiro[6][7] = bomba103;tabuleiro[6][8] = bomba119;tabuleiro[6][9] = bomba135;tabuleiro[6][10] = bomba151;tabuleiro[6][11] = bomba167;tabuleiro[6][12] = bomba183;tabuleiro[6][13] = bomba199;tabuleiro[6][14] = bomba215;tabuleiro[6][15] = bomba231;
tabuleiro[7][1] = bomba8;tabuleiro[7][2] = bomba24;tabuleiro[7][3] = bomba40;tabuleiro[7][4] = bomba56;tabuleiro[7][5] = bomba72;tabuleiro[7][6] = bomba88;tabuleiro[7][7] = bomba104;tabuleiro[7][8] = bomba120;tabuleiro[7][9] = bomba136;tabuleiro[7][10] = bomba152;tabuleiro[7][11] = bomba168;tabuleiro[7][12] = bomba184;tabuleiro[7][13] = bomba200;tabuleiro[7][14] = bomba216;tabuleiro[7][15] = bomba232;
tabuleiro[8][1] = bomba9;tabuleiro[8][2] = bomba25;tabuleiro[8][3] = bomba41;tabuleiro[8][4] = bomba57;tabuleiro[8][5] = bomba73;tabuleiro[8][6] = bomba89;tabuleiro[8][7] = bomba105;tabuleiro[8][8] = bomba121;tabuleiro[8][9] = bomba137;tabuleiro[8][10] = bomba153;tabuleiro[8][11] = bomba169;tabuleiro[8][12] = bomba185;tabuleiro[8][13] = bomba201;tabuleiro[8][14] = bomba217;tabuleiro[8][15] = bomba233;
tabuleiro[9][1] = bomba10;tabuleiro[9][2] = bomba26;tabuleiro[9][3] = bomba42;tabuleiro[9][4] = bomba58;tabuleiro[9][5] = bomba74;tabuleiro[9][6] = bomba90;tabuleiro[9][7] = bomba106;tabuleiro[9][8] = bomba122;tabuleiro[9][9] = bomba138;tabuleiro[9][10] = bomba154;tabuleiro[9][11] = bomba170;tabuleiro[9][12] = bomba186;tabuleiro[9][13] = bomba202;tabuleiro[9][14] = bomba218;tabuleiro[9][15] = bomba234;
tabuleiro[10][1] = bomba11;tabuleiro[10][2] = bomba27;tabuleiro[10][3] = bomba43;tabuleiro[10][4] = bomba59;tabuleiro[10][5] = bomba75;tabuleiro[10][6] = bomba91;tabuleiro[10][7] = bomba107;tabuleiro[10][8] = bomba123;tabuleiro[10][9] = bomba139;tabuleiro[10][10] = bomba155;tabuleiro[10][11] = bomba171;tabuleiro[10][12] = bomba187;tabuleiro[10][13] = bomba203;tabuleiro[10][14] = bomba219;tabuleiro[10][15] = bomba235;
tabuleiro[11][1] = bomba12;tabuleiro[11][2] = bomba28;tabuleiro[11][3] = bomba44;tabuleiro[11][4] = bomba60;tabuleiro[11][5] = bomba76;tabuleiro[11][6] = bomba92;tabuleiro[11][7] = bomba108;tabuleiro[11][8] = bomba124;tabuleiro[11][9] = bomba140;tabuleiro[11][10] = bomba156;tabuleiro[11][11] = bomba172;tabuleiro[11][12] = bomba188;tabuleiro[11][13] = bomba204;tabuleiro[11][14] = bomba220;tabuleiro[11][15] = bomba236;
tabuleiro[12][1] = bomba13;tabuleiro[12][2] = bomba29;tabuleiro[12][3] = bomba45;tabuleiro[12][4] = bomba61;tabuleiro[12][5] = bomba77;tabuleiro[12][6] = bomba93;tabuleiro[12][7] = bomba109;tabuleiro[12][8] = bomba125;tabuleiro[12][9] = bomba141;tabuleiro[12][10] = bomba157;tabuleiro[12][11] = bomba173;tabuleiro[12][12] = bomba189;tabuleiro[12][13] = bomba205;tabuleiro[12][14] = bomba221;tabuleiro[12][15] = bomba237;                
tabuleiro[13][1] = bomba14;tabuleiro[13][2] = bomba30;tabuleiro[13][3] = bomba46;tabuleiro[13][4] = bomba62;tabuleiro[13][5] = bomba78;tabuleiro[13][6] = bomba94;tabuleiro[13][7] = bomba110;tabuleiro[13][8] = bomba126;tabuleiro[13][9] = bomba142;tabuleiro[13][10] = bomba158;tabuleiro[13][11] = bomba174;tabuleiro[13][12] = bomba190;tabuleiro[13][13] = bomba206;tabuleiro[13][14] = bomba222;tabuleiro[13][15] = bomba238;
tabuleiro[14][1] = bomba15;tabuleiro[14][2] = bomba31;tabuleiro[14][3] = bomba47;tabuleiro[14][4] = bomba63;tabuleiro[14][5] = bomba79;tabuleiro[14][6] = bomba95;tabuleiro[14][7] = bomba111;tabuleiro[14][8] = bomba127;tabuleiro[14][9] = bomba143;tabuleiro[14][10] = bomba159;tabuleiro[14][11] = bomba175;tabuleiro[14][12] = bomba191;tabuleiro[14][13] = bomba207;tabuleiro[14][14] = bomba223;tabuleiro[14][15] = bomba239;
tabuleiro[15][1] = bomba16;tabuleiro[15][2] = bomba32;tabuleiro[15][3] = bomba48;tabuleiro[15][4] = bomba64;tabuleiro[15][5] = bomba80;tabuleiro[15][6] = bomba96;tabuleiro[15][7] = bomba112;tabuleiro[15][8] = bomba128;tabuleiro[15][9] = bomba144;tabuleiro[15][10] = bomba160;tabuleiro[15][11] = bomba176;tabuleiro[15][12] = bomba192;tabuleiro[15][13] = bomba208;tabuleiro[15][14] = bomba224;tabuleiro[15][15] = bomba240;                

	


while(jogador == perdeu) {
	
	System.out.println("\n\n");
	System.out.println("------------------------------------------");
	

	System.out.print("Digite a coluna: ");
	coluna=scanner.nextInt();
	System.out.print("Digite a linha: ");
	linha=scanner.nextInt();

	if (linha > 16 || linha == 0 || coluna > 16 || coluna == 0) {
		System.out.println("Você digitou uma operação inválida");
		Tabuleiro();
	}


	
	
	if (tabuleiro[linha-1][coluna-1] == NUMERO_IDENTIFICADOR_EXPLOSAO){
		tabuleiro[linha-1][coluna-1] = NUMERO_IDENTIFICADOR_EXPLOSAO;
		imprimirTabuleiro(true);
		jogador = jogador - perdeu;
		while (jogador == 0) {
		System.out.println("Você perdeu!");
		System.out.println("Você deseja continuar a jogar?[s/n]");
		String resp = scanner.nextLine();
		if(!resp.equals("n")&&!resp.equals("s")&&!resp.equals("S")&&!resp.equals("N")){
		} if (resp.equals("n")||resp.equals("N")) {
			jogador = jogador + perdeu + perdeu;
		} if (resp.equals("s")||resp.equals("S")) {
			System.out.println("Bem vindo ao campo minado!");
			System.out.println("Para jogar é simples, temos 16 blocos,");
			System.out.println("objetivo do jogo é não ser destruido pelas minas!");
			Tabuleiro();
		}
		}
	}

	else if (tabuleiro[linha-1][coluna-1] != NUMERO_IDENTIFICADOR_MARCADA) {
			tabuleiro[linha-1][coluna-1] = NUMERO_IDENTIFICADOR_MARCADA;
			
		}

		else if (tabuleiro[linha-1][coluna-1] == NUMERO_IDENTIFICADOR_MARCADA)
			System.out.println("Ops !!! você já escolheu essa posição");
	 
		System.out.println("\n");      

		
		imprimirTabuleiro(false);
		
		
		
		
		

}
return tabuleiro;
}

	private static void imprimirLinhaNumericaVertical(int linhaNumericaVertical) {
		
		System.out.println("|" + " " + linhaNumericaVertical++);

		
	}

	private static void linhaHorizontal() {
		System.out.println(
				"    1     2      3      4      5      6      7      8      9     10     11     12     13     14     15     16   | Linhas");
		System.out.println(
				" ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ ______");
	}



private static void imprimirTabuleiro(boolean mostrarAsBombas) {
    int linhaNumericaVertical = 0;

    linhaHorizontal();
    for (int i = 0; i < tabuleiro.length; i++) {

        linhaNumericaVertical++;
        for (int j = 0; j < tabuleiro[i].length; j++) {

        	
        	
        	

            if (tabuleiro[i][j] == NUMERO_IDENTIFICADOR_MARCADA) {
                System.out.print("|" + "__X___");
            } else if(tabuleiro[i][j] == NUMERO_IDENTIFICADOR_EXPLOSAO && (mostrarAsBombas == true)) {
                System.out.print("|" + "__B___");
            }else {
                System.out.print("|" + "______");
            }


           

        }
        imprimirLinhaNumericaVertical(linhaNumericaVertical);
    }
}
}




