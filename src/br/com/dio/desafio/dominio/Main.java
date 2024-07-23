package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso de Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("curso Js");
		curso2.setDescricao("descrição curso de Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate .now());

		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
	}

}
