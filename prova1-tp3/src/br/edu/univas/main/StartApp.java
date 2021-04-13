package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Carro;
import br.edu.univas.vo.Competidor;
import br.edu.univas.vo.Moto;
import br.edu.univas.vo.Motor;
import br.edu.univas.vo.Veiculo;

public class StartApp {
	private static ArrayList<Competidor> competidores = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.println("Cadastro do competidor " + (i + 1));
			Competidor competidor = new Competidor();
			System.out.println("Informe o apelido: ");
			competidor.setApelido(scanner.nextLine());

			System.out.println("Digite 1 para carro e 2 para moto: ");
			int choice = readInt();

			if (choice == 1) {
				Carro carro = new Carro();
				competidor.setVeiculo(carro);
				competidores.add(competidor);

			}

			else if (choice == 2) {
				Moto moto = new Moto();
				competidor.setVeiculo(moto);
				competidores.add(competidor);

			}

		}

		corrida();
		mostrarVencedor();

	}

	public static void corrida() {
		for (int i = 0; i < 10; i++) {

			Random random0 = new Random();
			int idx0 = random0.nextInt((20 - 5) + 1) + 5;
			competidores.get(0).getVeiculo().acelerar(idx0);

			Random random1 = new Random();
			int idx1 = random1.nextInt((20 - 5) + 1) + 5;
			competidores.get(1).getVeiculo().acelerar(idx1);

			Random random2 = new Random();
			int idx2 = random2.nextInt((20 - 5) + 1) + 5;
			competidores.get(2).getVeiculo().acelerar(idx2);

			Random random3 = new Random();
			int idx3 = random3.nextInt((20 - 5) + 1) + 5;
			competidores.get(3).getVeiculo().acelerar(idx3);

			Random random4 = new Random();
			int idx4 = random4.nextInt((20 - 5) + 1) + 5;
			competidores.get(4).getVeiculo().acelerar(idx4);

		}

	}

	public static void mostrarVencedor() {

		
		
		
	}

	private static int readInt() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}

}
