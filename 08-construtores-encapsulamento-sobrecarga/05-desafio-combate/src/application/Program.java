package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Champion champ1, champ2;
		
		/* Champion 1 */
		System.out.println("Digite os dados do primeiro campeão: ");
				
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();

		champ1 = new Champion(name, life, attack, armor);
		
		/* Champion 2 */
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		
		
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		champ2 = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= turns; i++) {
			
			if(champ1.life > 0 && champ2.life > 0) {
				System.out.printf("Resultado do turno %d:%n", i);
				
				champ1.takeDamage(champ2.attack);
				System.out.println(champ1.status());
				
				champ2.takeDamage(champ1.attack);
				System.out.println(champ2.status());
				System.out.println();
			}	
			else {
				System.out.println("FIM DO COMBATE");
				i = turns;
			}
		}

		sc.close();
	}

}
