package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
				
		int signo;
		
		System.out.println("==================================");
		System.out.println("        Hor�scopo do dia          ");
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("    1 - Capric�rnio               ");
		System.out.println("    2 - Aqu�rio                   ");
		System.out.println("    3 - Peixes                    ");
		System.out.println("    4 - �ries                     ");
		System.out.println("    5 - Touro                     ");
		System.out.println("    6 - G�meos                    ");
		System.out.println("    7 - C�ncer                    ");
		System.out.println("    8 - Le�o                      ");
		System.out.println("    9 - Virgem                    ");
		System.out.println("    10 - Libra                    ");
		System.out.println("    11 - Escorpi�o                ");
		System.out.println("    12 - Sagit�rio                ");
		System.out.println("                                  ");
		System.out.println("==================================");
		System.out.println("Digite a op��o desejada: ");
		signo = leia.nextInt();
		
		switch(signo) {
		
		case 1:
			System.out.println("Capric�rnio: Trabalhe com disciplina; metas realistas e passos consistentes trar�o progresso vis�vel.");
			break;
		
		case 2:
			System.out.println("Aqu�rio: Inove com colabora��o � compartilhe suas ideias e ou�a perspectivas diferentes para evoluir.");
			break;
		
		case 3:
			System.out.println("Peixes: Confie na intui��o, mas mantenha os p�s no ch�o; aten��o aos detalhes evitar� confus�es.");
			break;
			
		case 4:
			System.out.println("�ries: Hoje concentre-se em a��es r�pidas e ponderadas � priorize uma tarefa importante e avance com confian�a.");
			break;
		
		case 5:
			System.out.println("Touro: Evite gastos impulsivos; organize suas finan�as e desfrute pequenos prazeres com modera��o.");
			break;
			
		case 6:
			System.out.println("G�meos: Comunique-se com clareza � uma conversa aberta pode esclarecer mal-entendidos e abrir oportunidades.");
			break;
			
		case 7:
			System.out.println("C�ncer: Cuide do seu bem-estar emocional; reserve tempo para descansar e fortalecer v�nculos familiares.");
			break;
				
		case 8:
			System.out.println("Le�o: Mostre suas ideias com seguran�a, mas escute antes de reagir � equil�brio trar� reconhecimento.");
			break;
		
		case 9:
			System.out.println("Virgem: Foque na organiza��o: revisar prioridades e planejar pequenas a��es aumentar� sua produtividade.");
			break;
			
		case 10:
			System.out.println("Libra: Busque harmonia nas rela��es hoje � proponha um acordo justo e seja flex�vel nas negocia��es.");	
			break;
			
		case 11:
			System.out.println("Escorpi�o: Intensidade pode ser positiva se bem dirigida � transforme emo��es em determina��o pr�tica.");
			break;
				
		case 12:
			System.out.println("Sagit�rio: Abrace a curiosidade, mas finalize compromissos pendentes antes de come�ar algo novo.");		
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		leia.close();
	}

}
