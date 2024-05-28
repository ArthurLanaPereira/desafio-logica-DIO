package Heroi;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu herói:");
        String nome = leitura.next();
        
        System.out.println("Digite o xp do seu herói:");
        int xp = leitura.nextInt();

        int[] limitesXp = {0, 1001, 2001, 5001, 7001, 8001, 9001, 10001};
        String[] elos = {"Ferro", "Bronze", "Prata", "Ouro", "Platina", "Ascendente", "Imortal", "Radiante"};

        String elo = "Desconhecido";
        
        for (int i = 0; i < limitesXp.length; i++) {
            if (xp < limitesXp[i]) {
                break;
            }
            elo = elos[i];
        }

        System.out.println("O herói de nome: " + nome + " está no nível: " + elo);
        
        leitura.close();
    }
}
