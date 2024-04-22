package Sorte;

import java.util.Scanner;
import entidades.Sorteando;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <String> list = new ArrayList<>();
		
		System.out.println("********Sorteador de Grupos********");
		System.out.println("Bem vindo ao sistema de sorteador de grupos !");
		System.out.println("Digite o número de membros em cada grupo: ");
		int quantidade = sc.nextInt();
		System.out.println("Digite o nome das pessoas: (para encerrar escreva *Fim*) ");
		while(true) {
			String membros = sc.next();
			Sorteando sorte = new Sorteando(quantidade, membros);
			if (membros.equalsIgnoreCase("fim")) {
				break;
			}
			else {
				list.add(sorte.getMembros());
				System.out.println("Nomes cadastrados até o momento : " + list.size());
			}
		}
		System.out.println("Nomes cadastrados: ");
		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("-------------------------------");
		Collections.shuffle(list);
		 while (!list.isEmpty()) {
	            System.out.println("Novo Grupo:");
	            for (int i = 0; i < quantidade && !list.isEmpty(); i++) {
	                System.out.println(list.remove(0));
	            }
	            System.out.println("---------------");
	        }
	sc.close();
	}		
}
