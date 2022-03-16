package exercicioentrega;

import java.util.Scanner;

public class Agenciamenu {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Destino destino = new Destino();
		int alternativa;

		Scanner scan = new Scanner(System.in);

		do { // Faça
			System.out.println("Agência de Viagens - Menu");
			System.out.println(
					"Digite 1 para cadastro de cliente, 2 para cadastro de destino, 3 para consulta de dados e 4 para encerrar o Programa");
			alternativa = scan.nextInt();
			switch (alternativa) {
			case 1:
				cliente.cadastrar();
				System.out.println("Os dados foram inseridos com sucesso");
				break;
			case 2:
				destino.cadastrar();
				System.out.println("Os dados foram inseridos com sucesso");
				break;
			case 3:
				cliente.consultar();
				destino.consultar();
				System.out.println("Os dados foram conferidos com sucesso");
				break;
			case 4:
				break;

			default:
				System.out.println("Alternativa inválida");
				break;
			}
		} while (alternativa != 4);
		
		System.out.println("Programa encerrado");

	}// enquanto

}
