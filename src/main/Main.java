package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>() {	{
				add(new Funcionario("João", 1903.98F));
				add(new Funcionario("Aline", 2826.65F));
				add(new Funcionario("Marcela", 3751.11F));
				add(new Funcionario("Maycon", 500.0F));
		}};
		
		
		List<String> funcionariosQuePagam = funcionarios.stream()
				.filter(f -> f.getSalario() > 1903.98F)
				.map(f -> f.getNome())
				.collect(Collectors.toList());
		
		
		funcionariosQuePagam.forEach(f -> System.out.println(f));
	}
}
