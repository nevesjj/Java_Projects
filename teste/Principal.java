package teste;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Camisa cs = new Camisa();
		Calca ca = new Calca();
		Tenis ts = new Tenis();
		int opcao = 0;
		double total;
		while (opcao <= 3) {
			System.out.println("********Digite o número do que você vendeu: *********\n"
					+"1. Camisa\n"
					+"2. Calça\n"
					+"3. Tênis\n"
					+"4. Sair ");
			opcao = sc.nextInt();
			total = cs.valor() + ca.valor1() + ts.valor2();
			if (opcao == 1) {
				System.out.println("Digite quantas camisetas você vendeu : ");
				cs.setQuant(sc.nextInt());
				System.out.println("o valor da sua comissão foi : R$"+ cs.valor());
			}
			else if (opcao == 2) {
				System.out.println("Digite quantas Calças você vendeu : ");
				ca.setQuant (sc.nextInt());
				System.out.println("o valor da sua comissão foi : R$"+ ca.valor1());
				
			}
			else if(opcao == 3) {
				System.out.println("Digite quantos Tênis você vendeu : ");
				ts.setQuant (sc.nextInt());
				System.out.println("o valor da sua comissão foi : R$" +ts.valor2());
				
			}
			else if (opcao == 4) {
				System.out.println("Você encerrou o sistema");
				System.out.println("O valor da sua comissão total foi: R$"+total);
			
			}
			
		}
			sc.close();
	}
	
	
}
