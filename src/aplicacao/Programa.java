package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Fisica;
import entidades.Juridica;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.println("Informe o número de colaboradores: ");
		int n = sc.nextInt();
		
		for(int i = 11; i<=n; i++) {
		System.out.println("Colaborador física ou jurídica?");
		char tipo = sc.next().charAt(0);

		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Renda Anual: ");
		Double rendaAnual = sc.nextDouble();

		if (tipo == 'f') {
			System.out.println("Gastos com Saúde: ");
			Double gastoSaude = sc.nextDouble();
			list.add(new Fisica(nome, rendaAnual, gastoSaude));

		} else if (tipo == 'j') {
			System.out.println("Número de Colaboradores: ");
			int numeroColaboradores = sc.nextInt();
			list.add(new Juridica(nome, rendaAnual, numeroColaboradores));

		} else {
			System.out.println("Colaborador inválido");
		}
		
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS= ");
		for(Contribuinte l : list) {
			System.out.println(l.imposto());	
		}

		sc.close();

	}

}
