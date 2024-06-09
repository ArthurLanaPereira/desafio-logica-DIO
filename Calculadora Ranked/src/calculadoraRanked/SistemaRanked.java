package calculadoraRanked;
import java.util.Scanner;

public class SistemaRanked {
	
	static int vitorias;
	static int derrotas;
	public static int saldoVitorias;
	public static String rank;
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.printf("Informe o número de vitórias:\n");
		vitorias = ler.nextInt();
		System.out.printf("Informe o número de derrotas:\n");
		derrotas = ler.nextInt();
		
		resultadosPartidas(vitorias, derrotas);
	}
	
	public static void resultadosPartidas(int vitorias, int derrotas) {
		
		saldoVitorias = vitorias - derrotas;
	
		if(saldoVitorias <= 10) 
		{
			rank = "Ferro";
			System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
		}
			else if(saldoVitorias >= 11 && saldoVitorias < 21) 
			{
				rank = "Bronze";
				System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
			
			}
				else if(saldoVitorias >= 21 && saldoVitorias < 51) 
				{
				rank = "Prata";
				System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
			
				}
					else if(saldoVitorias >= 51 && saldoVitorias <= 80) 
					{
					rank = "Ouro";
					System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
				
					}
						else if(saldoVitorias >= 81 && saldoVitorias <= 90) 
						{
						rank = "Diamante";
						System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
					
						}
							else if(saldoVitorias >= 91 && saldoVitorias <= 100) 
							{
							rank = "Lendário";
							System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
						
							}else {
								rank = "Imortal";
								System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rank);
							}
		
	}
}
